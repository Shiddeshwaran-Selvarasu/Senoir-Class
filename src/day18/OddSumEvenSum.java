package day18;

import java.util.Scanner;

public class OddSumEvenSum {
	
	public static int sum(int num, boolean isEven) {
		int sum = 0,temp;
		int rem = isEven ? 0 : 1;
		
		while(num>0){
			temp = num%10;
			if(temp%2==rem){
				sum+=temp;
			}
			num /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int evenSum = 0, oddSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			evenSum += sum(arr[i], true);
			oddSum += sum(arr[i], false);
		}
		
		System.out.println((oddSum - evenSum));		
		
	}
	
}
