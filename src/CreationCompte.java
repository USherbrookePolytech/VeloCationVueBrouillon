import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
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
import java.awt.Color;

public class CreationCompte
{

    private JFrame frmInscription;
    private JTextField textTelephone;
    private JTextField textCourriel;

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
        frmInscription.setBounds(100, 100, 450, 452);
        frmInscription.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel CreationPanelVous = new JPanel();
        CreationPanelVous.setBorder(new TitledBorder(null, "Qui \u00EAtes-vous ?", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        JPanel CreationPanelAdresse = new JPanel();
        CreationPanelAdresse.setBorder(new TitledBorder(null, "Votre adresse principale", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        JButton CreationBtnReinitialiser = new JButton("Réinitialiser");
        CreationBtnReinitialiser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        
        JButton CreationBtnValider = new JButton("Valider");
        
        JButton CreationBtnRetour = new JButton("Retour");
        
        JLabel lblChampObligatoire = new JLabel("<html><font color='red'>* Champs obligatoire</font></html>");
        GroupLayout groupLayout = new GroupLayout(frmInscription.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(96)
                            .addComponent(CreationBtnRetour)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(CreationBtnReinitialiser)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(CreationBtnValider))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CreationPanelVous, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CreationPanelAdresse, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblChampObligatoire)))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CreationPanelVous, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(CreationPanelAdresse, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(lblChampObligatoire)
                    .addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CreationBtnValider)
                        .addComponent(CreationBtnReinitialiser)
                        .addComponent(CreationBtnRetour))
                    .addGap(15))
        );
        
        JLabel lblNumero = new JLabel("<html>Numéro <font color='red'>*</font></html>");
        lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField txtNumero = new JTextField();
        txtNumero.setColumns(10);
        
        JLabel lblVoie = new JLabel("<html>Voie <font color='red'>*</font></html>");
        lblVoie.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField txtVoie = new JTextField();
        txtVoie.setColumns(10);
        
        JLabel lblExVoie = new JLabel("(ex : 1)");
        
        JLabel lblexRue = new JLabel("(ex : rue du pré)");
        
        JLabel lblCodePostal = new JLabel("<html>Code postal <font color='red'>*</font></html>");
        lblCodePostal.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField txtCodepostal = new JTextField();
        txtCodepostal.setColumns(10);
        
        JLabel lblexJhw = new JLabel("(ex : J1H2W3)");
        
        JTextField txtVille = new JTextField();
        txtVille.setToolTipText("test");
        txtVille.setColumns(10);
        
        JLabel lblexSherbrooke = new JLabel("(ex : Sherbrooke)");
        
        JLabel lblVille = new JLabel("<html>Ville <font color='red'>*</font></html>");
        lblVille.setHorizontalAlignment(SwingConstants.RIGHT);
        GroupLayout gl_CreationPanelAdresse = new GroupLayout(CreationPanelAdresse);
        gl_CreationPanelAdresse.setHorizontalGroup(
            gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_CreationPanelAdresse.createSequentialGroup()
                    .addContainerGap(53, Short.MAX_VALUE)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.TRAILING)
                        .addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVoie, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodePostal, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVille, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_CreationPanelAdresse.createSequentialGroup()
                            .addComponent(txtVille, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addGap(18)
                            .addComponent(lblexSherbrooke))
                        .addGroup(gl_CreationPanelAdresse.createSequentialGroup()
                            .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                                .addComponent(txtVoie, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addGroup(gl_CreationPanelAdresse.createSequentialGroup()
                                    .addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                    .addGap(16)
                                    .addComponent(lblExVoie)))
                            .addGap(16)
                            .addComponent(lblexRue))
                        .addGroup(gl_CreationPanelAdresse.createSequentialGroup()
                            .addComponent(txtCodepostal, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(lblexJhw)))
                    .addContainerGap())
        );
        gl_CreationPanelAdresse.setVerticalGroup(
            gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CreationPanelAdresse.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblExVoie))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtVoie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVoie)
                        .addComponent(lblexRue))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtCodepostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblexJhw)
                        .addComponent(lblCodePostal))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblexSherbrooke)
                        .addComponent(lblVille))
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        CreationPanelAdresse.setLayout(gl_CreationPanelAdresse);
        
        JTextField txtNom = new JTextField();
        txtNom.setColumns(10);
        
        JLabel lblPrenom = new JLabel("<html>Prenom <font color='red'>*</font></html>");
        lblPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField txtPrenom = new JTextField();
        txtPrenom.setColumns(10);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy");
        
        JLabel lblDateDeNaissance = new JLabel("Date de naissance   ");
        lblDateDeNaissance.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JLabel lblexDateNaissance = new JLabel("(ex : 31/12/1996)");
        lblexDateNaissance.setHorizontalAlignment(SwingConstants.LEFT);
        
        JLabel lblTelephone = new JLabel("<html>Téléphone <font color='red'>*</font></html>");
        lblTelephone.setHorizontalAlignment(SwingConstants.RIGHT);
        
        textTelephone = new JTextField();
        textTelephone.setColumns(10);
        
        JLabel lblCourriel = new JLabel("Courriel   ");
        lblCourriel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JLabel lblGjirgjiregjiregjirejgiejgre = new JLabel("(ex : 0631437289)");
        
        textCourriel = new JTextField();
        textCourriel.setColumns(10);
        
        JLabel lblNom = new JLabel("<html> Nom <font color='red'>*</font></html>");
        lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
        GroupLayout gl_CreationPanelVous = new GroupLayout(CreationPanelVous);
        gl_CreationPanelVous.setHorizontalGroup(
            gl_CreationPanelVous.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CreationPanelVous.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.TRAILING)
                        .addComponent(lblCourriel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelephone, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrenom, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDateDeNaissance, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNom)
                        .addComponent(txtPrenom)
                        .addComponent(textTelephone)
                        .addComponent(textCourriel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblexDateNaissance)
                        .addComponent(lblGjirgjiregjiregjirejgiejgre))
                    .addGap(33))
        );
        gl_CreationPanelVous.setVerticalGroup(
            gl_CreationPanelVous.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CreationPanelVous.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNom))
                    .addGap(9)
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtPrenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrenom))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                        .addComponent(textTelephone, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelephone))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                        .addComponent(textCourriel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCourriel)
                        .addComponent(lblGjirgjiregjiregjirejgiejgre))
                    .addGap(8)
                    .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.TRAILING)
                        .addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblexDateNaissance)
                        .addComponent(lblDateDeNaissance))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreationPanelVous.setLayout(gl_CreationPanelVous);
        frmInscription.getContentPane().setLayout(groupLayout);
    }
}
