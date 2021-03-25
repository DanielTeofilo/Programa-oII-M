package layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout03 extends JFrame {
    
    public Layout03(){
        setTitle("Aula 05 - BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(590, 350);
        setVisible(true);
        setLayout(new BorderLayout());
        
        JButton button = new JButton("Button 01");
        add(button, BorderLayout.PAGE_START);
        
        button = new JButton("Button 02");
        add(button, BorderLayout.PAGE_END);
        
        button = new JButton("Button 03");
        add(button, BorderLayout.CENTER);
        
        button = new JButton("Button 04");
        add(button, BorderLayout.LINE_START);
        
        button = new JButton("Button 05");
        add(button, BorderLayout.LINE_END);        
    }
    
    public static void main(String[] args) {
        Layout03 l = new Layout03();
    }
    
}
