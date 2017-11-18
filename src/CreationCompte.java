import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreationCompte
{

    private JFrame frmInscription;

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
        frmInscription.setBounds(100, 100, 450, 450);
        frmInscription.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmInscription.setLocationRelativeTo(null);

        JPanel CreationPanelVous = new JPanel();
        CreationPanelVous.setBorder(
                new TitledBorder(null, "Qui \u00EAtes-vous ?", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        JPanel CreationPanelAdresse = new JPanel();
        CreationPanelAdresse.setBorder(
                new TitledBorder(null, "Votre adresse principale", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        JButton CreationBtnReinitialiser = new JButton("Réinitialiser");
        CreationBtnReinitialiser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
            }
        });

        JButton CreationBtnValider = new JButton("Valider");
        CreationBtnValider.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
            }
        });

        JButton CreationBtnRetour = new JButton("Retour");
        CreationBtnRetour.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
            }
        });

        JLabel lblChampObligatoire = new JLabel("<html><font color='red'>* Champs obligatoires</font></html>");
        GroupLayout groupLayout = new GroupLayout(frmInscription.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(88)
                            .addComponent(CreationBtnRetour)
                            .addGap(18)
                            .addComponent(CreationBtnReinitialiser)
                            .addGap(18)
                            .addComponent(CreationBtnValider))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblChampObligatoire))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CreationPanelVous, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CreationPanelAdresse, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(16)
                    .addComponent(CreationPanelVous, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(CreationPanelAdresse, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                    .addComponent(lblChampObligatoire)
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CreationBtnReinitialiser)
                        .addComponent(CreationBtnValider)
                        .addComponent(CreationBtnRetour))
                    .addGap(15))
        );

        JLabel lblNumero = new JLabel("<html>Adresse <font color='red'>*</font></html>");
        lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);

        JTextField txtNumero = new JTextField();
        txtNumero.setColumns(10);

        JLabel lblCodePostal = new JLabel("<html>Code postal <font color='red'>*</font></html>");
        lblCodePostal.setHorizontalAlignment(SwingConstants.RIGHT);

        JTextField txtCodepostal = new JTextField();
        txtCodepostal.setColumns(10);

        JTextField txtVille = new JTextField();
        txtVille.setToolTipText("test");
        txtVille.setColumns(10);

        JLabel lblVille = new JLabel("<html>Ville <font color='red'>*</font></html>");
        lblVille.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel labelRequis1 = new JLabel("");
        labelRequis1.setForeground(Color.RED);
        labelRequis1.setFont(new Font("Tahoma", Font.PLAIN, 10));

        JLabel labelRequis2 = new JLabel("");
        labelRequis2.setForeground(Color.RED);
        labelRequis2.setFont(new Font("Tahoma", Font.PLAIN, 10));

        JLabel labelRequis3 = new JLabel("");
        labelRequis3.setForeground(Color.RED);
        labelRequis3.setFont(new Font("Tahoma", Font.PLAIN, 10));

        JLabel labelRequis4 = new JLabel("");
        labelRequis4.setForeground(Color.RED);
        labelRequis4.setFont(new Font("Tahoma", Font.PLAIN, 10));
        GroupLayout gl_CreationPanelAdresse = new GroupLayout(CreationPanelAdresse);
        gl_CreationPanelAdresse.setHorizontalGroup(
            gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CreationPanelAdresse.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblVille, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.TRAILING)
                            .addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodePostal, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(txtNumero, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(txtCodepostal, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVille, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                        .addComponent(labelRequis1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRequis2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRequis3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRequis4, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_CreationPanelAdresse.setVerticalGroup(
            gl_CreationPanelAdresse.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CreationPanelAdresse.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRequis1)
                        .addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtCodepostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRequis2)
                        .addComponent(lblCodePostal))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_CreationPanelAdresse.createParallelGroup(Alignment.BASELINE)
                        .addComponent(txtVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRequis3)
                        .addComponent(lblVille))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(labelRequis4)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        JLabel lblDateDeNaissance = new JLabel("<html>Date de naissance <font color='red'>*</font></html>");
        lblDateDeNaissance.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel lblTelephone = new JLabel("<html>Téléphone <font color='red'>*</font></html>");
        lblTelephone.setHorizontalAlignment(SwingConstants.RIGHT);

        JTextField txtTelephone = new JTextField();
        txtTelephone.setColumns(10);

        JLabel lblCourriel = new JLabel("Courriel   ");
        lblCourriel.setHorizontalAlignment(SwingConstants.RIGHT);

        JTextField txtCourriel = new JTextField();
        txtCourriel.setForeground(Color.BLACK);
        txtCourriel.setColumns(10);

        JLabel lblNom = new JLabel("<html> Nom <font color='red'>*</font></html>");
        lblNom.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel lblCivilite = new JLabel("<html> Civilité <font color='red'>*</font></html>");
        lblCivilite.setHorizontalAlignment(SwingConstants.RIGHT);

        JRadioButton rdbtnMr = new JRadioButton("M.");
        rdbtnMr.setToolTipText("");

        JRadioButton rdbtnMme = new JRadioButton("Mme");

        JRadioButton rdbtnMlle = new JRadioButton("Mlle");

        ButtonGroup groupeRadioBtn = new ButtonGroup();
        
        groupeRadioBtn.add(rdbtnMr);
        groupeRadioBtn.add(rdbtnMlle);
        groupeRadioBtn.add(rdbtnMme);

        JLabel labelRequis5 = new JLabel("");
        labelRequis5.setForeground(Color.RED);
        labelRequis5.setFont(new Font("Tahoma", Font.PLAIN, 10));

        JLabel labelRequis6 = new JLabel("");
        labelRequis6.setForeground(Color.RED);
        labelRequis6.setFont(new Font("Tahoma", Font.PLAIN, 10));

        JLabel labelRequis7 = new JLabel("");
        labelRequis7.setForeground(Color.RED);
        labelRequis7.setFont(new Font("Tahoma", Font.PLAIN, 10));

        JLabel labelRequis8 = new JLabel("");
        labelRequis8.setForeground(Color.RED);
        labelRequis8.setFont(new Font("Tahoma", Font.PLAIN, 10));

        JLabel labelRequis9 = new JLabel("");
        labelRequis9.setForeground(Color.RED);
        labelRequis9.setFont(new Font("Tahoma", Font.PLAIN, 10));
        GroupLayout gl_CreationPanelVous = new GroupLayout(CreationPanelVous);
        gl_CreationPanelVous
                .setHorizontalGroup(
                        gl_CreationPanelVous
                                .createParallelGroup(
                                        Alignment.TRAILING)
                                .addGroup(gl_CreationPanelVous.createSequentialGroup().addContainerGap()
                                        .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.TRAILING).addGroup(
                                                gl_CreationPanelVous.createSequentialGroup().addGroup(
                                                        gl_CreationPanelVous
                                                                .createParallelGroup(Alignment.TRAILING).addGroup(
                                                                        gl_CreationPanelVous
                                                                                .createSequentialGroup()
                                                                                .addGroup(gl_CreationPanelVous
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addComponent(lblCivilite)
                                                                                        .addComponent(
                                                                                                lblDateDeNaissance,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                121,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        ComponentPlacement.RELATED))
                                                                .addComponent(lblTelephone, GroupLayout.DEFAULT_SIZE,
                                                                        121, Short.MAX_VALUE)
                                                                .addComponent(lblPrenom, GroupLayout.DEFAULT_SIZE, 121,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 72,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGap(20))
                                                .addGroup(gl_CreationPanelVous.createSequentialGroup()
                                                        .addComponent(lblCourriel).addGap(18)))
                                        .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.LEADING)
                                                .addGroup(gl_CreationPanelVous.createSequentialGroup()
                                                        .addComponent(rdbtnMr)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(rdbtnMme)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(rdbtnMlle)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(labelRequis9, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(Alignment.TRAILING, gl_CreationPanelVous
                                                        .createSequentialGroup()
                                                        .addGroup(gl_CreationPanelVous
                                                                .createParallelGroup(Alignment.TRAILING)
                                                                .addComponent(txtCourriel, Alignment.LEADING,
                                                                        GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                                                .addGroup(gl_CreationPanelVous.createSequentialGroup()
                                                                        .addGroup(gl_CreationPanelVous
                                                                                .createParallelGroup(Alignment.LEADING)
                                                                                .addComponent(txtTelephone,
                                                                                        GroupLayout.DEFAULT_SIZE, 120,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(dateChooser,
                                                                                        GroupLayout.DEFAULT_SIZE, 120,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(txtPrenom,
                                                                                        GroupLayout.DEFAULT_SIZE, 120,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(txtNom,
                                                                                        Alignment.TRAILING,
                                                                                        GroupLayout.PREFERRED_SIZE, 120,
                                                                                        GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                        .addGroup(gl_CreationPanelVous
                                                                                .createParallelGroup(Alignment.LEADING)
                                                                                .addComponent(labelRequis5)
                                                                                .addComponent(labelRequis6,
                                                                                        GroupLayout.PREFERRED_SIZE, 97,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelRequis7,
                                                                                        GroupLayout.PREFERRED_SIZE, 97,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelRequis8,
                                                                                        GroupLayout.PREFERRED_SIZE, 97,
                                                                                        GroupLayout.PREFERRED_SIZE))))
                                                        .addGap(24)))));
        gl_CreationPanelVous.setVerticalGroup(gl_CreationPanelVous.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CreationPanelVous.createSequentialGroup().addGap(9)
                        .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE).addComponent(lblCivilite)
                                .addComponent(rdbtnMr).addComponent(rdbtnMme).addComponent(rdbtnMlle)
                                .addComponent(labelRequis9, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                                .addComponent(txtNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelRequis5).addComponent(lblNom))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                                .addComponent(txtPrenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelRequis6).addComponent(lblPrenom))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                                .addComponent(txtTelephone, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelRequis7).addComponent(lblTelephone))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(gl_CreationPanelVous.createParallelGroup(Alignment.TRAILING)
                                .addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelRequis8).addComponent(lblDateDeNaissance))
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addGroup(
                                gl_CreationPanelVous.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(txtCourriel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCourriel))
                        .addContainerGap()));
        CreationPanelVous.setLayout(gl_CreationPanelVous);
        frmInscription.getContentPane().setLayout(groupLayout);
    }
}
