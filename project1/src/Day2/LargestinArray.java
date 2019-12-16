package Day2;

import java.util.Scanner;

public class LargestinArray {
    public static void main(String[] args) {
        System.out.println("enter 5 number");
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[5];
        int arr1[]=new int[5];
        try{
        for (int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
        }
        }catch (Exception e){
            System.out.println("Invalid input \n enter again");
            scanner.close();
        }
        finally {

            Scanner scanner1=new Scanner(System.in);
            System.out.println("Enter number");
            for (int i = 0; i < 5; i++) {

                arr1[i] = scanner1.nextInt();
            }
        }
        findLarge(arr);


    }

    private static void findLarge(int[] arr) {
        int max=arr[0],min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max is"+max+"min is"+min);
    }


}
