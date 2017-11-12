import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class ConnexionTempNum
{

    private JFrame frmConnexionTemporaire;
    private JTextField CxTempTextFieldCode;
    private JTextField CxTempTextFieldNumero;

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
        frmConnexionTemporaire.setBounds(100, 100, 450, 192);
        frmConnexionTemporaire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel CxTempLblSaisirVotreNumro = new JLabel("Saisir votre numéro de téléphone :");
        CxTempLblSaisirVotreNumro.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JLabel CxTempLblCodePays = new JLabel("Code pays");
        
        JLabel CxTempLblNumro = new JLabel("Numéro");
        
        CxTempTextFieldCode = new JTextField();
        CxTempTextFieldCode.setText("+33");
        CxTempTextFieldCode.setColumns(10);
        
        CxTempTextFieldNumero = new JTextField();
        CxTempTextFieldNumero.setColumns(10);
        
        JButton CxTempBtnAnnuler = new JButton("Annuler");
        CxTempBtnAnnuler.setBackground(new Color(255, 0, 0));
        
        JButton CxTempBtnValider = new JButton("Valider");
        CxTempBtnValider.setBackground(new Color(102, 204, 0));
        
        JButton CxTempBtnAide = new JButton("Aide");
        CxTempBtnAide.setBackground(new Color(255, 51, 255));
        
        JLabel CxTempLblEx = new JLabel("(ex : 0643302958)");
        GroupLayout groupLayout = new GroupLayout(frmConnexionTemporaire.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(98)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(CxTempLblSaisirVotreNumro)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(6)
                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                .addComponent(CxTempTextFieldCode, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(CxTempLblCodePays, Alignment.LEADING))
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGap(18)
                                    .addComponent(CxTempTextFieldNumero, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(CxTempLblEx))
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGap(74)
                                    .addComponent(CxTempLblNumro))))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(47)
                            .addComponent(CxTempBtnAnnuler)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(CxTempBtnValider)))
                    .addContainerGap(53, Short.MAX_VALUE))
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap(371, Short.MAX_VALUE)
                    .addComponent(CxTempBtnAide, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CxTempBtnAide)
                    .addGap(8)
                    .addComponent(CxTempLblSaisirVotreNumro)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxTempLblCodePays)
                        .addComponent(CxTempLblNumro))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxTempTextFieldCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(CxTempTextFieldNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(CxTempLblEx))
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxTempBtnAnnuler)
                        .addComponent(CxTempBtnValider))
                    .addContainerGap(115, Short.MAX_VALUE))
        );
        frmConnexionTemporaire.getContentPane().setLayout(groupLayout);
    }
}
