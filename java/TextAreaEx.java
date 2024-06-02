import javax.swing.*;
public class TextAreaEx
{
    TextAreaEx()
    {
        JFrame f= new JFrame();
        JTextArea a=new JTextArea("hello");
        a.setBounds(10,20,200,200);
        f.add(a);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new TextAreaEx();
    }
}
