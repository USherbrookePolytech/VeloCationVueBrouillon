import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

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
        frmPaiement.setBounds(100, 100, 259, 104);
        frmPaiement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel PaiementPanel = new JPanel();
        PaiementPanel.setBorder(new TitledBorder(null, "Proc\u00E9dez au paiement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmPaiement.getContentPane().add(PaiementPanel, BorderLayout.CENTER);
        
        JButton PaiementBtnPayerViaPaypal = new JButton("Payer via Paypal");
        
        JButton PaiementBtnAbandonner = new JButton("Abandonner");
        GroupLayout gl_PaiementPanel = new GroupLayout(PaiementPanel);
        gl_PaiementPanel.setHorizontalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addComponent(PaiementBtnAbandonner)
                    .addGap(18)
                    .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        gl_PaiementPanel.setVerticalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(PaiementBtnAbandonner)
                        .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(8))
        );
        PaiementPanel.setLayout(gl_PaiementPanel);
    }
}
