package Inheritance;

public abstract class Book {
    float price;
    String title;

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    abstract void display();
//    {
//        System.out.println(price+"  "+title);
//    }
}


