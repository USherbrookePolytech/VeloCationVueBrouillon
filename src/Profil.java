import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * 
 */

/**
 * @author Bebo
 *
 */
public class Profil
{

    private JFrame frmMonProfil;
    private JTable ProfilTableLocation;
    

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
                    Profil window = new Profil();
                    window.frmMonProfil.setVisible(true);
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
    public Profil()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmMonProfil = new JFrame();
        frmMonProfil.setTitle("Profil");
        frmMonProfil.setResizable(false);
        frmMonProfil.setBounds(100, 100, 542, 398);
        frmMonProfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel ProfilPanel = new JPanel();
        ProfilPanel.setBorder(new TitledBorder(null, "Mon Profil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmMonProfil.getContentPane().add(ProfilPanel, BorderLayout.CENTER);
        
        JTabbedPane ProfilTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        
        JButton ProfilBtnAide = new JButton("Aide");
        ProfilBtnAide.setBackground(new Color(255, 51, 255));
        ProfilBtnAide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        
        JLabel ProfilLblBonjourBienvenue = new JLabel("Bonjour ! Bienvenue sur votre profil ;)");
        ProfilLblBonjourBienvenue.setFont(new Font("Tahoma", Font.BOLD, 14));
        GroupLayout gl_ProfilPanel = new GroupLayout(ProfilPanel);
        gl_ProfilPanel.setHorizontalGroup(
            gl_ProfilPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanel.createSequentialGroup()
                    .addGroup(gl_ProfilPanel.createParallelGroup(Alignment.LEADING)
                        .addComponent(ProfilTabbedPane, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                        .addGroup(Alignment.TRAILING, gl_ProfilPanel.createSequentialGroup()
                            .addComponent(ProfilLblBonjourBienvenue)
                            .addPreferredGap(ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                            .addComponent(ProfilBtnAide)))
                    .addContainerGap())
        );
        gl_ProfilPanel.setVerticalGroup(
            gl_ProfilPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanel.createSequentialGroup()
                    .addGroup(gl_ProfilPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(ProfilBtnAide)
                        .addComponent(ProfilLblBonjourBienvenue))
                    .addGap(17)
                    .addComponent(ProfilTabbedPane, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addContainerGap())
        );
        
        JPanel ProfilPanelLocation = new JPanel();
        ProfilTabbedPane.addTab("Location", null, ProfilPanelLocation, null);
        
        JButton ProfilBtnLouer = new JButton("Louer");
        
        JLabel ProfilLblMesLocationsCours = new JLabel("Mes locations en cours :");
        ProfilLblMesLocationsCours.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        JScrollPane ProfilScrollPaneLocation = new JScrollPane();
        GroupLayout gl_ProfilPanelLocation = new GroupLayout(ProfilPanelLocation);
        gl_ProfilPanelLocation.setHorizontalGroup(
            gl_ProfilPanelLocation.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanelLocation.createSequentialGroup()
                    .addGroup(gl_ProfilPanelLocation.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_ProfilPanelLocation.createSequentialGroup()
                            .addGap(197)
                            .addComponent(ProfilLblMesLocationsCours))
                        .addGroup(gl_ProfilPanelLocation.createSequentialGroup()
                            .addGap(225)
                            .addComponent(ProfilBtnLouer))
                        .addGroup(gl_ProfilPanelLocation.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ProfilScrollPaneLocation, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        gl_ProfilPanelLocation.setVerticalGroup(
            gl_ProfilPanelLocation.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanelLocation.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ProfilLblMesLocationsCours)
                    .addGap(17)
                    .addComponent(ProfilScrollPaneLocation, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(ProfilBtnLouer)
                    .addContainerGap())
        );
        
        ProfilTableLocation = new JTable();
        ProfilTableLocation.setModel(new DefaultTableModel(
            new Object[][] {
                {new Integer(2), "10/11/2017 11:05:23", "11/11/2017 11:00:00"},
            },
            new String[] {
                "Qte.", "Date emprunt", "Date limite retour"
            }
        ) {
            Class[] columnTypes = new Class[] {
                Integer.class, Object.class, Object.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        ProfilTableLocation.getColumnModel().getColumn(0).setResizable(false);
        ProfilTableLocation.getColumnModel().getColumn(0).setPreferredWidth(33);
        ProfilTableLocation.getColumnModel().getColumn(0).setMinWidth(4);
        ProfilTableLocation.getColumnModel().getColumn(1).setPreferredWidth(120);
        ProfilTableLocation.getColumnModel().getColumn(2).setPreferredWidth(120);
        ProfilScrollPaneLocation.setViewportView(ProfilTableLocation);
        ProfilPanelLocation.setLayout(gl_ProfilPanelLocation);
        
        JPanel ProfilPanelInformation = new JPanel();
        ProfilTabbedPane.addTab("Mes informations", null, ProfilPanelInformation, null);
        GroupLayout gl_ProfilPanelInformation = new GroupLayout(ProfilPanelInformation);
        gl_ProfilPanelInformation.setHorizontalGroup(
            gl_ProfilPanelInformation.createParallelGroup(Alignment.LEADING)
                .addGap(0, 509, Short.MAX_VALUE)
        );
        gl_ProfilPanelInformation.setVerticalGroup(
            gl_ProfilPanelInformation.createParallelGroup(Alignment.LEADING)
                .addGap(0, 288, Short.MAX_VALUE)
        );
        ProfilPanelInformation.setLayout(gl_ProfilPanelInformation);
        
        JPanel ProfilPanelInfoAbonnement = new JPanel();
        ProfilTabbedPane.addTab("Mon abonnement", null, ProfilPanelInfoAbonnement, null);
        ProfilPanel.setLayout(gl_ProfilPanel);
    }
}
