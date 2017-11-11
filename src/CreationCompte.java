import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
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
public class CreationCompte
{

    private JFrame frmInscription;
    private JTextField txtNom;
    private JLabel lblNom;
    private JLabel lblPrenom;
    private JTextField txtPrenom;
    private JLabel lblDateDeNaissance;
    private JDateChooser dateChooser;
    private JPanel panel_1;
    private JTextField txtNumero;
    private JLabel lblVoie;
    private JTextField txtVoie;
    private JLabel lblExVoie;
    private JLabel lblexRue;
    private JLabel lblVille;
    private JLabel lblCodePostal;
    private JTextField txtCodepostal;
    private JLabel lblexJhw;
    private JTextField txtVille;
    private JLabel lblexSherbrooke;
    private JLabel lblexDateNaissance;

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
                    CreationCompte window = new CreationCompte();
                    window.frmInscription.setVisible(true);
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
    public CreationCompte()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmInscription = new JFrame();
        frmInscription.setResizable(false);
        frmInscription.setTitle("Inscription");
        frmInscription.setBounds(100, 100, 392, 342);
        frmInscription.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Qui \u00EAtes-vous ?", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Votre adresse principale", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        JButton btnReinitialiser = new JButton("Réinitialiser");
        btnReinitialiser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        
        JButton btnValider = new JButton("Valider");
        GroupLayout groupLayout = new GroupLayout(frmInscription.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(94)
                            .addComponent(btnReinitialiser)
                            .addGap(41)
                            .addComponent(btnValider)))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnReinitialiser)
                        .addComponent(btnValider))
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        
        JLabel lblNumero = new JLabel("Numéro :");
        lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        
        txtNumero = new JTextField();
        txtNumero.setColumns(10);
        
        lblVoie = new JLabel("Voie :");
        
        txtVoie = new JTextField();
        txtVoie.setColumns(10);
        
        lblExVoie = new JLabel("(ex : 1)");
        
        lblexRue = new JLabel("(ex : rue le Montagnais)");
        
        lblVille = new JLabel("Ville :");
        
        lblCodePostal = new JLabel("Code postal :");
        
        txtCodepostal = new JTextField();
        txtCodepostal.setColumns(10);
        
        lblexJhw = new JLabel("(ex : J1H2W3)");
        
        txtVille = new JTextField();
        txtVille.setToolTipText("test");
        txtVille.setColumns(10);
        
        lblexSherbrooke = new JLabel("(ex : Sherbrooke)");
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
            gl_panel_1.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addGap(57)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                        .addComponent(lblCodePostal)
                        .addComponent(lblVille)
                        .addComponent(lblVoie)
                        .addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(lblExVoie))
                        .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(txtVoie, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(lblexRue))
                        .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(txtCodepostal, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(lblexJhw))
                        .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(txtVille, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(lblexSherbrooke)))
                    .addGap(26))
        );
        gl_panel_1.setVerticalGroup(
            gl_panel_1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblExVoie))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtVoie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVoie)
                        .addComponent(lblexRue))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblCodePostal)
                        .addComponent(txtCodepostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblexJhw))
                    .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblVille)
                        .addComponent(txtVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblexSherbrooke))
                    .addContainerGap())
        );
        panel_1.setLayout(gl_panel_1);
        
        txtNom = new JTextField();
        txtNom.setColumns(10);
        
        lblNom = new JLabel("Nom :");
        
        lblPrenom = new JLabel("Prenom :");
        
        txtPrenom = new JTextField();
        txtPrenom.setColumns(10);
        
        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy");
        
        lblDateDeNaissance = new JLabel("Date de naissance :");
        
        lblexDateNaissance = new JLabel("(ex : 31/12/1996)");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
                        .addGroup(gl_panel.createSequentialGroup()
                            .addComponent(lblDateDeNaissance)
                            .addGap(5)
                            .addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(gl_panel.createSequentialGroup()
                            .addGap(52)
                            .addComponent(lblPrenom)
                            .addGap(5)
                            .addComponent(txtPrenom))
                        .addGroup(gl_panel.createSequentialGroup()
                            .addGap(67)
                            .addComponent(lblNom)
                            .addGap(5)
                            .addComponent(txtNom, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(lblexDateNaissance)
                    .addContainerGap(67, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblNom))
                        .addGroup(gl_panel.createSequentialGroup()
                            .addGap(1)
                            .addComponent(txtNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                            .addGap(9)
                            .addComponent(lblPrenom))
                        .addGroup(gl_panel.createSequentialGroup()
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(txtPrenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                            .addGap(9)
                            .addComponent(lblDateDeNaissance))
                        .addGroup(gl_panel.createSequentialGroup()
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                .addComponent(lblexDateNaissance)
                                .addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        frmInscription.getContentPane().setLayout(groupLayout);
    }
}
