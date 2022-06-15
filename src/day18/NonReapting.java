package day18;

import java.util.ArrayList;
import java.util.Scanner;

public class NonReapting {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		int count[] = new int[++max];
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(count[arr[i]]==1){
				System.out.println(arr[i]);
				break;
			}
		}
		
//		System.out.println("-");
		
	}
}
