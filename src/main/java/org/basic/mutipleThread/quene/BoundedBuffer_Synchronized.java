package org.basic.mutipleThread.quene;

public class BoundedBuffer_Synchronized {
	private Object[] items = new Object[5];
	private Object notEmpty = new Object();
	private Object notFull = new Object();
	int count, putidx, takeidx;

	public void put(Object obj) throws InterruptedException {
		synchronized (notFull) {
			while (count == items.length) {
				System.out.println("quene is full, waiting");
				notFull.wait();
			}
		}
		items[putidx] = obj;
		if (++putidx == items.length) {
			putidx = 0;
		}
		count++;
		synchronized (notEmpty) {
			System.out.println("quene size:" + count + " put item is:" + obj);
			notEmpty.notify();
		}
		
		
	}

	public Object take() throws InterruptedException {
		synchronized (notEmpty) {
			while (count == 0) { // 啥也没有呢 取啥
				System.out.println("quene is empty, waiting");
				notEmpty.wait();
			}
		}
		Object x = items[takeidx];
		if (++takeidx == items.length) {
			takeidx = 0;
		}
		count--;
		synchronized (notFull) {
			System.out.println("quene size:" + count + " take item is:" + x);
			notFull.notify();
		}
		
		return x;
	}

	public static void main(String[] args) throws InterruptedException {
		final BoundedBuffer_Synchronized bb = new BoundedBuffer_Synchronized();

		
		/*for(int i = 0; i < 10; i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
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
						Thread.sleep(2000);
						bb.take();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
				}
				
			}).start();
		}*/


		
		//bb.take();
		//bb.take();
	}
}