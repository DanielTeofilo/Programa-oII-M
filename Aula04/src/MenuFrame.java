import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
 
public class MenuFrame extends JFrame {
    
    JMenuBar barra = new JMenuBar();
    JMenu menu1 = new JMenu("Cadastro");
    JMenu menu2 = new JMenu("Opções");
    JMenuItem item1 = new JMenuItem("Sair");
    
    public MenuFrame(){
        super("Menu - Aula 04");
        setJMenuBar(barra);
        barra.add(menu1);
        barra.add(menu2);        
        menu2.add(item1);   
        
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }    
    public static void main(String[] args) {
        MenuFrame m = new MenuFrame();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(400, 400);
        m.setVisible(true);
    }    
}
