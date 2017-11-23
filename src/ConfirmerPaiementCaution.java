import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class ConfirmerPaiementCaution
{

    private JFrame frmValiderPaiementCaution;

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
                    ConfirmerPaiementCaution window = new ConfirmerPaiementCaution();
                    window.frmValiderPaiementCaution.setVisible(true);
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
    public ConfirmerPaiementCaution()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmValiderPaiementCaution = new JFrame();
        frmValiderPaiementCaution.setTitle("Confirmation du paiement");
        frmValiderPaiementCaution.setBounds(0, 0, 600, 500);
        frmValiderPaiementCaution.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmValiderPaiementCaution.setLocationRelativeTo(null);
        frmValiderPaiementCaution.setResizable(false);
        
        JLabel lblEtesvousCertainDee = new JLabel("<html>Êtes-vous certain de réserver 4 vélos pour une <br>caution totale de 200$ CAN ?</html>");
        lblEtesvousCertainDee.setHorizontalAlignment(SwingConstants.CENTER);
        lblEtesvousCertainDee.setIcon(new ImageIcon(ConfirmerPaiementCaution.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
        lblEtesvousCertainDee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        JPanel panelBouton = new JPanel();
        GroupLayout groupLayout = new GroupLayout(frmValiderPaiementCaution.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(panelBouton, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                        .addComponent(lblEtesvousCertainDee, GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(128)
                    .addComponent(lblEtesvousCertainDee, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                    .addComponent(panelBouton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );

        JButton btnModifierMonChoix = new JButton("Modifier mon choix");
        btnModifierMonChoix.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnModifierMonChoix.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frmValiderPaiementCaution.setVisible(false);
                accueilView.getLouerView().getFrmLouer().setVisible(true);
            }
        });

        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnAnnuler.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frmValiderPaiementCaution.setVisible(false);
                accueilView.getFrmAccueil().setVisible(true);
            }
        });

        JButton btnPayer = new JButton("Payer");
        btnPayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnPayer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frmValiderPaiementCaution.setVisible(false);
                frmPaiementValidSansCompte.setVisible(true);
            }
        });

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
        frmValiderPaiementCaution.getContentPane().setLayout(groupLayout);
    }
}
