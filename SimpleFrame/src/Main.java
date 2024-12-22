import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        var frame = new JFrame();
        //1536x816
        frame.setSize(1280, 720);
        frame.setTitle("Ramka");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new MyComponent());
        frame.pack();

        Point centerPoint = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        System.out.println(centerPoint.x);
        System.out.println(centerPoint.y);
    }
}