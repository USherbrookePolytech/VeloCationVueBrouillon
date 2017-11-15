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
import javax.swing.JTextField;

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
        frmScannerVotreCarte.setBounds(100, 100, 450, 184);
        frmScannerVotreCarte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmScannerVotreCarte.setLocationRelativeTo(null);
        
        JButton CxCarteBtnAnnuler = new JButton("Annuler");
        
        JLabel CxCarteLblScannerVotreCarte = new JLabel("Scanner votre carte sur le lecteur");
        CxCarteLblScannerVotreCarte.setFont(new Font("Tahoma", Font.BOLD, 16));
        
        JButton CxCarteBtnAide = new JButton("Aide");
        
        JButton CxCarteBtnScanner = new JButton("Scanner");
        
        JTextField CxCarteTxtId = new JTextField();
        CxCarteTxtId.setColumns(10);
        
        JLabel CxCarteLblVotreId = new JLabel("Votre id :");
        GroupLayout groupLayout = new GroupLayout(frmScannerVotreCarte.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CxCarteLblScannerVotreCarte)
                            .addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                            .addComponent(CxCarteBtnAide, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(116)
                            .addComponent(CxCarteLblVotreId)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(CxCarteTxtId, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addGap(97)
                    .addComponent(CxCarteBtnScanner, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addGap(85))
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap(189, Short.MAX_VALUE)
                    .addComponent(CxCarteBtnAnnuler)
                    .addGap(176))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxCarteBtnAide)
                        .addComponent(CxCarteLblScannerVotreCarte))
                    .addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(CxCarteLblVotreId)
                        .addComponent(CxCarteTxtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(CxCarteBtnScanner)
                    .addGap(11)
                    .addComponent(CxCarteBtnAnnuler)
                    .addGap(33))
        );
        frmScannerVotreCarte.getContentPane().setLayout(groupLayout);
    }
}
