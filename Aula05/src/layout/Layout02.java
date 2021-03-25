package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class Layout02 extends JFrame {
    
    String gapList[] = {"0","10","15","20"};
    int maxGap = 20;
    
    JComboBox horizontalComboBox;
    JComboBox verticalComboBox;
    JButton aplicar;
    GridLayout gridLayout;
            
    public Layout02(){
        setTitle("Aula 05 - GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(590, 350);
        setVisible(true);
        
        horizontalComboBox = new JComboBox(gapList);
        verticalComboBox = new JComboBox(gapList);
        aplicar = new JButton(" Aplicar  ");
        gridLayout = new GridLayout(0, 2);
        
        JPanel panel = new JPanel();
        panel.setLayout(gridLayout);
        
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2,3));
        
        JButton b = new JButton("Just ");
        Dimension buttonSize = b.getPreferredSize();
        panel.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5) +
                maxGap, (int)(buttonSize.getHeight() * 3.5) + maxGap * 2));
        
        panel.add(new JButton("Button1"));
        panel.add(new JButton("Button2"));
        panel.add(new JButton("Button3"));
        panel.add(new JButton("Button4"));
        panel.add(new JButton("Button5"));
        
        controls.add(new Label("Horizontal Gap"));
        controls.add(new Label("Vertical Gap"));
        controls.add(new Label(" "));
        controls.add(horizontalComboBox);
        controls.add(verticalComboBox);
        controls.add(aplicar);
        
        aplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String horGap = (String)horizontalComboBox.getSelectedItem();
                String verGap = (String)verticalComboBox.getSelectedItem();
                gridLayout.setHgap(Integer.parseInt(horGap));
                gridLayout.setVgap(Integer.parseInt(verGap));
                gridLayout.layoutContainer(panel);
            }
        });
        
        add(panel, BorderLayout.NORTH);
        add(new JSeparator(), BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        Layout02 l = new Layout02();
    }
    
}
