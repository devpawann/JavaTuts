package Inheritance;

public class Author extends Book {
    String name;
    String address;

    Author(String name,String address){
    this.name=name;
    this.address=address;
//    copy.setTitle("java");
//    copy.setPrice(1000);
//    copy.display();

    }
    void display(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {

        //Book book=new Book();
        Author author=new Author("Dummy","Kathmandu");
        author.display();

    }
}
