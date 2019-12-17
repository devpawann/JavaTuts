package Day2;

import java.util.Scanner;
import java.lang.Math;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr =new int[10];
        int sum=0;
        float mean,sd,sq_md=0f,sum_md=0f;
        System.out.println("Enter 5 number");
        for (int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            sum=sum+arr[i];
        }
        mean=sum/5f;
        for (int i=0;i<5;i++) {
            sum_md += (arr[i]-mean)*(arr[i]-mean);
        }
       sd= (float) Math.sqrt(sum_md/5);
        System.out.println(sd);




    }
}
