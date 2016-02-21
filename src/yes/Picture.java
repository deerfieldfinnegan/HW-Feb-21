package yes;


/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  (your name)
 * @version (the date)
 */
public class Picture
{
    private  Square wall;
    private Square window;
    private Triangle roof;
    private  Circle sun;
    private Square window1;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        window1= new Square();
        sun = new Circle();
        wall.makeVisible();
        window.makeVisible();
        window1.makeVisible();
        roof.makeVisible();
        sun.makeVisible();
        wall.changeSize(100);
        wall.moveVertical(80);
        sun.changeColor("yellow");
        sun.changeSize(60);
        sun.moveVertical(-10);
        sun.moveHorizontal(180);
        window1.moveVertical(100);
        window1.moveHorizontal(60);
        window1.changeColor("black");
        window.moveVertical(100);
        window.moveHorizontal(20);
        window.changeColor("black");
        roof.changeSize(50, 140);
        roof.moveVertical(70);
        roof.moveHorizontal(60);
    }
    
    public static void main (String[] args) {
        Picture p = new Picture();
        p.draw();
        p.move();
        
        
        
        
    }
    
    /**
     * Draw this picture.
     */
    public void draw()
    {
        
    }
    
    /**
     * Move this picture.
     */
    public void move()
    {
     
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}