import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
       //int num=10;
//        boolean flag=true;
//        for (int i=2;i<num;i++){
//            if (num%i==0){
//                flag=false;
//                break;
//            }
//        }
//        if (flag==true){
//            System.out.println("prime");
//        }else {
//            System.out.println("Composite");
//        }

//If count is 2 it is prime else not prime

        int count=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
