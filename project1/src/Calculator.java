import java.util.Scanner;

public class Calculator {
    private int x,y;

    Calculator(int a,int b){
        x=a;
        y=b;
    }


    public void add(){
        System.out.println("Sum of "+x+" and "+y+" is = "+(x+y));

    }
    public void subt(){
        System.out.println("Difference of "+x+" and "+y+" is = "+(x-y));

    }
    public void mul(){
        System.out.println("Product of "+x+" and "+y+" is = "+(x*y));
    }
    public void div(){
        System.out.println("Division of "+x+" and "+y+" is = "+(x/y));
    }

    public static void main(String[] args){
        String ch;
        do {
        System.out.println("1.Add \n 2.Subtract\n 3.Multiply\n 4.Division");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        System.out.println("Enter two numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        Calculator calculator=new Calculator(num1,num2);
            switch (choice) {
                case 1:
                    calculator.add();
                    break;
                case 2:
                    calculator.subt();
                    break;
                case 3:
                    calculator.mul();
                    break;
                case 4:
                    calculator.div();
                    break;
                default:
                    System.out.println("Enter valid number");
                    break;
            }
            System.out.println("Want to repeat again?(y/n)");
             ch=scanner.next();
        }while (ch.equals("y"));
    }
}
