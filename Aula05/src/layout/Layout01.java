package layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Layout01 extends JFrame {
    
    public Layout01(){
        setTitle("Aula05 - Gerenciadores de Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(290, 250);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel lblTitulo = new JLabel("FLOW LAYOUT CADASTRO DE USUARIO        ");
        add(lblTitulo);
        
        JLabel lblNome = new JLabel("Nome do Usuário");
        add(lblNome);
        
        JTextField txtNome = new JTextField(20);
        add(txtNome);
        
        JLabel lblUsuario = new JLabel("Login do usuário");
        add(lblUsuario);
        
        JTextField txtUsuario = new JTextField(20);
        add(txtUsuario);
        
        JLabel lblSenha = new JLabel("Senha do usuário");
        add(lblSenha);
        
        JTextField txtSenha = new JTextField(20);
        add(txtSenha);
        
        JButton btnSalvar = new JButton("  Salvar   ");
        add(btnSalvar);
        
        JButton btnCancelar = new JButton("  Cancelar   ");
        add(btnCancelar);
    }
    
    public static void main(String[] args) {
        Layout01 l = new Layout01();
    }
    
}
