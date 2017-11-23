import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class ConnexionTempNum
{

    private JFrame frmConnexionTemporaire;
    
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
                    ConnexionTempNum window = new ConnexionTempNum();
                    window.frmConnexionTemporaire.setVisible(true);
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
    public ConnexionTempNum()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmConnexionTemporaire = new JFrame();
        frmConnexionTemporaire.setTitle("Connexion temporaire");
        frmConnexionTemporaire.setBounds(0, 0, 600, 500);
        frmConnexionTemporaire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmConnexionTemporaire.setLocationRelativeTo(null);
        
        JButton btnAide = new JButton("Aide");
        btnAide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JPanel CxTempPanelBouton = new JPanel();
        
        JPanel CxTempPanelSaisie = new JPanel();
        CxTempPanelSaisie.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GroupLayout groupLayout = new GroupLayout(frmConnexionTemporaire.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CxTempPanelSaisie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CxTempPanelBouton, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addContainerGap(498, Short.MAX_VALUE)
                            .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(CxTempPanelSaisie, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                    .addGap(98)
                    .addComponent(CxTempPanelBouton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        
        JLabel CxTempLblCodePays = new JLabel("Code pays");
        CxTempLblCodePays.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JTextField CxTempTextFieldCode = new JTextField();
        CxTempTextFieldCode.setText("+33");
        CxTempTextFieldCode.setColumns(10);
        
        JTextField CxTempTextFieldNumero = new JTextField();
        CxTempTextFieldNumero.setColumns(10);
        
        JLabel CxTempLblNumro = new JLabel("Numéro");
        CxTempLblNumro.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JLabel CxTempLblEx = new JLabel("(ex : 0643302958)");
        CxTempLblEx.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel CxTempLblSaisirVotreNumro = new JLabel("Saisir votre numéro de téléphone :");
        CxTempLblSaisirVotreNumro.setFont(new Font("Tahoma", Font.BOLD, 16));
        GroupLayout gl_CxTempPanelSaisie = new GroupLayout(CxTempPanelSaisie);
        gl_CxTempPanelSaisie.setHorizontalGroup(
            gl_CxTempPanelSaisie.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_CxTempPanelSaisie.createSequentialGroup()
                    .addContainerGap(82, Short.MAX_VALUE)
                    .addGroup(gl_CxTempPanelSaisie.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_CxTempPanelSaisie.createSequentialGroup()
                            .addComponent(CxTempTextFieldCode, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                            .addGap(18)
                            .addComponent(CxTempTextFieldNumero, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                            .addGap(10)
                            .addComponent(CxTempLblEx))
                        .addGroup(gl_CxTempPanelSaisie.createSequentialGroup()
                            .addComponent(CxTempLblCodePays)
                            .addGap(74)
                            .addComponent(CxTempLblNumro)))
                    .addGap(86))
                .addGroup(Alignment.LEADING, gl_CxTempPanelSaisie.createSequentialGroup()
                    .addGap(139)
                    .addComponent(CxTempLblSaisirVotreNumro)
                    .addContainerGap(138, Short.MAX_VALUE))
        );
        gl_CxTempPanelSaisie.setVerticalGroup(
            gl_CxTempPanelSaisie.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_CxTempPanelSaisie.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CxTempLblSaisirVotreNumro)
                    .addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                    .addGroup(gl_CxTempPanelSaisie.createParallelGroup(Alignment.LEADING)
                        .addComponent(CxTempLblCodePays)
                        .addComponent(CxTempLblNumro))
                    .addGap(6)
                    .addGroup(gl_CxTempPanelSaisie.createParallelGroup(Alignment.LEADING)
                        .addComponent(CxTempTextFieldCode, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addGroup(gl_CxTempPanelSaisie.createParallelGroup(Alignment.BASELINE)
                            .addComponent(CxTempTextFieldNumero, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CxTempLblEx)))
                    .addContainerGap())
        );
        CxTempPanelSaisie.setLayout(gl_CxTempPanelSaisie);
        
        JButton CxTempBtnValider = new JButton("Valider");
        CxTempBtnValider.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton CxTempBtnAnnuler = new JButton("Annuler");
        CxTempBtnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GroupLayout gl_CxTempPanelBouton = new GroupLayout(CxTempPanelBouton);
        gl_CxTempPanelBouton.setHorizontalGroup(
            gl_CxTempPanelBouton.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CxTempPanelBouton.createSequentialGroup()
                    .addComponent(CxTempBtnAnnuler, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                    .addComponent(CxTempBtnValider, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
        );
        gl_CxTempPanelBouton.setVerticalGroup(
            gl_CxTempPanelBouton.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_CxTempPanelBouton.createParallelGroup(Alignment.BASELINE)
                    .addComponent(CxTempBtnAnnuler, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(CxTempBtnValider, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
        );
        CxTempPanelBouton.setLayout(gl_CxTempPanelBouton);
        frmConnexionTemporaire.getContentPane().setLayout(groupLayout);
    }
}
