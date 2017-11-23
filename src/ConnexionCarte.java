import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class ConnexionCarte
{

    private JFrame frmScannerVotreCarte;

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
                    ConnexionCarte window = new ConnexionCarte();
                    window.frmScannerVotreCarte.setVisible(true);
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
    public ConnexionCarte()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmScannerVotreCarte = new JFrame();
        frmScannerVotreCarte.setTitle("S'identifier");
        frmScannerVotreCarte.setBounds(0, 0, 600, 500);
        frmScannerVotreCarte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmScannerVotreCarte.setLocationRelativeTo(null);
        
        JButton btnAide = new JButton("Aide");
        
        JPanel CxCartePanel = new JPanel();
        CxCartePanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        
        JPanel CxCartePanelBouton = new JPanel();
        GroupLayout groupLayout = new GroupLayout(frmScannerVotreCarte.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(CxCartePanelBouton, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addComponent(CxCartePanel, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addComponent(btnAide, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(CxCartePanel, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGap(4)
                    .addComponent(CxCartePanelBouton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        
        JButton CxCarteBtnAnnuler = new JButton("Annuler");
        CxCarteBtnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton CxCarteBtnScanner = new JButton("Valider");
        CxCarteBtnScanner.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GroupLayout gl_CxCartePanelBouton = new GroupLayout(CxCartePanelBouton);
        gl_CxCartePanelBouton.setHorizontalGroup(
            gl_CxCartePanelBouton.createParallelGroup(Alignment.TRAILING)
                .addGroup(Alignment.LEADING, gl_CxCartePanelBouton.createSequentialGroup()
                    .addComponent(CxCarteBtnAnnuler, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                    .addComponent(CxCarteBtnScanner, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
        );
        gl_CxCartePanelBouton.setVerticalGroup(
            gl_CxCartePanelBouton.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CxCartePanelBouton.createSequentialGroup()
                    .addGroup(gl_CxCartePanelBouton.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxCarteBtnAnnuler, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addComponent(CxCarteBtnScanner, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                    .addContainerGap())
        );
        CxCartePanelBouton.setLayout(gl_CxCartePanelBouton);
        
        JLabel lblOu = new JLabel("Ou");
        lblOu.setForeground(new Color(255, 0, 0));
        lblOu.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        JPanel CxCartePanelId = new JPanel();
        CxCartePanelId.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        
        JPanel CxCartePanelCarte = new JPanel();
        CxCartePanelCarte.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        GroupLayout gl_CxCartePanel = new GroupLayout(CxCartePanel);
        gl_CxCartePanel.setHorizontalGroup(
            gl_CxCartePanel.createParallelGroup(Alignment.TRAILING)
                .addGroup(Alignment.LEADING, gl_CxCartePanel.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_CxCartePanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_CxCartePanel.createSequentialGroup()
                            .addComponent(lblOu)
                            .addGap(267))
                        .addGroup(Alignment.TRAILING, gl_CxCartePanel.createSequentialGroup()
                            .addGroup(gl_CxCartePanel.createParallelGroup(Alignment.TRAILING)
                                .addComponent(CxCartePanelId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                                .addComponent(CxCartePanelCarte, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                            .addContainerGap())))
        );
        gl_CxCartePanel.setVerticalGroup(
            gl_CxCartePanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CxCartePanel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CxCartePanelCarte, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(lblOu)
                    .addGap(3)
                    .addComponent(CxCartePanelId, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE))
        );
        
        JLabel CxCarteLblScannerVotreCarte = new JLabel("Scanner votre carte sur le lecteur");
        CxCarteLblScannerVotreCarte.setFont(new Font("Tahoma", Font.BOLD, 16));
        
        JLabel CxCarteScannerLogo = new JLabel("");
        CxCarteScannerLogo.setIcon(new ImageIcon(ConnexionCarte.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
        GroupLayout gl_CxCartePanelCarte = new GroupLayout(CxCartePanelCarte);
        gl_CxCartePanelCarte.setHorizontalGroup(
            gl_CxCartePanelCarte.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CxCartePanelCarte.createSequentialGroup()
                    .addGroup(gl_CxCartePanelCarte.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_CxCartePanelCarte.createSequentialGroup()
                            .addGap(246)
                            .addComponent(CxCarteScannerLogo))
                        .addGroup(gl_CxCartePanelCarte.createSequentialGroup()
                            .addGap(134)
                            .addComponent(CxCarteLblScannerVotreCarte)))
                    .addContainerGap(134, Short.MAX_VALUE))
        );
        gl_CxCartePanelCarte.setVerticalGroup(
            gl_CxCartePanelCarte.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CxCartePanelCarte.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CxCarteLblScannerVotreCarte)
                    .addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(CxCarteScannerLogo)
                    .addGap(10))
        );
        CxCartePanelCarte.setLayout(gl_CxCartePanelCarte);
        
        JTextField CxCarteTxtId = new JTextField();
        CxCarteTxtId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        CxCarteTxtId.setColumns(10);
        
        JLabel CxCarteLblVotreId = new JLabel("Votre numéro client :");
        CxCarteLblVotreId.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JLabel lblSaisirVotreIdentifiant = new JLabel("Saisir votre identifiant");
        lblSaisirVotreIdentifiant.setFont(new Font("Tahoma", Font.BOLD, 16));
        GroupLayout gl_CxCartePanelId = new GroupLayout(CxCartePanelId);
        gl_CxCartePanelId.setHorizontalGroup(
            gl_CxCartePanelId.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_CxCartePanelId.createSequentialGroup()
                    .addGap(179)
                    .addComponent(lblSaisirVotreIdentifiant)
                    .addContainerGap(174, Short.MAX_VALUE))
                .addGroup(gl_CxCartePanelId.createSequentialGroup()
                    .addContainerGap(102, Short.MAX_VALUE)
                    .addComponent(CxCarteLblVotreId)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(CxCarteTxtId, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                    .addGap(98))
        );
        gl_CxCartePanelId.setVerticalGroup(
            gl_CxCartePanelId.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CxCartePanelId.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblSaisirVotreIdentifiant)
                    .addGap(18)
                    .addGroup(gl_CxCartePanelId.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxCarteLblVotreId)
                        .addComponent(CxCarteTxtId, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(90, Short.MAX_VALUE))
        );
        CxCartePanelId.setLayout(gl_CxCartePanelId);
        CxCartePanel.setLayout(gl_CxCartePanel);
        frmScannerVotreCarte.getContentPane().setLayout(groupLayout);
    }
}
