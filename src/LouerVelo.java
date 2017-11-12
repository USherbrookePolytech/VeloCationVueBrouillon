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
        frmLouer.setBounds(100, 100, 450, 200);
        frmLouer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel LouerPanel = new JPanel();
        LouerPanel.setBorder(new TitledBorder(null, "Choisir votre location", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmLouer.getContentPane().add(LouerPanel, BorderLayout.CENTER);
        
        JLabel LouerLblNombreDeVlo = new JLabel("Nombre de vélo souhaité :");
        
        JSpinner LouerSpinnerVelo = new JSpinner();
        
        JLabel LouerLblVotreLocationSera = new JLabel("Votre location sera valable 24 heures");
        LouerLblVotreLocationSera.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton LouerBtnAide = new JButton("Aide");
        LouerBtnAide.setBackground(new Color(255, 51, 255));
        
        JButton LouerBtnValider = new JButton("Valider");
        LouerBtnValider.setBackground(new Color(102, 204, 0));
        
        JButton LouerBtnAnnuler = new JButton("Annuler");
        LouerBtnAnnuler.setBackground(new Color(255, 0, 0));
        
        JLabel LouerLblCaution = new JLabel("Note : Caution de 200$ CAN par vélo");
        LouerLblCaution.setFont(new Font("Tahoma", Font.BOLD, 11));
        LouerLblCaution.setForeground(new Color(102, 0, 0));
        GroupLayout gl_LouerPanel = new GroupLayout(LouerPanel);
        gl_LouerPanel.setHorizontalGroup(
            gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addComponent(LouerLblVotreLocationSera)
                            .addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                            .addComponent(LouerBtnAide, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, gl_LouerPanel.createSequentialGroup()
                            .addComponent(LouerBtnAnnuler)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(LouerBtnValider)
                            .addGap(133))))
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addGap(49)
                    .addComponent(LouerLblNombreDeVlo)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(LouerSpinnerVelo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(197, Short.MAX_VALUE))
                .addGroup(Alignment.TRAILING, gl_LouerPanel.createSequentialGroup()
                    .addContainerGap(234, Short.MAX_VALUE)
                    .addComponent(LouerLblCaution)
                    .addContainerGap())
        );
        gl_LouerPanel.setVerticalGroup(
            gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                        .addComponent(LouerBtnAide)
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addGap(21)
                            .addComponent(LouerLblVotreLocationSera)))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(LouerLblNombreDeVlo)
                        .addComponent(LouerSpinnerVelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(10)
                    .addComponent(LouerLblCaution)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(LouerBtnAnnuler)
                        .addComponent(LouerBtnValider))
                    .addContainerGap())
        );
        LouerPanel.setLayout(gl_LouerPanel);
    }
}
