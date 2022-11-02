package pkg1;
//child class
public class subject extends student {
    public subject()
    {
        super(); // by using super keyword we can called the parent class constructor otherwise its by default called.
    }
    public void mul()
    {
        System.out.println("multiplication");
    }
    public void div()
    {
        System.out.println("Division");
    }
}
