package Inheritance;

public class Animal {
   String name;
   int age;

   Animal(){}

   Animal(String name,int age){
       this.name=name;
       this.age=age;
   }
   void display(){
       System.out.println("Class:Animal:::Name of animal is: "+name+" and age is "+age);
   }
}
class Dog extends Animal{
    String foodtype;

    Dog(){ }
    Dog(String name,int age,String foodtype){
        super(name,age);
        this.foodtype=foodtype;
    }
    void display(){
        System.out.println("Class:Dog:::Name of animal is: "+name+" and age is "+age+" foodtype is "+foodtype);
    }

}

class Pamerian extends Dog{
    int size;
    Pamerian(){}
    Pamerian(String name,int age,String foodtype,int size){
        super(name,age,foodtype);
        this.size=size;
    }
    void display(){
        System.out.println("Class:Pamerian:::Name of animal is: "+name+" and age is "+age+"foodtype is "+foodtype+" size is"+size);
    }

    public static void main(String[] args) {
        Pamerian pamerian=new Pamerian("Bob",10,"Pedigree",10);
        pamerian.display();

    }
}

