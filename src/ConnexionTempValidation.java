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
        frmConnexionTempValidation.setBounds(100, 100, 450, 194);
        frmConnexionTempValidation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmConnexionTempValidation.setLocationRelativeTo(null);
        
        JLabel CxTempValidationLblSaisirLeCode = new JLabel("Saisir le code reçu par SMS :");
        CxTempValidationLblSaisirLeCode.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton CxTempValidationBtnAide = new JButton("Aide");
        CxTempValidationBtnAide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JLabel CxTempValidationLblCodeReu = new JLabel("Code (3 chiffres)");
        
        JTextField CxTempValidationTextFieldCode = new JTextField();
        CxTempValidationTextFieldCode.setColumns(10);
        
        JLabel CxTempValidationLblEx = new JLabel("(ex : 243)");
        
        JButton CxTempValidationBtnValider = new JButton("Valider");
        
        JButton CxTempValidationBtnAnnuler = new JButton("Annuler");
        GroupLayout groupLayout = new GroupLayout(frmConnexionTempValidation.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(174)
                    .addComponent(CxTempValidationLblCodeReu)
                    .addContainerGap(179, Short.MAX_VALUE))
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(185)
                    .addComponent(CxTempValidationTextFieldCode, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addGap(10)
                    .addComponent(CxTempValidationLblEx)
                    .addContainerGap(121, Short.MAX_VALUE))
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap(344, Short.MAX_VALUE)
                    .addComponent(CxTempValidationBtnAide, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                    .addGap(118)
                    .addComponent(CxTempValidationLblSaisirLeCode, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGap(118))
                .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                    .addGap(139)
                    .addComponent(CxTempValidationBtnAnnuler, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(CxTempValidationBtnValider, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CxTempValidationBtnAide)
                    .addGap(8)
                    .addComponent(CxTempValidationLblSaisirLeCode, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(CxTempValidationLblCodeReu)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(9)
                            .addComponent(CxTempValidationLblEx))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(6)
                            .addComponent(CxTempValidationTextFieldCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(9)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxTempValidationBtnAnnuler)
                        .addComponent(CxTempValidationBtnValider))
                    .addContainerGap(18, Short.MAX_VALUE))
        );
        frmConnexionTempValidation.getContentPane().setLayout(groupLayout);
    }

}
