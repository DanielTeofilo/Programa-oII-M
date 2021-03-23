import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame {    
    JList colorList;
    String[] colorNames = {"Black","Blue","Cyan","Dark Gray","Green"};
    Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.green};
    
    public ListFrame(){
        super("Aula 04 - List");  
        setLayout(new FlowLayout());
        
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);        
        add(new JScrollPane(colorList));
        
        colorList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colors[colorList.getSelectedIndex()]);
            }
        });        
    }  
    public static void main(String[] args) {
        ListFrame f = new ListFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);
    }    
}
