//not working
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
Object Swing extends App
{
    val TextArea= new JTextArea;
    textArea.setText("Hello world");
    val scrollPane= new JScrollPane(textArea);
    val frame= new JFrame("hello swing");
    frame.getContentPane.add(scrollPane,BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(600,400));
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}
