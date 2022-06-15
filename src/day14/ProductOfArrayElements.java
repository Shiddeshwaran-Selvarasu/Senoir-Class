package day14;

import java.util.Scanner;

public class ProductOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		long sum = 0;
		
		for(int a: arr) {
			sum += a;
		}
		
		long product = 1;
		
		for(int a: arr) {
			product *= a;
		}
		
		System.out.println(sum);
		System.out.println(product);
	}

}
