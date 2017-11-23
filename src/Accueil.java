import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Accueil
{

    private JFrame frmAccueil;

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
                    Accueil window = new Accueil();
                    window.frmAccueil.setVisible(true);
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
    public Accueil()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmAccueil = new JFrame();
        frmAccueil.setResizable(false);
        frmAccueil.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
        frmAccueil.setTitle("Accueil");
        frmAccueil.setBounds(100, 100, 652, 242);
        frmAccueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{80, 191, 28, 191, 80, 0};
        gridBagLayout.rowHeights = new int[]{75, 30, 30, 30, 30, 9, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        frmAccueil.getContentPane().setLayout(gridBagLayout);
        frmAccueil.setLocationRelativeTo(null);
        
        JLabel AccueilLblVelocation = new JLabel("VeloCation - Bienvenue !");
        AccueilLblVelocation.setFont(new Font("Tahoma", Font.BOLD, 17));
        GridBagConstraints gbc_AccueilLblVelocation = new GridBagConstraints();
        gbc_AccueilLblVelocation.gridwidth = 3;
        gbc_AccueilLblVelocation.insets = new Insets(0, 0, 5, 5);
        gbc_AccueilLblVelocation.gridx = 1;
        gbc_AccueilLblVelocation.gridy = 0;
        frmAccueil.getContentPane().add(AccueilLblVelocation, gbc_AccueilLblVelocation);
        
        JLabel AccueilLblBienvenue = new JLabel("Borne n°72 - 5 rue de l'Interface - J1H Q4H Sherbrooke");
        AccueilLblBienvenue.setFont(new Font("Tahoma", Font.BOLD, 12));
        GridBagConstraints gbc_AccueilLblBienvenue = new GridBagConstraints();
        gbc_AccueilLblBienvenue.gridwidth = 3;
        gbc_AccueilLblBienvenue.insets = new Insets(0, 0, 5, 5);
        gbc_AccueilLblBienvenue.gridx = 1;
        gbc_AccueilLblBienvenue.gridy = 1;
        frmAccueil.getContentPane().add(AccueilLblBienvenue, gbc_AccueilLblBienvenue);
        
        JButton AccueilBtnAide = new JButton("Aide");
        GridBagConstraints gbc_AccueilBtnAide = new GridBagConstraints();
        gbc_AccueilBtnAide.fill = GridBagConstraints.BOTH;
        gbc_AccueilBtnAide.insets = new Insets(0, 0, 5, 0);
        gbc_AccueilBtnAide.gridx = 4;
        gbc_AccueilBtnAide.gridy = 1;
        frmAccueil.getContentPane().add(AccueilBtnAide, gbc_AccueilBtnAide);
        
        JButton AccueilBtnSinscrire = new JButton("S'inscrire");
        AccueilBtnSinscrire.setFont(new Font("Tahoma", Font.BOLD, 11));
        GridBagConstraints gbc_AccueilBtnSinscrire = new GridBagConstraints();
        gbc_AccueilBtnSinscrire.gridwidth = 3;
        gbc_AccueilBtnSinscrire.fill = GridBagConstraints.BOTH;
        gbc_AccueilBtnSinscrire.insets = new Insets(0, 0, 5, 5);
        gbc_AccueilBtnSinscrire.gridx = 1;
        gbc_AccueilBtnSinscrire.gridy = 2;
        frmAccueil.getContentPane().add(AccueilBtnSinscrire, gbc_AccueilBtnSinscrire);
        
        JButton AccueilBtnSeConnecterTemp = new JButton("Se Connecter - Sans compte");
        AccueilBtnSeConnecterTemp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        GridBagConstraints gbc_AccueilBtnSeConnecterTemp = new GridBagConstraints();
        gbc_AccueilBtnSeConnecterTemp.fill = GridBagConstraints.BOTH;
        gbc_AccueilBtnSeConnecterTemp.insets = new Insets(0, 0, 5, 5);
        gbc_AccueilBtnSeConnecterTemp.gridx = 1;
        gbc_AccueilBtnSeConnecterTemp.gridy = 3;
        frmAccueil.getContentPane().add(AccueilBtnSeConnecterTemp, gbc_AccueilBtnSeConnecterTemp);
        
        JButton AccueilBtnSeConnecter = new JButton("S'identifier - Compte client");
        AccueilBtnSeConnecter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JLabel AccueilLblOu = new JLabel("ou");
        AccueilLblOu.setFont(new Font("Tahoma", Font.BOLD, 14));
        GridBagConstraints gbc_AccueilLblOu = new GridBagConstraints();
        gbc_AccueilLblOu.insets = new Insets(0, 0, 5, 5);
        gbc_AccueilLblOu.gridx = 2;
        gbc_AccueilLblOu.gridy = 3;
        frmAccueil.getContentPane().add(AccueilLblOu, gbc_AccueilLblOu);
        GridBagConstraints gbc_AccueilBtnSeConnecter = new GridBagConstraints();
        gbc_AccueilBtnSeConnecter.fill = GridBagConstraints.BOTH;
        gbc_AccueilBtnSeConnecter.insets = new Insets(0, 0, 5, 5);
        gbc_AccueilBtnSeConnecter.gridx = 3;
        gbc_AccueilBtnSeConnecter.gridy = 3;
        frmAccueil.getContentPane().add(AccueilBtnSeConnecter, gbc_AccueilBtnSeConnecter);
        
        JButton AccueilBtnAfficherCarte = new JButton("Carte bornes");
        AccueilBtnAfficherCarte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        GridBagConstraints gbc_AccueilBtnAfficherCarte = new GridBagConstraints();
        gbc_AccueilBtnAfficherCarte.fill = GridBagConstraints.BOTH;
        gbc_AccueilBtnAfficherCarte.gridwidth = 3;
        gbc_AccueilBtnAfficherCarte.insets = new Insets(0, 0, 5, 5);
        gbc_AccueilBtnAfficherCarte.gridx = 1;
        gbc_AccueilBtnAfficherCarte.gridy = 4;
        frmAccueil.getContentPane().add(AccueilBtnAfficherCarte, gbc_AccueilBtnAfficherCarte);
    }

}
