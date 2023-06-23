interface Area
{
    static final double PI = 3.14;
    float compute(float x, float y);
}

class Rectangle implements Area
{
    public float compute(float x, float y)
    {
        return (x*y);
    }
}

class Circle implements Area
{
    public float compute(float x, float y)
    {
        return (float)PI*x*x;
    }
}

public class interfaceTest {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        System.out.println("Area of Rectangle: "+r.compute(10, 20));
        System.out.println("Area of Circle: "+c.compute(10, 0));
    }    
}