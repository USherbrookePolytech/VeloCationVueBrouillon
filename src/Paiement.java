import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Paiement
{

    private JFrame frmPaiement;

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
                    Paiement window = new Paiement();
                    window.frmPaiement.setVisible(true);
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
    public Paiement()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmPaiement = new JFrame();
        frmPaiement.setResizable(false);
        frmPaiement.setTitle("Paiement");
        frmPaiement.setBounds(100, 100, 259, 116);
        frmPaiement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel PaiementPanel = new JPanel();
        PaiementPanel.setBorder(new TitledBorder(null, "Proc\u00E9dez au paiement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmPaiement.getContentPane().add(PaiementPanel, BorderLayout.CENTER);
        
        JButton PaiementBtnPayerViaPaypal = new JButton("Payer via Paypal");
        PaiementBtnPayerViaPaypal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JButton PaiementBtnAbandonner = new JButton("Abandonner");
        
        JLabel PaiementLblMontantPayer = new JLabel("Montant à payer : XX $CAN");
        PaiementLblMontantPayer.setFont(new Font("Tahoma", Font.BOLD, 13));
        GroupLayout gl_PaiementPanel = new GroupLayout(PaiementPanel);
        gl_PaiementPanel.setHorizontalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(PaiementLblMontantPayer)
                    .addGap(26))
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addGap(15)
                    .addComponent(PaiementBtnAbandonner)
                    .addGap(18)
                    .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4))
        );
        gl_PaiementPanel.setVerticalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.TRAILING)
                .addGroup(Alignment.LEADING, gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PaiementLblMontantPayer)
                    .addGap(11)
                    .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(PaiementBtnAbandonner)
                        .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(16))
        );
        PaiementPanel.setLayout(gl_PaiementPanel);
    }
}
