
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class ExibirNome extends JFrame{
    
    public static void main(String[] args){
        ExibirNome e = new ExibirNome();
        e.setVisible(true);
    }
    
    public ExibirNome(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 450, 300);
        setTitle("Exibir nome e sobrenome");
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        JLabel lblNome = new JLabel("Meu nome é?");
        lblNome.setBounds(0,25,104,16);
        contentPane.add(lblNome);
        
        JTextField txtNome = new JTextField();
        txtNome.setBounds(0, 50, 116, 22);
        contentPane.add(txtNome);        
        
        JLabel lblSobreNome = new JLabel("Meu sobrenome é?");
        lblSobreNome.setBounds(0,75,144,16);
        contentPane.add(lblSobreNome);
        
        JTextField txtSobreNome = new JTextField();
        txtSobreNome.setBounds(0, 100, 116, 22);
        contentPane.add(txtSobreNome); 
        
        JButton btnExibirNomeCompleto = new JButton("Exibir");
        btnExibirNomeCompleto.setBounds(0,125,137,25);
        contentPane.add(btnExibirNomeCompleto);
        
        btnExibirNomeCompleto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {                
                JOptionPane.showMessageDialog(null, "Meu nome completo é " + txtNome.getText() + " " + txtSobreNome.getText());
            }
        });
    }
    
}
