import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ConfirmerPaiementAbo
{

    private JFrame frmValiderPaiementAbo;

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
                    window.frmValiderPaiementAbo.setVisible(true);
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
        frmValiderPaiementAbo = new JFrame();
        frmValiderPaiementAbo.setTitle("Confirmation du paiement");
        frmValiderPaiementAbo.setBounds(0, 0, 600, 500);
        frmValiderPaiementAbo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblEtesvousCertainDe = new JLabel("Êtes-vous certain de souscrire à l'abonnement XX$ CAN / mois ?");
        lblEtesvousCertainDe.setIcon(new ImageIcon(ConfirmerPaiementAbo.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
        lblEtesvousCertainDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JPanel panelBouton = new JPanel();
        GroupLayout groupLayout = new GroupLayout(frmValiderPaiementAbo.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelBouton, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(20)
                            .addComponent(lblEtesvousCertainDe)))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(151)
                    .addComponent(lblEtesvousCertainDe)
                    .addPreferredGap(ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                    .addComponent(panelBouton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        
        JButton btnModifierMonChoix = new JButton("Modifier mon choix");
        btnModifierMonChoix.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JButton btnPayer = new JButton("Payer");
        btnPayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GroupLayout gl_panelBouton = new GroupLayout(panelBouton);
        gl_panelBouton.setHorizontalGroup(
            gl_panelBouton.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panelBouton.createSequentialGroup()
                    .addComponent(btnModifierMonChoix, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                    .addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(btnPayer, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
        );
        gl_panelBouton.setVerticalGroup(
            gl_panelBouton.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_panelBouton.createSequentialGroup()
                    .addGroup(gl_panelBouton.createParallelGroup(Alignment.TRAILING)
                        .addComponent(btnAnnuler, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGroup(gl_panelBouton.createParallelGroup(Alignment.BASELINE)
                            .addComponent(btnModifierMonChoix, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btnPayer, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                    .addGap(20))
        );
        panelBouton.setLayout(gl_panelBouton);
        frmValiderPaiementAbo.getContentPane().setLayout(groupLayout);
    }
}
