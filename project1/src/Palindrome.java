import java.util.Scanner;

//Array in java
//1.Palindrome  done
//2.Prime number done
//3.Whole
//4.Whole Number check
//5.Even and odd number done
//6.Check the smallest out of 3 number and 2 number done
//7.Check the largest out of 3 number and 2 number done
//Bitwise operator

public class Palindrome {
    public static void main(String[] args){

       // int num = 11011;
        System.out.println("Enter number");
        Scanner enter=new Scanner(System.in);
        int num=enter.nextInt();
        int temp=num;
        int sum=0,rem;

        do {
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }while (num!=0);
        System.out.println(sum);
        if (temp==sum){
            System.out.println("Yes "+temp+" is a palindrome");
        }else {
            System.out.println("No "+temp+" is not a palindrome");
        }
    }
}
