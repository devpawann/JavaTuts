package Day2;

import java.util.Scanner;

public class Floydstraingle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();
        int count=1;
        for (int i=1;i<=num;i++){
           for (int j=1;j<=i;j++){
               System.out.print(count+"\t");
               count++;

               if (i==j){
                   System.out.print("\n");
               }

           }

        }
    }
}
