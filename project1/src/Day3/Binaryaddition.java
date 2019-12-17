package Day3;

import java.util.Scanner;

public class Binaryaddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        int arr1[]=new int[8];
        int arr2[]=new int[8];
        System.out.println("Enter two number between 0 and 255");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        //Convert to binary
        findBin(num1,arr1);
        System.out.print("Binary of "+num1+" is\t");
        display(arr1);
        findBin(num2,arr2);
        System.out.print("Binary of "+num2+" is\t");
        display(arr2);

        //Perform addition
        System.out.println("sum of two number is");
        add(arr1,arr2);
    }

    private static void add(int[] a, int[] b) {
        int c=0;
        int sum[]=new int[8];
        for(int i=7;i>=0;i--){
            sum[i]=(a[i]+b[i]+c)%2;
            c=(a[i]+b[i]+c)/2;
        }
        display(sum);
    }

    private static void display(int[] arr) {
        for (int i=0;i<=7;i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }

    private static void findBin(int x, int[] arr) {
        for(int i=7;i>=0;i--){
            arr[i]=x%2;
            x=x/2;
        }
    }


}
