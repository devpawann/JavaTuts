public class Oddeven {
    public static void main(String args[]) {
        int num = 10;
//        if (num % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("odd number");
//        }
        String d;
        int e=num%2;
        d=(e==0)?"even":"odd";
        System.out.println(d);
    }
}
