import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author DanielTeofilo
 */
public class HelloWorldSwing {
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello World");
        JLabel label1 = new JLabel("Olá turma!");
        
        frame.getContentPane().add(label1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
