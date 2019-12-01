public class Conditional {
    public static void main(String[] args){
        int a=25,b=10,c=99;
        int d=(a>b && a>c)?a:(b>a && b>c)?b:(c>a && c>b)?c:0;
       // int c=(a>b)?a:b;
        System.out.println(d);
    }


}
