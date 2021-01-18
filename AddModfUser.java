import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Jan 18 20:03:48 CET 2021
 */



/**
 * @author Pini
 */
public class AddModfUser extends JFrame {
    public AddModfUser() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pini
        usernAMElABEL = new JLabel();
        passwordLabel = new JLabel();
        passwordMdfField = new JTextField();
        userNameModFld2 = new JTextField();
        saveBut = new JButton();
        label1 = new JLabel();
        rleModFild = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- usernAMElABEL ----
        usernAMElABEL.setText("User Name");
        contentPane.add(usernAMElABEL);
        usernAMElABEL.setBounds(50, 15, 58, 16);

        //---- passwordLabel ----
        passwordLabel.setText("Password");
        contentPane.add(passwordLabel);
        passwordLabel.setBounds(60, 60, 50, 16);
        contentPane.add(passwordMdfField);
        passwordMdfField.setBounds(145, 55, 120, 30);
        contentPane.add(userNameModFld2);
        userNameModFld2.setBounds(145, 10, 120, 30);

        //---- saveBut ----
        saveBut.setText("Save");
        contentPane.add(saveBut);
        saveBut.setBounds(150, 150, 78, 30);

        //---- label1 ----
        label1.setText("Role");
        contentPane.add(label1);
        label1.setBounds(90, 110, 40, label1.getPreferredSize().height);
        contentPane.add(rleModFild);
        rleModFild.setBounds(145, 100, 120, 30);

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
    private JLabel usernAMElABEL;
    private JLabel passwordLabel;
    private JTextField passwordMdfField;
    private JTextField userNameModFld2;
    private JButton saveBut;
    private JLabel label1;
    private JTextField rleModFild;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
