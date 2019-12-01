public class Smallestamong3 {
    public static void main(String[] args){
        int a=0,b=4,c=22;
        int d=(a<b && a<c)?a:(b<a && b<c)?b:(c<a && c<b)?c:0;
        System.out.println("Smallest among "+a+","+b+" and "+c+" is "+d);
    }
}
