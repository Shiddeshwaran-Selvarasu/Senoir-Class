package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class StringAnogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();
        scanner.close();

        ArrayList<Character> firstStringList = new ArrayList<>();
        ArrayList<Character> secondStringList = new ArrayList<>();

        for (int i = 0; i < firstString.length(); i++) {
            firstStringList.add(firstString.charAt(i));
        }

        for (int i = 0; i < secondString.length(); i++) {
            secondStringList.add(secondString.charAt(i));
        }

        for(char c: firstString.toCharArray()) {
            if(firstStringList.contains(c)&&secondStringList.contains(c)) {
                firstStringList.remove((Character)c);
                secondStringList.remove((Character)c);
            }
        }
        
        if(firstStringList.isEmpty()&&secondStringList.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
