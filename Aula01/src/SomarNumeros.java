
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DanielTeofilo
 */
public class SomarNumeros extends JDialog {
    
    private final JPanel contentPanel = new JPanel();
    
    public static void main(String[] args){
        try{
            SomarNumeros dialog = new SomarNumeros();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
            
            String firstNumber = JOptionPane.showInputDialog("Digite o primeiro número.");
            String secondNumber = JOptionPane.showInputDialog("Digite o segundo número.");
            
            int numero1 = Integer.parseInt(firstNumber);
            int numero2 = Integer.parseInt(secondNumber);
            
            int soma = numero1 + numero2;
            
            JOptionPane.showMessageDialog(null, "A soma é " + soma, "", JOptionPane.PLAIN_MESSAGE);
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
