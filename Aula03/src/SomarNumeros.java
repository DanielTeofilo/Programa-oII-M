import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class SomarNumeros extends JFrame {
    
    JPanel contentPane;
    float valor1, valor2,valor3;
    float media;
    
    public static void main(String[] args) {
        SomarNumeros sm = new SomarNumeros();
        sm.setVisible(true);
    }
    
    public SomarNumeros(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,500,400);
        setTitle("Aula 03 - Somando números");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        ImageIcon image = new ImageIcon("D:/logo_estacio.jpg");
        JLabel label2 = new JLabel(image);
        label2.setToolTipText("Este é o Label2");
        label2.setBounds(0, 0, 450, 99);
        contentPane.add(label2);
        
        JLabel lblTitulo = new JLabel("Calculando a média");
        lblTitulo.setBounds(0,100,300,32);
        Font font = new Font("Arial", 26,26);
        lblTitulo.setFont(font);
        contentPane.add(lblTitulo);
        
        JLabel lblValor1 = new JLabel("Digite o valor 1: ");
        lblValor1.setBounds(0, 135, 100, 32);
        contentPane.add(lblValor1);
        
        JTextField txtValor1 = new JTextField();
        txtValor1.setBounds(101, 135, 150, 32);
        contentPane.add(txtValor1);
        
        JLabel lblValor2 = new JLabel("Digite o valor 2: ");
        lblValor2.setBounds(0, 170, 100, 32);
        contentPane.add(lblValor2);
        
        JTextField txtValor2 = new JTextField();
        txtValor2.setBounds(101, 170, 150, 32);
        contentPane.add(txtValor2);
        
        JLabel lblValor3 = new JLabel("Digite o valor 3: ");
        lblValor3.setBounds(0, 205, 100, 32);
        contentPane.add(lblValor3);
        
        JTextField txtValor3 = new JTextField();
        txtValor3.setBounds(101, 205, 150, 32);
        contentPane.add(txtValor3);
        
        JButton btnCalcular = new JButton("    Calcular    ");
        btnCalcular.setBounds(0, 235, 250, 32);
        contentPane.add(btnCalcular);
        
        JLabel lblResultado = new JLabel();
        lblResultado.setBounds(0, 265 ,300,32);
        lblResultado.setFont(font);
        contentPane.add(lblResultado);
        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Integer.parseInt(txtValor1.getText());
                valor2 = Integer.parseInt(txtValor2.getText());
                valor3 = Integer.parseInt(txtValor3.getText());
                
                media = (valor1 + valor2 + valor3)/3;
                
                lblResultado.setText("O resultado é: " +  String.format("%.2f", media));
            }
        });
    }
    
}
