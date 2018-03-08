public class HelloWorld {

    private int x;
    private int y;
    public HelloWorld()
    {
        x=10; y=20;
    }

    public int addXY(int x, int y)
    {
        this.x =x;
        this.y = y;
        return (x+y);
    }

    public static void main(String[] args)
    {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
         HelloWorld h  = new HelloWorld();
         int xy = h.addXY(2,8);
         System.out.println(xy);

    }

}