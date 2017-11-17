import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class LouerVelo
{

    private JFrame frmLouer;

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
                    LouerVelo window = new LouerVelo();
                    window.frmLouer.setVisible(true);
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
    public LouerVelo()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmLouer = new JFrame();
        frmLouer.setTitle("Louer");
        frmLouer.setBounds(100, 100, 485, 244);
        frmLouer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmLouer.setLocationRelativeTo(null);
        
        JPanel LouerPanel = new JPanel();
        LouerPanel.setBorder(new TitledBorder(null, "Choisir votre location", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmLouer.getContentPane().add(LouerPanel, BorderLayout.EAST);
        
        JLabel LouerLblNombreDeVlo = new JLabel("Nombre de vélo souhaité :");
        
        JSpinner LouerSpinnerVelo = new JSpinner();
        
        JLabel LouerLblVotreLocationSera = new JLabel("Votre location sera valable 24 heures");
        LouerLblVotreLocationSera.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton LouerBtnAide = new JButton("Aide");
        
        JButton LouerBtnValider = new JButton("Valider");
        
        JButton LouerBtnAnnuler = new JButton("Annuler");
        
        JLabel LouerLblCaution = new JLabel("Note : Caution de 200$ CAN par vélo");
        LouerLblCaution.setFont(new Font("Tahoma", Font.BOLD, 11));
        LouerLblCaution.setForeground(new Color(102, 0, 0));
        
        JLabel lblTarifHoraire = new JLabel("Par vélo : 5$ CAN / Heure");
        lblTarifHoraire.setFont(new Font("Tahoma", Font.BOLD, 13));
        GroupLayout gl_LouerPanel = new GroupLayout(LouerPanel);
        gl_LouerPanel.setHorizontalGroup(
            gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addGap(145)
                            .addComponent(LouerBtnAnnuler)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(LouerBtnValider))
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addGap(23)
                            .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                                .addGroup(gl_LouerPanel.createSequentialGroup()
                                    .addComponent(LouerLblNombreDeVlo)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(LouerSpinnerVelo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18)
                                    .addComponent(LouerLblCaution))
                                .addComponent(lblTarifHoraire, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                .addGroup(gl_LouerPanel.createSequentialGroup()
                                    .addComponent(LouerLblVotreLocationSera)
                                    .addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                    .addComponent(LouerBtnAide, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap())
        );
        gl_LouerPanel.setVerticalGroup(
            gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                        .addComponent(LouerBtnAide)
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(LouerLblVotreLocationSera)))
                    .addGap(18)
                    .addComponent(lblTarifHoraire)
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addGap(18)
                            .addGroup(gl_LouerPanel.createParallelGroup(Alignment.BASELINE)
                                .addComponent(LouerLblNombreDeVlo)
                                .addComponent(LouerSpinnerVelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(27))
                        .addGroup(Alignment.TRAILING, gl_LouerPanel.createSequentialGroup()
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(LouerLblCaution)))
                    .addGap(18)
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(LouerBtnAnnuler)
                        .addComponent(LouerBtnValider))
                    .addContainerGap(77, Short.MAX_VALUE))
        );
        LouerPanel.setLayout(gl_LouerPanel);
    }
}