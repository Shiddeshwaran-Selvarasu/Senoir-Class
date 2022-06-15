package day14;

import java.util.*;

public class ArrayElementInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		if(!(k>=0&&k<n)) {
			sc.close();
			System.err.println("Index is not vaild....");
			System.exit(0);
		}
		
		int z = sc.nextInt();
		sc.close();
		
		for(int i = n-1; i > k; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[k] = z;
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}

}
