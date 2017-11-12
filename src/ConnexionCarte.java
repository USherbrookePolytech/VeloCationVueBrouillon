import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;

public class ConnexionCarte
{

    private JFrame frmScannerVotreCarte;

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
                    ConnexionCarte window = new ConnexionCarte();
                    window.frmScannerVotreCarte.setVisible(true);
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
    public ConnexionCarte()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmScannerVotreCarte = new JFrame();
        frmScannerVotreCarte.setTitle("Scanner votre carte");
        frmScannerVotreCarte.setBounds(100, 100, 450, 151);
        frmScannerVotreCarte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton CxCarteBtnAnnuler = new JButton("Annuler");
        CxCarteBtnAnnuler.setBackground(new Color(255, 0, 0));
        
        JLabel CxCarteLblScannerVotreCarte = new JLabel("Scanner votre carte sur le lecteur");
        CxCarteLblScannerVotreCarte.setFont(new Font("Tahoma", Font.BOLD, 16));
        
        JButton CxCarteBtnAide = new JButton("Aide");
        CxCarteBtnAide.setBackground(new Color(255, 51, 255));
        GroupLayout groupLayout = new GroupLayout(frmScannerVotreCarte.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(81)
                    .addComponent(CxCarteLblScannerVotreCarte)
                    .addContainerGap(81, Short.MAX_VALUE))
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap(371, Short.MAX_VALUE)
                    .addComponent(CxCarteBtnAide, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                    .addGap(183)
                    .addComponent(CxCarteBtnAnnuler)
                    .addContainerGap(182, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CxCarteBtnAide)
                    .addGap(10)
                    .addComponent(CxCarteLblScannerVotreCarte)
                    .addGap(18)
                    .addComponent(CxCarteBtnAnnuler)
                    .addContainerGap(156, Short.MAX_VALUE))
        );
        frmScannerVotreCarte.getContentPane().setLayout(groupLayout);
    }

}
