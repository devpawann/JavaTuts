package Assignments;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
//Bubble sorting of characters
        String  name=String.valueOf("pawan");
        char temp;
        char[] arr =name.toCharArray();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 to ascending 2 for descending");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                for (int i=0;i<name.length();i++){
                    for (int j=0;j<name.length()-1-i;j++){
                        if (arr[j]>arr[j+1]){
                            temp=arr[j+1];
                            arr[j+1]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
                System.out.println("Ascending");
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
                break;

            case 2:
                for (int i=0;i<name.length();i++){
                    for (int j=0;j<name.length()-1-i;j++){
                        if (arr[j]<arr[j+1]){
                            temp=arr[j+1];
                            arr[j+1]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
                System.out.println("Descending");
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
        }

    }
}
