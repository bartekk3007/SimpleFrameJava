import javax.swing.*;

public class SimpleFrame extends JFrame
{
    public SimpleFrame()
    {
        add(new MyComponent());
        pack();
    }
}