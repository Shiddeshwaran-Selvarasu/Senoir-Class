package day16;

import java.util.Scanner;

public class StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char cc[] = str.toCharArray();
		sc.close();

		int upperCase = 0;
		int lowerCase = 0;
		int specialCharacter = 0;
		int number = 0;
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
//				c++;
//			}
//			if(ch>='0'&&ch<='9')
//				number++;
//			if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*')
//				specialCharacter++;
//		}
		
		for(char c : cc) {
			if (Character.isDigit(c)) {
				number++;
			} else if(Character.isUpperCase(c)) {
				upperCase++;
			} else if(Character.isLowerCase(c)) {
				lowerCase++;
			} else {
				specialCharacter++;
			}
		}
		
		System.out.println("UpperCase: "+upperCase+"\nLowerCase: "+lowerCase+"\nNumber: "+number+"\nSpecial Character: "+specialCharacter);
	 }
}
