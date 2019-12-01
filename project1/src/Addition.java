public class Addition {
    private int a=20,b=30;
    private void sum(){
        int result=a+b;
        System.out.println(result);
    }

    private void subtraction(){
        int result=a-b;
        System.out.println(result);
    }

    public static void main(String[] args){
        Addition obj = new Addition();
        obj.sum();
        obj.subtraction();
    }
}
