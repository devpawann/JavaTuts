import java.util.Scanner;

public class Calculator {
    private int x,y;

    Calculator(int a,int b){
        this.x=a;
        this.y=b;
    }


    public void add(){
        System.out.println("Sum of "+x+" and "+y+" is = "+(x+y));

    }
    public void subt(){
        System.out.println("Difference of "+x+" and "+y+" is = "+(x-y));

    }
    public void mul()
    {
        System.out.println("Product of "+x+" and "+y+" is = "+(x*y));
    }
    public void div()
    {
        System.out.println("Division of "+x+" and "+y+" is = "+(x/y));

    }

    public static void main(String[] args){
        String ch;
        do {
        System.out.println("1.Add \n 2.Subtract\n 3.Multiply\n 4.Division \n 5.Exit \n");
        Scanner scanner=new Scanner(System.in);
        int choice=0, num1=0, num2=0;
        try {
            choice = scanner.nextInt();

            System.out.println("Enter two numbers");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }


        catch(Exception e){
            e.getMessage();
            }
        System.out.print("hello");
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

                case 5:
                    System.exit(0);
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
