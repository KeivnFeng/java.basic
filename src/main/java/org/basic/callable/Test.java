package org.basic.callable;

public class Test {
	
	public static void insertSort(int[] a, IntCompare cmp){
		if(a != null){
			for(int i = 1; i < a.length; i++){
				int temp = a[i], j = i;
				if(cmp.cmp(a[j-1], temp) == 1){
					while(j >= 1 && cmp.cmp(a[j - 1], temp) == 1){
						a[j] = a[j - 1];
						j--;
					}
				}
				a[j] = temp;
				
			}
		}
	}
	
	public static void main(String args[]){
		int[] array1 = {7,3,19,40,4,7,1};
		insertSort(array1, new Cmpl());
		int[] array2 = {7,3,19,40,4,7,1};
		insertSort(array2, new Cmp2());
	}

}
