import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame{    
    JTextArea txtArea1;
    JTextArea txtArea2;
    JButton copyJButton;
    
    public TextAreaFrame(){
        super("TextArea - Aula 04");
        Box box = Box.createHorizontalBox();
        String d = "";
        
        txtArea1 = new JTextArea(d, 10, 15);
        box.add(new JScrollPane(txtArea1));      
        
        copyJButton = new JButton("Copy >>>");
        box.add(copyJButton);
        
        txtArea2 = new JTextArea(10, 15);
        box.add(new JScrollPane(txtArea2));
        
        copyJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea2.setText(txtArea1.getText());                
            }
        });        
        add(box);
    }    
    public static void main(String[] args) {
        TextAreaFrame t = new TextAreaFrame();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(400, 400);
        t.setVisible(true);
    }    
}
