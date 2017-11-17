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
        frmPaiementValid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPaiementValid.setResizable(false);
        frmPaiementValid.setBounds(0, 0, 192, 120);
        frmPaiementValid.setLocationRelativeTo(null);
        
        JLabel lblPaiementValid = new JLabel("Paiement validé");
        
        JButton btnAppuyerPourContinuer = new JButton("Appuyer pour continuer");
        GroupLayout groupLayout = new GroupLayout(frmPaiementValid.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(50)
                            .addComponent(lblPaiementValid))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnAppuyerPourContinuer)))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(21)
                    .addComponent(lblPaiementValid)
                    .addGap(18)
                    .addComponent(btnAppuyerPourContinuer)
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        frmPaiementValid.getContentPane().setLayout(groupLayout);
    }
}
