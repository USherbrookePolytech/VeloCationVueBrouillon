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
import java.awt.Font;
import javax.swing.JScrollPane;
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
    private JTable ProfilTableInformation;
    private JTable ProfilTableInfoAbonnement;
    

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
        
        JScrollPane ProfilScrollPaneInformation = new JScrollPane();
        
        JButton ProfilBtnSeDesinscrire = new JButton("Se désinscrire");
        GroupLayout gl_ProfilPanelInformation = new GroupLayout(ProfilPanelInformation);
        gl_ProfilPanelInformation.setHorizontalGroup(
            gl_ProfilPanelInformation.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanelInformation.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_ProfilPanelInformation.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_ProfilPanelInformation.createSequentialGroup()
                            .addComponent(ProfilScrollPaneInformation, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, gl_ProfilPanelInformation.createSequentialGroup()
                            .addComponent(ProfilBtnSeDesinscrire)
                            .addGap(202))))
        );
        gl_ProfilPanelInformation.setVerticalGroup(
            gl_ProfilPanelInformation.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanelInformation.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ProfilScrollPaneInformation, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(ProfilBtnSeDesinscrire)
                    .addContainerGap(171, Short.MAX_VALUE))
        );
        
        ProfilTableInformation = new JTable();
        ProfilTableInformation.setShowHorizontalLines(false);
        ProfilTableInformation.setModel(new DefaultTableModel(
            new Object[][] {
                {"Efema", "Dodu", "31/12/1996", new Integer(1), "rue du Montagnais", "J1HQ23", "Sherbrooke"},
            },
            new String[] {
                "Nom", "Pr\u00E9nom", "Date Naissance", "N\u00B0 voie", "Voie", "Code postal", "Ville"
            }
        ) {
            Class[] columnTypes = new Class[] {
                String.class, Object.class, Object.class, Integer.class, Object.class, Object.class, Object.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        ProfilTableInformation.getColumnModel().getColumn(0).setResizable(false);
        ProfilTableInformation.getColumnModel().getColumn(1).setResizable(false);
        ProfilTableInformation.getColumnModel().getColumn(2).setResizable(false);
        ProfilTableInformation.getColumnModel().getColumn(2).setPreferredWidth(96);
        ProfilTableInformation.getColumnModel().getColumn(3).setResizable(false);
        ProfilTableInformation.getColumnModel().getColumn(3).setPreferredWidth(45);
        ProfilTableInformation.getColumnModel().getColumn(4).setPreferredWidth(104);
        ProfilTableInformation.getColumnModel().getColumn(5).setPreferredWidth(67);
        ProfilTableInformation.getColumnModel().getColumn(6).setResizable(false);
        ProfilScrollPaneInformation.setViewportView(ProfilTableInformation);
        ProfilPanelInformation.setLayout(gl_ProfilPanelInformation);
        
        JPanel ProfilPanelInfoAbonnement = new JPanel();
        ProfilTabbedPane.addTab("Mon abonnement", null, ProfilPanelInfoAbonnement, null);
        
        JScrollPane ProfilScrollPaneInfoAbonnement = new JScrollPane();
        
        JButton ProfilButtonResilier = new JButton("Résilier");
        
        JButton ProfilBtnRenouveler = new JButton("Renouveler");
        
        JButton ProfilBtnChanger = new JButton("Changer");
        GroupLayout gl_ProfilPanelInfoAbonnement = new GroupLayout(ProfilPanelInfoAbonnement);
        gl_ProfilPanelInfoAbonnement.setHorizontalGroup(
            gl_ProfilPanelInfoAbonnement.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanelInfoAbonnement.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ProfilScrollPaneInfoAbonnement, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(Alignment.TRAILING, gl_ProfilPanelInfoAbonnement.createSequentialGroup()
                    .addContainerGap(65, Short.MAX_VALUE)
                    .addComponent(ProfilButtonResilier, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addGap(55)
                    .addComponent(ProfilBtnChanger)
                    .addGap(49)
                    .addComponent(ProfilBtnRenouveler)
                    .addGap(81))
        );
        gl_ProfilPanelInfoAbonnement.setVerticalGroup(
            gl_ProfilPanelInfoAbonnement.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_ProfilPanelInfoAbonnement.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ProfilScrollPaneInfoAbonnement, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addGroup(gl_ProfilPanelInfoAbonnement.createParallelGroup(Alignment.BASELINE)
                        .addComponent(ProfilButtonResilier)
                        .addComponent(ProfilBtnRenouveler)
                        .addComponent(ProfilBtnChanger))
                    .addContainerGap(171, Short.MAX_VALUE))
        );
        
        ProfilTableInfoAbonnement = new JTable();
        ProfilTableInfoAbonnement.setShowHorizontalLines(false);
        ProfilTableInfoAbonnement.setRowSelectionAllowed(false);
        ProfilTableInfoAbonnement.setModel(new DefaultTableModel(
            new Object[][] {
                {new Integer(1), "10/11/2017 11:03:20", "10/12/2017 11:03:20", new Integer(50)},
            },
            new String[] {
                "Dur\u00E9e en mois", "Date d\u00E9but", "Date fin", "Prix $CAN"
            }
        ) {
            Class[] columnTypes = new Class[] {
                Integer.class, Object.class, Object.class, Integer.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
            boolean[] columnEditables = new boolean[] {
                false, false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        ProfilTableInfoAbonnement.getColumnModel().getColumn(0).setResizable(false);
        ProfilTableInfoAbonnement.getColumnModel().getColumn(0).setPreferredWidth(83);
        ProfilTableInfoAbonnement.getColumnModel().getColumn(1).setResizable(false);
        ProfilTableInfoAbonnement.getColumnModel().getColumn(1).setPreferredWidth(120);
        ProfilTableInfoAbonnement.getColumnModel().getColumn(2).setResizable(false);
        ProfilTableInfoAbonnement.getColumnModel().getColumn(2).setPreferredWidth(120);
        ProfilTableInfoAbonnement.getColumnModel().getColumn(3).setResizable(false);
        ProfilTableInfoAbonnement.getColumnModel().getColumn(3).setPreferredWidth(58);
        ProfilScrollPaneInfoAbonnement.setViewportView(ProfilTableInfoAbonnement);
        ProfilPanelInfoAbonnement.setLayout(gl_ProfilPanelInfoAbonnement);
        ProfilPanel.setLayout(gl_ProfilPanel);
    }
}
