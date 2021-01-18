import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Jan 18 19:16:10 CET 2021
 */



/**
 * @author Pini
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pini
        label1 = new JLabel();
        label2 = new JLabel();
        passwordFld = new JTextField();
        userNameFld = new JTextField();
        loginButn = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("User Name");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(75, 30), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("Password");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(80, 75), label2.getPreferredSize()));
        contentPane.add(passwordFld);
        passwordFld.setBounds(160, 70, 120, 25);
        contentPane.add(userNameFld);
        userNameFld.setBounds(160, 25, 120, 30);

        //---- loginButn ----
        loginButn.setText("Login");
        contentPane.add(loginButn);
        loginButn.setBounds(new Rectangle(new Point(200, 115), loginButn.getPreferredSize()));

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
    private JLabel label1;
    private JLabel label2;
    private JTextField passwordFld;
    private JTextField userNameFld;
    private JButton loginButn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
