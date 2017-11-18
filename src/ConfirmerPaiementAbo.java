import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class ConfirmerPaiementAbo
{

    private JFrame frmConfirmationDuPaiement;

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
                    ConfirmerPaiementAbo window = new ConfirmerPaiementAbo();
                    window.frmConfirmationDuPaiement.setVisible(true);
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
    public ConfirmerPaiementAbo()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmConfirmationDuPaiement = new JFrame();
        frmConfirmationDuPaiement.setTitle("Confirmation du paiement");
        frmConfirmationDuPaiement.setBounds(100, 100, 421, 132);
        frmConfirmationDuPaiement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("");
        
        JLabel lblEtesvousCertainDe = new JLabel("Êtes-vous certain de souscrire à l'abonnement XX$ CAN / mois ?");
        
        JButton btnModifierMonChoix = new JButton("Modifier mon choix");
        
        JButton btnAnnuler = new JButton("Annuler");
        
        JButton btnPayer = new JButton("Payer");
        GroupLayout groupLayout = new GroupLayout(frmConfirmationDuPaiement.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(121)
                            .addComponent(label))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(31)
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addComponent(btnModifierMonChoix)
                                    .addGap(66)
                                    .addComponent(btnAnnuler)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(btnPayer))
                                .addComponent(lblEtesvousCertainDe))))
                    .addContainerGap(51, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(19)
                    .addComponent(lblEtesvousCertainDe)
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnPayer)
                        .addComponent(btnAnnuler)
                        .addComponent(btnModifierMonChoix))
                    .addGap(34)
                    .addComponent(label)
                    .addContainerGap(154, Short.MAX_VALUE))
        );
        frmConfirmationDuPaiement.getContentPane().setLayout(groupLayout);
    }
}
