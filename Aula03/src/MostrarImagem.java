
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class MostrarImagem extends JFrame {
    
    JLabel label1;
    JLabel label2;
    JPanel contentPane;
    
    public static void main(String[] args) {
        MostrarImagem mi = new MostrarImagem();
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mi.setVisible(true);
        mi.setSize(600, 600);
    }
    
    public MostrarImagem(){
        setTitle("Aula 03");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        label1 = new JLabel("Imagem acima");
        label1.setToolTipText("Este é o Label1");
        label1.setBounds(0, 105, 104, 16);
        contentPane.add(label1);
        
        ImageIcon image = new ImageIcon("D:/logo_estacio.jpg");
        label2 = new JLabel(image);
        label2.setToolTipText("Este é o Label2");
        label2.setBounds(0, 0, 450, 100);
        contentPane.add(label2);
    }
    
}
