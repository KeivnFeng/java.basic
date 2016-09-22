package org.basic.mutipleThread.quene;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {

	final Lock lock = new ReentrantLock();
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();
	
	final Object[] items = new Object[5];
	int putptr, takeptr, count;
	
	public void put(Object x) throws InterruptedException{
		lock.lock();
		
		try{
			while(count == items.length){
				System.out.println("put quene is full, waiting");
				notFull.await();
			}
			items[putptr] = x;
			if(++putptr == items.length){
				putptr = 0;
			}
			++count;
			notEmpty.signal();
		} finally{
			lock.unlock();
		}
		System.out.println("put quene size:" + count + " put item is:" + x);
	}
	
	public Object take() throws InterruptedException{
		lock.lock();
		try{
			while(count == 0){
				System.out.println("take quene is empty, waiting");
				notEmpty.await();
			}
			Object x = items[takeptr];
			if(++takeptr == items.length){
				takeptr = 0;
			}
			--count;
			notFull.signal();
			System.out.println("take quene size:" + count + " take item is:" + x);
			return x;
		} finally{
			lock.unlock();
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		final BoundedBuffer bb = new BoundedBuffer();

		
		for(int i = 0; i < 10; i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
						bb.put(System.currentTimeMillis());

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
		
		
		for(int i = 0; i < 10; i++){
			new Thread(new Runnable(){

				@Override
				public void run() {
					try{
						Thread.sleep(1000);
						bb.take();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
				}
				
			}).start();
		}
	}
}
