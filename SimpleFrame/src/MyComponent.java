import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MyComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        var g2 = (Graphics2D) g;
        sum(2, 3);
        var rectanlge = new Rectangle2D.Double(200, 200, 50, 50);
        g2.draw(rectanlge);
        g.drawString("Pierwszy napis", 100, 100);
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(640, 360);
    }
    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }
}