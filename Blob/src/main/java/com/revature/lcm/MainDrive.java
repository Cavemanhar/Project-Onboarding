package com.revature.lcm;

import java.math.BigInteger;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {5, 4, 6, 46, 54, 12, 13, 17};
		int[] array2 = new int[] {46, 54, 466, 544};
		int[] array3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] array4 = new int[] {13, 6, 17, 18, 19, 20, 37};
		System.out.println(lcmOfArray(array));;//  2744820

		System.out.println(lcmOfArray(array2));//  78712992
		System.out.println(lcmOfArray(array3));//  2520
		System.out.println(lcmOfArray(array4));// 27965340

		System.out.println(lookAndSay(BigInteger.valueOf(Long.parseLong("1213200012171979"))));
		System.out.println(lookAndSay(BigInteger.valueOf(54544666)));
		System.out.println(lookAndSay(BigInteger.valueOf(95)));
		System.out.println(lookAndSay(BigInteger.valueOf(Long.parseLong("1213141516171819"))));
		System.out.println(lookAndSay(BigInteger.valueOf(120520)));
		System.out.println(lookAndSay(BigInteger.valueOf(231)));
		
	}
	
	public static int lcmOfArray(int[] arr) {
		int max = 0;
		int holder =0;
		boolean status = false;
		for(int j : arr) {
//			System.out.println(j);
			if(j > max) {
				max = j;
			}
			
			holder = max * arr[0];
			while(!status) {
				for( int i= 0; i< arr.length; i++) {
					if(holder%arr[i] !=0) {
						break;
					}else if(i == arr.length-1) {
						status=true;
						return holder;
					}
				}
				holder += max;
			}
        
      
		}
		return holder;
	}
	
	
	public static BigInteger lookAndSay( BigInteger num) {
		 String number = num.toString();
		 System.out.println(num);
	        String newNum = "";
	        if(number.length()%2==1){
	            return BigInteger.valueOf(-1);
	        }
	        for(int i = 0; i<number.length()-1; i+=2){
	            for(int j = Integer.parseInt(Character.toString(number.charAt(i))) ; j>0 ; j--){
	                newNum += Character.toString(number.charAt(i+1));
	                System.out.println(newNum);
	            }
	        }
	        return new BigInteger(newNum);
	}
}
