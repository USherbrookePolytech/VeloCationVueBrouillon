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

/**
 * 
 */

/**
 * @author Bebo
 *
 */
public class Accueil
{

    private JFrame frmAcceuil;

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
                    window.frmAcceuil.setVisible(true);
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
        frmAcceuil = new JFrame();
        frmAcceuil.setResizable(false);
        frmAcceuil.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
        frmAcceuil.setTitle("Accueil");
        frmAcceuil.setBounds(100, 100, 555, 219);
        frmAcceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{80, 191, 0, 191, 80, 0};
        gridBagLayout.rowHeights = new int[]{0, 55, 0, 0, 0, 9, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        frmAcceuil.getContentPane().setLayout(gridBagLayout);
        
        JLabel lblVelocation = new JLabel("VeloCation - Bienvenue !");
        lblVelocation.setFont(new Font("Tahoma", Font.BOLD, 17));
        GridBagConstraints gbc_lblVelocation = new GridBagConstraints();
        gbc_lblVelocation.fill = GridBagConstraints.VERTICAL;
        gbc_lblVelocation.gridwidth = 3;
        gbc_lblVelocation.insets = new Insets(0, 0, 5, 5);
        gbc_lblVelocation.gridx = 1;
        gbc_lblVelocation.gridy = 0;
        frmAcceuil.getContentPane().add(lblVelocation, gbc_lblVelocation);
        
        JLabel lblBienvenue = new JLabel("Borne n°72 - 5 rue de l'Interface - J1H Q4H Sherbrooke");
        lblBienvenue.setFont(new Font("Tahoma", Font.BOLD, 12));
        GridBagConstraints gbc_lblBienvenue = new GridBagConstraints();
        gbc_lblBienvenue.gridwidth = 3;
        gbc_lblBienvenue.insets = new Insets(0, 0, 5, 5);
        gbc_lblBienvenue.gridx = 1;
        gbc_lblBienvenue.gridy = 1;
        frmAcceuil.getContentPane().add(lblBienvenue, gbc_lblBienvenue);
        
        JButton btnAide = new JButton("Aide");
        btnAide.setBackground(new Color(255, 51, 255));
        GridBagConstraints gbc_btnAide = new GridBagConstraints();
        gbc_btnAide.insets = new Insets(0, 0, 5, 0);
        gbc_btnAide.gridx = 4;
        gbc_btnAide.gridy = 1;
        frmAcceuil.getContentPane().add(btnAide, gbc_btnAide);
        
        JButton btnSinscrire = new JButton("S'inscrire");
        btnSinscrire.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSinscrire.setBackground(new Color(0, 255, 51));
        GridBagConstraints gbc_btnSinscrire = new GridBagConstraints();
        gbc_btnSinscrire.gridwidth = 3;
        gbc_btnSinscrire.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnSinscrire.insets = new Insets(0, 0, 5, 5);
        gbc_btnSinscrire.gridx = 1;
        gbc_btnSinscrire.gridy = 2;
        frmAcceuil.getContentPane().add(btnSinscrire, gbc_btnSinscrire);
        
        JButton btnSeConnecter = new JButton("Se Connecter - Sans compte");
        btnSeConnecter.setBackground(new Color(255, 255, 255));
        btnSeConnecter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        GridBagConstraints gbc_btnSeConnecter = new GridBagConstraints();
        gbc_btnSeConnecter.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnSeConnecter.insets = new Insets(0, 0, 5, 5);
        gbc_btnSeConnecter.gridx = 1;
        gbc_btnSeConnecter.gridy = 3;
        frmAcceuil.getContentPane().add(btnSeConnecter, gbc_btnSeConnecter);
        
        JButton btnSeConnecter_1 = new JButton("S'identifier - Compte client");
        btnSeConnecter_1.setBackground(new Color(51, 0, 255));
        btnSeConnecter_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JLabel lblOu = new JLabel("ou");
        GridBagConstraints gbc_lblOu = new GridBagConstraints();
        gbc_lblOu.insets = new Insets(0, 0, 5, 5);
        gbc_lblOu.gridx = 2;
        gbc_lblOu.gridy = 3;
        frmAcceuil.getContentPane().add(lblOu, gbc_lblOu);
        GridBagConstraints gbc_btnSeConnecter_1 = new GridBagConstraints();
        gbc_btnSeConnecter_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnSeConnecter_1.insets = new Insets(0, 0, 5, 5);
        gbc_btnSeConnecter_1.gridx = 3;
        gbc_btnSeConnecter_1.gridy = 3;
        frmAcceuil.getContentPane().add(btnSeConnecter_1, gbc_btnSeConnecter_1);
        
        JButton btnAfficherCarte = new JButton("Carte bornes");
        GridBagConstraints gbc_btnAfficherCarte = new GridBagConstraints();
        gbc_btnAfficherCarte.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnAfficherCarte.gridwidth = 3;
        gbc_btnAfficherCarte.insets = new Insets(0, 0, 5, 5);
        gbc_btnAfficherCarte.gridx = 1;
        gbc_btnAfficherCarte.gridy = 4;
        frmAcceuil.getContentPane().add(btnAfficherCarte, gbc_btnAfficherCarte);
    }

}
