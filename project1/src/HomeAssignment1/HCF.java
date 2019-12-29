package Assignments;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2,counter;
        num1=scanner.nextInt();
        num2=scanner.nextInt();

        if (num1>num2){
            counter=num1;
        }else {
            counter=num2;
        }

//       counter= (num1>num2)?num1:(num1<num2)?num2:0;
        counter= (num1>num2)?num1:num2;
        int hcf=0;
        for (int i=1;i<=counter;i++){
            if (num1%i==0 && num2%i==0){
                hcf=i;
            }
        }

        System.out.println("HCF is "+hcf);


    }
}
