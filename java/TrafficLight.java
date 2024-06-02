import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {
    private JRadioButton stop = new JRadioButton("Stop");
    private JRadioButton ready = new JRadioButton("Ready");
    private JRadioButton go = new JRadioButton("Go");
    private ButtonGroup lg = new ButtonGroup();
    private JLabel l = new JLabel();
    public TrafficLight() {
        setLayout(new GridLayout(4, 1));
        lg.add(stop);
        lg.add(ready);
        lg.add(go);
        stop.addActionListener(this);
        ready.addActionListener(this);
        go.addActionListener(this);
        add(stop);
        add(ready);
        add(go);
        add(l);
        l.setText("");
        setSize(200, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stop) {
            l.setText("Stop");
            l.setForeground(Color.RED);
        } else if (e.getSource() == ready) {
            l.setText("Ready");
            l.setForeground(Color.YELLOW);
        } else if (e.getSource() == go) {
            l.setText("Go");
            l.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
