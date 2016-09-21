package com.kevin.test;

public class MultiplicativeTable {

	public static void main(String args[]) {
		//multiplicative_table(4, 3);
		multiplicativeTable(10, 10);
	}

	public static void multiplicative_table(int x, int y) {
		multiplicative_table_x(y, x);
	}

	public static void multiplicative_table_y(int x, int y) {
		if (y != 1) {
			multiplicative_table_y(x, y - 1);
		}
		System.out.printf("%4d ", x * y);
	}

	public static void multiplicative_table_x(int x, int y) {
		if (x != 1) {
			multiplicative_table_x(x - 1, y);
		}
		multiplicative_table_y(x, y);
		System.out.printf("\n");

	}
	
	public static void xx(int x, int y) {
		for (int i = 0; i < y; i++) {// the line
			for (int j = 0; j < x; j++) {// the column
				if(i == 0){
					System.out.printf("%4d", (i+1)*j);
				}else{
					if(j == 0){
						System.out.printf("%4d", i);
					}else{
						System.out.printf("%4d", i*j);
					}
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void yy(int x, int y){
		for(int i = 0; i < x; i++){
			if(i == 0){
				System.out.printf("%4d", i);
				continue;
			}else{
				for(int j = 1; j <= y; j++){
					if(i == 1){
						System.out.printf("%4d", i * j);
					}else{
						if(j == 1){
							System.out.printf("%4d", j);
						}
						System.out.printf("%4d", (i-1) * j);
					}
				}
				System.out.print("\n");
			}
		}
	}
	
	public static void multiplicativeTable(int x, int y){
		for(int i = 0; i < y; i++){
			for(int j = 0; j < x; j++){
				if(i == 0){
					System.out.printf("%4d", (i+1)*j);
				}else{
					if(j == 0){
						System.out.printf("%4d", i);
					}else{
						System.out.printf("%4d", i*j);
					}
				}
			}
			System.out.print("\n");
		}
	}

}
