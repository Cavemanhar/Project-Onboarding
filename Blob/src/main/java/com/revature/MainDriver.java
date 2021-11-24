package com.revature;

import java.util.Arrays;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ascending("232425"));
		System.out.println(ascending("2324256"));
		System.out.println(ascending("444445"));
		
		squarePatch(0);
		squarePatch(3);
		squarePatch(5);
		squarePatch(1);
	}
	
	public static boolean ascending(String numbers) {
	boolean consecutive = false;
		
		for(int i = 0; i < numbers.length()/2; i++) {
			String currentNumberString = numbers.substring(0, i+1);
			int currentNumber = Integer.parseInt(currentNumberString);
			
			while(currentNumberString.length() < numbers.length()) {
				currentNumber++;
				currentNumberString = currentNumberString.concat(String.valueOf(currentNumber));
			}
			
			if(currentNumberString.equals(numbers)) {
				consecutive = true;
				break;
			}	
		}
		
		return consecutive;
		
	}
	
	public static void squarePatch(int integer){
		
		int[]squareArray = new int [integer];
		
		for(int i = 0; i < squareArray.length;i++) {
			squareArray[i]= integer;
		}
		System.out.println();
		System.out.print("[");
		for(int i = 0;i<squareArray.length-1;i++){
            System.out.print(Arrays.toString(squareArray) + ",");
        }
        System.out.print(Arrays.toString(squareArray) + "]");
		
		
	}

}
