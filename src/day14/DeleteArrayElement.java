package day14;

import java.util.Scanner;

public class DeleteArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = sc.nextInt();
		sc.close();
		if(!(index>=0&&index<n)) {
			System.err.println("Index is not vaild....");
			System.exit(0);
		}
		
		for(int i = index; i < n-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[n-1] = 0;
				
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
}