import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Abonnements
{

    private JFrame frmAbonnement;

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
                    Abonnements window = new Abonnements();
                    window.frmAbonnement.setVisible(true);
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
    public Abonnements()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmAbonnement = new JFrame();
        frmAbonnement.setResizable(false);
        frmAbonnement.setTitle("Abonnement");
        frmAbonnement.setBounds(0, 0, 600, 500);
        frmAbonnement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAbonnement.setLocationRelativeTo(null);
        
        JPanel AbonnementsPanel = new JPanel();
        AbonnementsPanel.setBorder(new TitledBorder(null, "Choisissez votre abonnement", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));

        JButton AbonnementsBtnAnnulerLinscription = new JButton("Annuler l'inscription");
        AbonnementsBtnAnnulerLinscription.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmAbonnement.setVisible(false);
                accueilView.getFrmAccueil().setVisible(true);
                inscriptionController.hideMessage();
                inscriptionController.resetValeur();
                inscriptionController.setEmptyBorder();
            }
        });

        JButton AbonnementsBtnRetour = new JButton("Retour");
        AbonnementsBtnRetour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmAbonnement.setVisible(false);
                frmInscription.setVisible(true);
            }
        });
        GroupLayout groupLayout = new GroupLayout(frmAbonnement.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(193)
                            .addComponent(AbonnementsBtnRetour, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                            .addGap(18)
                            .addComponent(AbonnementsBtnAnnulerLinscription))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AbonnementsPanel, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AbonnementsPanel, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(AbonnementsBtnAnnulerLinscription, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addComponent(AbonnementsBtnRetour, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );

        JPanel AbonnementsPanelAbo1 = new JPanel();
        AbonnementsPanelAbo1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

        JPanel AbonnementsPanelAbo3 = new JPanel();
        AbonnementsPanelAbo3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

        JLabel AbonnementsLblDetail3Mois = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 3 mois");

        JLabel AbonnementsLbl3Mois = new JLabel("3 Mois -> $130 (CAN)");
        AbonnementsLbl3Mois.setFont(new Font("Stencil", Font.PLAIN, 29));

        JButton AbonnementsBtn3Mois = new JButton("Choisir 3 mois");
        AbonnementsBtn3Mois.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmAbonnement.setVisible(false);
                frmPaiement.setVisible(true);
                inscriptionController.paiement(2);
            }
        });
        
        JButton button_2 = new JButton("");
        button_2.setIcon(new ImageIcon(Abonnements.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
        GroupLayout gl_AbonnementsPanelAbo3 = new GroupLayout(AbonnementsPanelAbo3);
        gl_AbonnementsPanelAbo3.setHorizontalGroup(
            gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.LEADING)
                        .addComponent(AbonnementsLbl3Mois)
                        .addComponent(AbonnementsLblDetail3Mois))
                    .addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                    .addGroup(gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.LEADING)
                        .addComponent(button_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addGroup(Alignment.TRAILING, gl_AbonnementsPanelAbo3.createSequentialGroup()
                            .addComponent(AbonnementsBtn3Mois)
                            .addGap(61))))
        );
        gl_AbonnementsPanelAbo3.setVerticalGroup(
            gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                    .addGroup(gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AbonnementsBtn3Mois, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                            .addGroup(gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.LEADING)
                                .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(AbonnementsLbl3Mois))
                                .addComponent(button_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                            .addComponent(AbonnementsLblDetail3Mois)))
                    .addContainerGap())
        );
        AbonnementsPanelAbo3.setLayout(gl_AbonnementsPanelAbo3);

        JPanel AbonnementsPanel1An = new JPanel();
        AbonnementsPanel1An.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

        JLabel AbonnementsLblDetail1An = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 1 an");

        JLabel AbonnementsLbl1An = new JLabel("1 an -> $540 (CAN)");
        AbonnementsLbl1An.setFont(new Font("Stencil", Font.PLAIN, 29));

        JButton AbonnementsBtn1An = new JButton("Choisir 1 an");
        AbonnementsBtn1An.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmAbonnement.setVisible(false);
                frmPaiement.setVisible(true);
                inscriptionController.paiement(3);
            }
        });
        
        JButton button_3 = new JButton("");
        button_3.setIcon(new ImageIcon(Abonnements.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
        GroupLayout gl_AbonnementsPanel1An = new GroupLayout(AbonnementsPanel1An);
        gl_AbonnementsPanel1An.setHorizontalGroup(
            gl_AbonnementsPanel1An.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanel1An.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_AbonnementsPanel1An.createParallelGroup(Alignment.LEADING)
                        .addComponent(AbonnementsLblDetail1An)
                        .addComponent(AbonnementsLbl1An))
                    .addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                    .addGroup(gl_AbonnementsPanel1An.createParallelGroup(Alignment.LEADING)
                        .addComponent(button_3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addGroup(Alignment.TRAILING, gl_AbonnementsPanel1An.createSequentialGroup()
                            .addComponent(AbonnementsBtn1An, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                            .addGap(61))))
        );
        gl_AbonnementsPanel1An.setVerticalGroup(
            gl_AbonnementsPanel1An.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanel1An.createSequentialGroup()
                    .addGroup(gl_AbonnementsPanel1An.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_AbonnementsPanel1An.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AbonnementsLbl1An)
                            .addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                            .addComponent(AbonnementsLblDetail1An))
                        .addComponent(button_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGroup(Alignment.TRAILING, gl_AbonnementsPanel1An.createSequentialGroup()
                            .addContainerGap(42, Short.MAX_VALUE)
                            .addComponent(AbonnementsBtn1An, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        AbonnementsPanel1An.setLayout(gl_AbonnementsPanel1An);

        JButton AbonnementsBtnAide = new JButton("Aide");

        GroupLayout gl_AbonnementsPanel = new GroupLayout(AbonnementsPanel);
        gl_AbonnementsPanel.setHorizontalGroup(
            gl_AbonnementsPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_AbonnementsPanel.createSequentialGroup()
                    .addGroup(gl_AbonnementsPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_AbonnementsPanel.createSequentialGroup()
                            .addContainerGap(478, Short.MAX_VALUE)
                            .addComponent(AbonnementsBtnAide, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_AbonnementsPanel.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AbonnementsPanel1An, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                        .addGroup(gl_AbonnementsPanel.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AbonnementsPanelAbo3, GroupLayout.PREFERRED_SIZE, 542, Short.MAX_VALUE))
                        .addGroup(gl_AbonnementsPanel.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AbonnementsPanelAbo1, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        gl_AbonnementsPanel.setVerticalGroup(
            gl_AbonnementsPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_AbonnementsPanel.createSequentialGroup()
                    .addComponent(AbonnementsBtnAide, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                    .addComponent(AbonnementsPanelAbo1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(AbonnementsPanelAbo3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(AbonnementsPanel1An, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        );

        JLabel AbonnementsLbl1Mois = new JLabel("1 Mois -> $50 (CAN)");
        AbonnementsLbl1Mois.setFont(new Font("Stencil", Font.PLAIN, 29));

        JButton AbonnementsBtn1Mois = new JButton("Choisir 1 mois");
        AbonnementsBtn1Mois.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                frmAbonnement.setVisible(false);
                frmPaiement.setVisible(true);
                inscriptionController.paiement(1);
            }
        });

        JLabel AbonnementsLblDetail1Mois = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 1 mois");
        
        JButton button_1 = new JButton("");
        button_1.setIcon(new ImageIcon(Abonnements.class.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif")));
        
        GroupLayout gl_AbonnementsPanelAbo1 = new GroupLayout(AbonnementsPanelAbo1);
        gl_AbonnementsPanelAbo1.setHorizontalGroup(
            gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanelAbo1.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.LEADING)
                        .addComponent(AbonnementsLblDetail1Mois)
                        .addComponent(AbonnementsLbl1Mois))
                    .addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                    .addGroup(gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_AbonnementsPanelAbo1.createSequentialGroup()
                            .addComponent(AbonnementsBtn1Mois)
                            .addGap(60))
                        .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
        );
        gl_AbonnementsPanelAbo1.setVerticalGroup(
            gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanelAbo1.createSequentialGroup()
                    .addGroup(gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_AbonnementsPanelAbo1.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AbonnementsLbl1Mois)
                            .addGap(23)
                            .addComponent(AbonnementsLblDetail1Mois))
                        .addGroup(Alignment.TRAILING, gl_AbonnementsPanelAbo1.createSequentialGroup()
                            .addGap(40)
                            .addComponent(AbonnementsBtn1Mois, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        AbonnementsPanelAbo1.setLayout(gl_AbonnementsPanelAbo1);
        AbonnementsPanel.setLayout(gl_AbonnementsPanel);
        frmAbonnement.getContentPane().setLayout(groupLayout);
    }
}
