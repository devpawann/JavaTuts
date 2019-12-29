package Assignments;

public class Duplicate {
    public static void main(String[] args) {
        String name=String.valueOf("Hello world");
        char arr[]=name.toCharArray();
        for (int i=0;i<arr.length;i++){
            char checkChar=arr[i];
            for (int j=0;j<arr.length;j++){
                if (i!=j){
                    if (checkChar==arr[j]){
                        System.out.println(checkChar+" is repeated");
                        break;
                    }
                }

            }
        }
    }
}
