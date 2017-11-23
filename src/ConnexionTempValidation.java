import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class ConnexionTempValidation
{

    private JFrame frmConnexionTempValidation;

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
                    ConnexionTempValidation window = new ConnexionTempValidation();
                    window.frmConnexionTempValidation.setVisible(true);
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
    public ConnexionTempValidation()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmConnexionTempValidation = new JFrame();
        frmConnexionTempValidation.setTitle("Vérification téléphone");
        frmConnexionTempValidation.setBounds(0, 0, 600, 500);
        frmConnexionTempValidation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmConnexionTempValidation.setLocationRelativeTo(null);
        
        JButton btnAide = new JButton("Aide");
        btnAide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JPanel CxTempValidationPanelBouton = new JPanel();
        
        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GroupLayout groupLayout = new GroupLayout(frmConnexionTempValidation.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addComponent(CxTempValidationPanelBouton, GroupLayout.PREFERRED_SIZE, 564, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                    .addComponent(CxTempValidationPanelBouton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        
        JLabel CxTempValidationLblEx = new JLabel("(ex : 243)");
        CxTempValidationLblEx.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JTextField CxTempValidationTextFieldCode = new JTextField();
        CxTempValidationTextFieldCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
        CxTempValidationTextFieldCode.setColumns(10);
        
        JLabel CxTempValidationLblCodeReu = new JLabel("Code (3 chiffres)");
        CxTempValidationLblCodeReu.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JLabel CxTempValidationLblSaisirLeCode = new JLabel("Saisir le code reçu par SMS :");
        CxTempValidationLblSaisirLeCode.setFont(new Font("Tahoma", Font.BOLD, 16));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGap(212)
                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addComponent(CxTempValidationLblCodeReu)
                        .addGroup(gl_panel.createSequentialGroup()
                            .addComponent(CxTempValidationTextFieldCode, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(CxTempValidationLblEx)))
                    .addContainerGap(207, Short.MAX_VALUE))
                .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                    .addContainerGap(167, Short.MAX_VALUE)
                    .addComponent(CxTempValidationLblSaisirLeCode)
                    .addGap(163))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CxTempValidationLblSaisirLeCode)
                    .addGap(22)
                    .addComponent(CxTempValidationLblCodeReu)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxTempValidationTextFieldCode, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(CxTempValidationLblEx))
                    .addContainerGap(27, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        
        JButton CxTempValidationBtnValider = new JButton("Valider");
        CxTempValidationBtnValider.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton CxTempValidationBtnAnnuler = new JButton("Annuler");
        CxTempValidationBtnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GroupLayout gl_CxTempValidationPanelBouton = new GroupLayout(CxTempValidationPanelBouton);
        gl_CxTempValidationPanelBouton.setHorizontalGroup(
            gl_CxTempValidationPanelBouton.createParallelGroup(Alignment.TRAILING)
                .addGroup(Alignment.LEADING, gl_CxTempValidationPanelBouton.createSequentialGroup()
                    .addComponent(CxTempValidationBtnAnnuler, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                    .addComponent(CxTempValidationBtnValider, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
        );
        gl_CxTempValidationPanelBouton.setVerticalGroup(
            gl_CxTempValidationPanelBouton.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_CxTempValidationPanelBouton.createSequentialGroup()
                    .addGroup(gl_CxTempValidationPanelBouton.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxTempValidationBtnAnnuler, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addComponent(CxTempValidationBtnValider, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(38, Short.MAX_VALUE))
        );
        CxTempValidationPanelBouton.setLayout(gl_CxTempValidationPanelBouton);
        frmConnexionTempValidation.getContentPane().setLayout(groupLayout);
    }

}
