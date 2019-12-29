package Assignments;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int dec;

        do {
            System.out.println("enter number to search");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            boolean isFound = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                System.out.println("Yes number found");
            } else {
                System.out.println("No not found");
            }

            System.out.println("Searcg again? 0/1");
            dec=scanner.nextInt();
        }while (dec==1);
    }
}
