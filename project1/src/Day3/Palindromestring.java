package Day3;

public class LearnString {
    public static void main(String[] args) {
        String a="dad";
        String b="";

        for(int i=(a.length()-1);i>=0;i--){
           b=b+a.charAt(i);
        }
       // System.out.println(b);
        if (a.equalsIgnoreCase(b)){
            System.out.println(a+" is Palindrome");
        }else {
            System.out.println(a+" is not Palindrome");
        }

    }
}
