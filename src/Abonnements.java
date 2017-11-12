import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 */

/**
 * @author Bebo
 *
 */
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
        
        JPanel panelAbonnements = new JPanel();
        panelAbonnements.setBorder(new TitledBorder(null, "Choisissez votre abonnement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        JButton btnAnnulerLinscription = new JButton("Annuler l'inscription");
        
        JButton btnRetour = new JButton("Retour");
        GroupLayout groupLayout = new GroupLayout(frmAbonnement.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(panelAbonnements, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addComponent(btnRetour)
                            .addGap(84)
                            .addComponent(btnAnnulerLinscription)
                            .addGap(124))))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelAbonnements, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnRetour)
                        .addComponent(btnAnnulerLinscription))
                    .addContainerGap())
        );
        
        JPanel panelAbo1 = new JPanel();
        panelAbo1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        
        JPanel panelAbo3 = new JPanel();
        panelAbo3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        
        JLabel lblDetail3Mois = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 3 mois");
        
        JLabel lbl3Mois = new JLabel("3 Mois -> $130 (CAN)");
        lbl3Mois.setFont(new Font("Stencil", Font.PLAIN, 29));
        
        JButton btn3Mois = new JButton("Choisir 3 mois");
        GroupLayout gl_panelAbo3 = new GroupLayout(panelAbo3);
        gl_panelAbo3.setHorizontalGroup(
            gl_panelAbo3.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panelAbo3.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panelAbo3.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelAbo3.createSequentialGroup()
                            .addComponent(lblDetail3Mois)
                            .addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                            .addComponent(btn3Mois))
                        .addComponent(lbl3Mois))
                    .addContainerGap())
        );
        gl_panelAbo3.setVerticalGroup(
            gl_panelAbo3.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panelAbo3.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl3Mois)
                    .addGap(11)
                    .addGroup(gl_panelAbo3.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btn3Mois, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDetail3Mois))
                    .addContainerGap())
        );
        panelAbo3.setLayout(gl_panelAbo3);
        
        JPanel panel1An = new JPanel();
        panel1An.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        
        JLabel lblDetail1An = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 1 an");
        
        JLabel lbl1An = new JLabel("1 an -> $540 (CAN)");
        lbl1An.setFont(new Font("Stencil", Font.PLAIN, 29));
        
        JButton btn1An = new JButton("Choisir 1 an");
        GroupLayout gl_panel1An = new GroupLayout(panel1An);
        gl_panel1An.setHorizontalGroup(
            gl_panel1An.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panel1An.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panel1An.createParallelGroup(Alignment.LEADING)
                        .addComponent(lbl1An)
                        .addGroup(gl_panel1An.createSequentialGroup()
                            .addComponent(lblDetail1An)
                            .addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                            .addComponent(btn1An, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        gl_panel1An.setVerticalGroup(
            gl_panel1An.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel1An.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl1An)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_panel1An.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblDetail1An)
                        .addComponent(btn1An, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        panel1An.setLayout(gl_panel1An);
        
        JButton btnAide = new JButton("Aide");
        GroupLayout gl_panelAbonnements = new GroupLayout(panelAbonnements);
        gl_panelAbonnements.setHorizontalGroup(
            gl_panelAbonnements.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panelAbonnements.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panelAbonnements.createParallelGroup(Alignment.LEADING)
                        .addComponent(panel1An, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                        .addComponent(panelAbo3, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addComponent(panelAbo1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAide, Alignment.TRAILING))
                    .addContainerGap())
        );
        gl_panelAbonnements.setVerticalGroup(
            gl_panelAbonnements.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_panelAbonnements.createSequentialGroup()
                    .addComponent(btnAide)
                    .addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                    .addComponent(panelAbo1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(panelAbo3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(panel1An, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        
        JLabel lbl1Mois = new JLabel("1 Mois -> $50 (CAN)");
        lbl1Mois.setFont(new Font("Stencil", Font.PLAIN, 29));
        
        JButton btn1Mois = new JButton("Choisir 1 mois");
        btn1Mois.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        
        JLabel lblDetail1Mois = new JLabel("Accès illimité aux bornes VeloCation 24h/24 pendant 1 mois");
        GroupLayout gl_panelAbo1 = new GroupLayout(panelAbo1);
        gl_panelAbo1.setHorizontalGroup(
            gl_panelAbo1.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panelAbo1.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panelAbo1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelAbo1.createSequentialGroup()
                            .addComponent(lblDetail1Mois)
                            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1Mois))
                        .addComponent(lbl1Mois))
                    .addContainerGap())
        );
        gl_panelAbo1.setVerticalGroup(
            gl_panelAbo1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panelAbo1.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl1Mois)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_panelAbo1.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblDetail1Mois)
                        .addComponent(btn1Mois, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        panelAbo1.setLayout(gl_panelAbo1);
        panelAbonnements.setLayout(gl_panelAbonnements);
        frmAbonnement.getContentPane().setLayout(groupLayout);
    }
}
