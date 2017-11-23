import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ConfirmerPaiement
{

    private JFrame frmPaiementValid;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    ConfirmerPaiement window = new ConfirmerPaiement();
                    window.frmPaiementValid.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ConfirmerPaiement()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmPaiementValid = new JFrame();
        frmPaiementValid.setTitle("Paiement validé !");
        frmPaiementValid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPaiementValid.setResizable(false);
        frmPaiementValid.setBounds(0, 0, 600, 500);
        frmPaiementValid.setLocationRelativeTo(null);
        
        JLabel lblPaiementValid = new JLabel("Paiement validé");
        lblPaiementValid.setForeground(new Color(0, 128, 0));
        lblPaiementValid.setFont(new Font("Tahoma", Font.PLAIN, 34));
        lblPaiementValid.setIcon(new ImageIcon(ConfirmerPaiement.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
        
        JButton btnAppuyerPourContinuer = new JButton("Appuyer pour continuer");
        btnAppuyerPourContinuer.setFont(new Font("Tahoma", Font.PLAIN, 18));
        GroupLayout groupLayout = new GroupLayout(frmPaiementValid.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(btnAppuyerPourContinuer, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addComponent(lblPaiementValid)
                            .addGap(158))))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(115)
                    .addComponent(lblPaiementValid)
                    .addGap(87)
                    .addComponent(btnAppuyerPourContinuer, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE))
        );
        frmPaiementValid.getContentPane().setLayout(groupLayout);
    }
}
