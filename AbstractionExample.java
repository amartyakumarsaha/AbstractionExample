abstract class Shape{
  abstract void area();
}
class Circle extends Shape{
    float radius;
    public Circle(float radius)
    {
        this.radius=radius;
    }
    @Override
    void area()
    {
        System.out.println(3.14*radius*radius); 
    }
}
class Rectangle extends Shape{
    float length,breath;
    public Rectangle(float length,float breath)
    {
        this.length=length;
        this.breath=breath;
    }
    @Override
    void area()
    {
        System.out.println(length*breath);
    }   
}
public class AbstractionExample {
    public static void main(String args[])
    {
        Circle c=new Circle(2.54f);
        c.area();
        Rectangle r=new Rectangle(4.34f,2.78f);
        r.area();
    }
}
