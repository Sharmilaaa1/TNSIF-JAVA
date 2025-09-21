package com.tnsif.arrays;
public class jagged {
	public static void main(String[]args) {
	int[][] jagged = new int[4][4];
        jagged[0] = new int[3]; 
        jagged[1] = new int[2]; 
        jagged[2] = new int[4];  
        jagged[3] = new int[1];  
        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
            	jagged[i][j] = (int)(Math.random()*10);
            }
        }
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j <jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
