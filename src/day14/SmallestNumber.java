package day14;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int min = arr[0];
		for(int a : arr) {
			if(min>a) {
				min = a;
			}
		}
		System.out.println(min);
	}

}
