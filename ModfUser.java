import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Jan 18 19:33:58 CET 2021
 */



/**
 * @author Pini
 */
public class ModfUser extends JFrame {
    public ModfUser() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pini
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(new Rectangle(new Point(25, 15), scrollPane1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Delete");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(540, 30), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Add");
        contentPane.add(button2);
        button2.setBounds(540, 75, 78, 30);

        //---- button3 ----
        button3.setText("Modify");
        contentPane.add(button3);
        button3.setBounds(540, 125, 78, 30);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pini
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
