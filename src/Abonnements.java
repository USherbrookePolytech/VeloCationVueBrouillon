import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
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
        frmAbonnement.setBounds(100, 100, 555, 429);
        frmAbonnement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel AbonnementsPanel = new JPanel();
        AbonnementsPanel.setBorder(new TitledBorder(null, "Choisissez votre abonnement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        JButton AbonnementsBtnAnnulerLinscription = new JButton("Annuler l'inscription");
        AbonnementsBtnAnnulerLinscription.setBackground(new Color(255, 0, 0));
        
        JButton AbonnementsBtnRetour = new JButton("Retour");
        AbonnementsBtnRetour.setBackground(new Color(255, 102, 0));
        GroupLayout groupLayout = new GroupLayout(frmAbonnement.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(AbonnementsPanel, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addComponent(AbonnementsBtnRetour)
                            .addGap(84)
                            .addComponent(AbonnementsBtnAnnulerLinscription)
                            .addGap(124))))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AbonnementsPanel, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(AbonnementsBtnRetour)
                        .addComponent(AbonnementsBtnAnnulerLinscription))
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
        AbonnementsBtn3Mois.setBackground(new Color(51, 204, 0));
        GroupLayout gl_AbonnementsPanelAbo3 = new GroupLayout(AbonnementsPanelAbo3);
        gl_AbonnementsPanelAbo3.setHorizontalGroup(
            gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                            .addComponent(AbonnementsLblDetail3Mois)
                            .addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                            .addComponent(AbonnementsBtn3Mois))
                        .addComponent(AbonnementsLbl3Mois))
                    .addContainerGap())
        );
        gl_AbonnementsPanelAbo3.setVerticalGroup(
            gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_AbonnementsPanelAbo3.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AbonnementsLbl3Mois)
                    .addGap(11)
                    .addGroup(gl_AbonnementsPanelAbo3.createParallelGroup(Alignment.BASELINE)
                        .addComponent(AbonnementsBtn3Mois, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AbonnementsLblDetail3Mois))
                    .addContainerGap())
        );
        AbonnementsPanelAbo3.setLayout(gl_AbonnementsPanelAbo3);
        
        JPanel AbonnementsPanel1An = new JPanel();
        AbonnementsPanel1An.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        
        JLabel AbonnementsLblDetail1An = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 1 an");
        
        JLabel AbonnementsLbl1An = new JLabel("1 an -> $540 (CAN)");
        AbonnementsLbl1An.setFont(new Font("Stencil", Font.PLAIN, 29));
        
        JButton AbonnementsBtn1An = new JButton("Choisir 1 an");
        AbonnementsBtn1An.setBackground(new Color(51, 204, 0));
        GroupLayout gl_AbonnementsPanel1An = new GroupLayout(AbonnementsPanel1An);
        gl_AbonnementsPanel1An.setHorizontalGroup(
            gl_AbonnementsPanel1An.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanel1An.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_AbonnementsPanel1An.createParallelGroup(Alignment.LEADING)
                        .addComponent(AbonnementsLbl1An)
                        .addGroup(gl_AbonnementsPanel1An.createSequentialGroup()
                            .addComponent(AbonnementsLblDetail1An)
                            .addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                            .addComponent(AbonnementsBtn1An, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        gl_AbonnementsPanel1An.setVerticalGroup(
            gl_AbonnementsPanel1An.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_AbonnementsPanel1An.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AbonnementsLbl1An)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_AbonnementsPanel1An.createParallelGroup(Alignment.BASELINE)
                        .addComponent(AbonnementsLblDetail1An)
                        .addComponent(AbonnementsBtn1An, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        AbonnementsPanel1An.setLayout(gl_AbonnementsPanel1An);
        
        JButton AbonnementsBtnAide = new JButton("Aide");
        AbonnementsBtnAide.setBackground(new Color(255, 51, 255));
        GroupLayout gl_AbonnementsPanel = new GroupLayout(AbonnementsPanel);
        gl_AbonnementsPanel.setHorizontalGroup(
            gl_AbonnementsPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_AbonnementsPanel.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_AbonnementsPanel.createParallelGroup(Alignment.LEADING)
                        .addComponent(AbonnementsPanel1An, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                        .addComponent(AbonnementsPanelAbo3, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addComponent(AbonnementsPanelAbo1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AbonnementsBtnAide, Alignment.TRAILING))
                    .addContainerGap())
        );
        gl_AbonnementsPanel.setVerticalGroup(
            gl_AbonnementsPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_AbonnementsPanel.createSequentialGroup()
                    .addComponent(AbonnementsBtnAide)
                    .addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                    .addComponent(AbonnementsPanelAbo1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(AbonnementsPanelAbo3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(AbonnementsPanel1An, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        
        JLabel AbonnementsLbl1Mois = new JLabel("1 Mois -> $50 (CAN)");
        AbonnementsLbl1Mois.setFont(new Font("Stencil", Font.PLAIN, 29));
        
        JButton AbonnementsBtn1Mois = new JButton("Choisir 1 mois");
        AbonnementsBtn1Mois.setBackground(new Color(51, 204, 0));
        AbonnementsBtn1Mois.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        
        JLabel AbonnementsLblDetail1Mois = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 1 mois");
        GroupLayout gl_AbonnementsPanelAbo1 = new GroupLayout(AbonnementsPanelAbo1);
        gl_AbonnementsPanelAbo1.setHorizontalGroup(
            gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_AbonnementsPanelAbo1.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_AbonnementsPanelAbo1.createSequentialGroup()
                            .addComponent(AbonnementsLblDetail1Mois)
                            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AbonnementsBtn1Mois))
                        .addComponent(AbonnementsLbl1Mois))
                    .addContainerGap())
        );
        gl_AbonnementsPanelAbo1.setVerticalGroup(
            gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_AbonnementsPanelAbo1.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AbonnementsLbl1Mois)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_AbonnementsPanelAbo1.createParallelGroup(Alignment.BASELINE)
                        .addComponent(AbonnementsLblDetail1Mois)
                        .addComponent(AbonnementsBtn1Mois, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        AbonnementsPanelAbo1.setLayout(gl_AbonnementsPanelAbo1);
        AbonnementsPanel.setLayout(gl_AbonnementsPanel);
        frmAbonnement.getContentPane().setLayout(groupLayout);
    }
}
