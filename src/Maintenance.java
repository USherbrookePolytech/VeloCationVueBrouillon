import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;

/**
 * 
 */

/**
 * @author Bebo
 *
 */
public class Maintenance
{

    private JFrame frmMaintenance;

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
                    Maintenance window = new Maintenance();
                    window.frmMaintenance.setVisible(true);
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
    public Maintenance()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmMaintenance = new JFrame();
        frmMaintenance.setTitle("Maintenance");
        frmMaintenance.setBounds(0, 0, 600, 500);
        frmMaintenance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMaintenance.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        frmMaintenance.getContentPane().add(panel, BorderLayout.CENTER);
        
        JButton btnAide = new JButton("Aide");
        
        JPanel MaintPanelService = new JPanel();
        MaintPanelService.setBorder(new TitledBorder(null, "Service technique", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        JPanel MaintPanelBouton = new JPanel();
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap(498, Short.MAX_VALUE)
                    .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MaintPanelBouton, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE))
                .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MaintPanelService, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGap(10)
                    .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaintPanelService, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(4)
                    .addComponent(MaintPanelBouton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                    .addGap(25))
        );
        
        JButton btnFermerLaSession = new JButton("Fermer la session");
        btnFermerLaSession.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GroupLayout gl_MaintPanelBouton = new GroupLayout(MaintPanelBouton);
        gl_MaintPanelBouton.setHorizontalGroup(
            gl_MaintPanelBouton.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_MaintPanelBouton.createSequentialGroup()
                    .addGap(174)
                    .addComponent(btnFermerLaSession, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(175, Short.MAX_VALUE))
        );
        gl_MaintPanelBouton.setVerticalGroup(
            gl_MaintPanelBouton.createParallelGroup(Alignment.LEADING)
                .addComponent(btnFermerLaSession, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );
        MaintPanelBouton.setLayout(gl_MaintPanelBouton);
        
        JPanel MaintPanelBorne = new JPanel();
        MaintPanelBorne.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        
        JPanel MaintPanelSocles = new JPanel();
        MaintPanelSocles.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GroupLayout gl_MaintPanelService = new GroupLayout(MaintPanelService);
        gl_MaintPanelService.setHorizontalGroup(
            gl_MaintPanelService.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_MaintPanelService.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_MaintPanelService.createParallelGroup(Alignment.TRAILING)
                        .addComponent(MaintPanelSocles, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addComponent(MaintPanelBorne, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addContainerGap())
        );
        gl_MaintPanelService.setVerticalGroup(
            gl_MaintPanelService.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_MaintPanelService.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MaintPanelBorne, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(MaintPanelSocles, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addContainerGap())
        );
        
        JLabel lblOprationSurLes = new JLabel("Opération sur les socles");
        lblOprationSurLes.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton btnRinitialiserLesSocles = new JButton("Réinitialiser les socles");
        btnRinitialiserLesSocles.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton btnAjouterDesSocles = new JButton("Ajouter des socles");
        btnAjouterDesSocles.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GroupLayout gl_MaintPanelSocles = new GroupLayout(MaintPanelSocles);
        gl_MaintPanelSocles.setHorizontalGroup(
            gl_MaintPanelSocles.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_MaintPanelSocles.createSequentialGroup()
                    .addGroup(gl_MaintPanelSocles.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_MaintPanelSocles.createSequentialGroup()
                            .addGap(178)
                            .addComponent(lblOprationSurLes))
                        .addGroup(gl_MaintPanelSocles.createSequentialGroup()
                            .addGap(81)
                            .addComponent(btnRinitialiserLesSocles)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(btnAjouterDesSocles)))
                    .addContainerGap(141, Short.MAX_VALUE))
        );
        gl_MaintPanelSocles.setVerticalGroup(
            gl_MaintPanelSocles.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_MaintPanelSocles.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblOprationSurLes)
                    .addGap(18)
                    .addGroup(gl_MaintPanelSocles.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(btnRinitialiserLesSocles, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAjouterDesSocles, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGap(19))
        );
        MaintPanelSocles.setLayout(gl_MaintPanelSocles);
        
        JButton btnRedmarrerLaBorne = new JButton("Redémarrer la borne");
        btnRedmarrerLaBorne.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JLabel lblOprationSurLa = new JLabel("Opération sur la borne");
        lblOprationSurLa.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton btnMettreJour = new JButton("Mettre à jour la borne");
        btnMettreJour.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GroupLayout gl_MaintPanelBorne = new GroupLayout(MaintPanelBorne);
        gl_MaintPanelBorne.setHorizontalGroup(
            gl_MaintPanelBorne.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_MaintPanelBorne.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addGroup(gl_MaintPanelBorne.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_MaintPanelBorne.createSequentialGroup()
                            .addComponent(lblOprationSurLa)
                            .addGap(178))
                        .addGroup(Alignment.TRAILING, gl_MaintPanelBorne.createSequentialGroup()
                            .addComponent(btnRedmarrerLaBorne)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(btnMettreJour, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
                            .addGap(57))))
        );
        gl_MaintPanelBorne.setVerticalGroup(
            gl_MaintPanelBorne.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_MaintPanelBorne.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblOprationSurLa)
                    .addGap(26)
                    .addGroup(gl_MaintPanelBorne.createParallelGroup(Alignment.LEADING)
                        .addComponent(btnMettreJour, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRedmarrerLaBorne, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        MaintPanelBorne.setLayout(gl_MaintPanelBorne);
        MaintPanelService.setLayout(gl_MaintPanelService);
        panel.setLayout(gl_panel);
    }
}
