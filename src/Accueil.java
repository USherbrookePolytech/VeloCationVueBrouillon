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
        frmAcceuil.setBounds(100, 100, 555, 221);
        frmAcceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{60, 218, 218, 60, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        frmAcceuil.getContentPane().setLayout(gridBagLayout);
        
        JLabel lblVelocation = new JLabel("VeloCation - Bienvenue !");
        lblVelocation.setFont(new Font("Tahoma", Font.BOLD, 17));
        GridBagConstraints gbc_lblVelocation = new GridBagConstraints();
        gbc_lblVelocation.gridwidth = 2;
        gbc_lblVelocation.insets = new Insets(0, 0, 5, 5);
        gbc_lblVelocation.gridx = 1;
        gbc_lblVelocation.gridy = 0;
        frmAcceuil.getContentPane().add(lblVelocation, gbc_lblVelocation);
        
        JButton btnSinscrire = new JButton("S'inscrire");
        GridBagConstraints gbc_btnSinscrire = new GridBagConstraints();
        gbc_btnSinscrire.gridwidth = 2;
        gbc_btnSinscrire.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnSinscrire.insets = new Insets(0, 0, 5, 5);
        gbc_btnSinscrire.gridx = 1;
        gbc_btnSinscrire.gridy = 2;
        frmAcceuil.getContentPane().add(btnSinscrire, gbc_btnSinscrire);
        
        JButton btnSeConnecter = new JButton("Se Connecter - Temporairement");
        GridBagConstraints gbc_btnSeConnecter = new GridBagConstraints();
        gbc_btnSeConnecter.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnSeConnecter.insets = new Insets(0, 0, 5, 5);
        gbc_btnSeConnecter.gridx = 1;
        gbc_btnSeConnecter.gridy = 3;
        frmAcceuil.getContentPane().add(btnSeConnecter, gbc_btnSeConnecter);
        
        JButton btnSeConnecter_1 = new JButton("Se Connecter ");
        btnSeConnecter_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        GridBagConstraints gbc_btnSeConnecter_1 = new GridBagConstraints();
        gbc_btnSeConnecter_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnSeConnecter_1.insets = new Insets(0, 0, 5, 5);
        gbc_btnSeConnecter_1.gridx = 2;
        gbc_btnSeConnecter_1.gridy = 3;
        frmAcceuil.getContentPane().add(btnSeConnecter_1, gbc_btnSeConnecter_1);
        
        JButton btnAfficherCarte = new JButton("Afficher - Carte bornes");
        GridBagConstraints gbc_btnAfficherCarte = new GridBagConstraints();
        gbc_btnAfficherCarte.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnAfficherCarte.gridwidth = 2;
        gbc_btnAfficherCarte.insets = new Insets(0, 0, 5, 5);
        gbc_btnAfficherCarte.gridx = 1;
        gbc_btnAfficherCarte.gridy = 4;
        frmAcceuil.getContentPane().add(btnAfficherCarte, gbc_btnAfficherCarte);
        
        JButton btnAide = new JButton("Aide");
        GridBagConstraints gbc_btnAide = new GridBagConstraints();
        gbc_btnAide.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnAide.insets = new Insets(0, 0, 0, 5);
        gbc_btnAide.gridx = 1;
        gbc_btnAide.gridy = 5;
        frmAcceuil.getContentPane().add(btnAide, gbc_btnAide);
        
        JButton btnContacterLassistance = new JButton("Contacter l'assistance");
        GridBagConstraints gbc_btnContacterLassistance = new GridBagConstraints();
        gbc_btnContacterLassistance.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnContacterLassistance.insets = new Insets(0, 0, 0, 5);
        gbc_btnContacterLassistance.gridx = 2;
        gbc_btnContacterLassistance.gridy = 5;
        frmAcceuil.getContentPane().add(btnContacterLassistance, gbc_btnContacterLassistance);
    }

}
