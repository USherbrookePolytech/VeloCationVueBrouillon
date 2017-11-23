import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LouerVelo2
{

    private JFrame frmLouer;
    private JTable table;

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
                    LouerVelo2 window = new LouerVelo2();
                    window.frmLouer.setVisible(true);
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
    public LouerVelo2()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmLouer = new JFrame();
        frmLouer.setTitle("Louer");
        frmLouer.setBounds(100, 100, 485, 267);
        frmLouer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmLouer.setLocationRelativeTo(null);
        
        JPanel LouerPanel = new JPanel();
        LouerPanel.setBorder(new TitledBorder(null, "Choisir votre location", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmLouer.getContentPane().add(LouerPanel, BorderLayout.NORTH);
        
        JLabel LouerLblNombreDeVlo = new JLabel("Nombre de vélo souhaité :");
        
        JSpinner LouerSpinnerVelo = new JSpinner();
        
        JLabel LouerLblVotreLocationSera = new JLabel("Votre location sera valable 24 heures");
        LouerLblVotreLocationSera.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton LouerBtnAide = new JButton("Aide");
        
        JButton LouerBtnValider = new JButton("Valider");
        
        JButton LouerBtnAnnuler = new JButton("Annuler");
        
        JScrollPane scrollPane = new JScrollPane();
        
        JLabel lblPourVlo = new JLabel("Pour 1 vélo");
        lblPourVlo.setFont(new Font("Tahoma", Font.BOLD, 13));
        GroupLayout gl_LouerPanel = new GroupLayout(LouerPanel);
        gl_LouerPanel.setHorizontalGroup(
            gl_LouerPanel.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addGap(23)
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_LouerPanel.createParallelGroup(Alignment.TRAILING, false)
                            .addGroup(gl_LouerPanel.createSequentialGroup()
                                .addComponent(LouerLblVotreLocationSera)
                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LouerBtnAide, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPourVlo, Alignment.LEADING)
                            .addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addComponent(LouerLblNombreDeVlo)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(LouerSpinnerVelo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(17, Short.MAX_VALUE))
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addContainerGap(273, Short.MAX_VALUE)
                    .addComponent(LouerBtnAnnuler)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(LouerBtnValider)
                    .addGap(40))
        );
        gl_LouerPanel.setVerticalGroup(
            gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_LouerPanel.createSequentialGroup()
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_LouerPanel.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(LouerLblVotreLocationSera))
                        .addComponent(LouerBtnAide))
                    .addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addComponent(lblPourVlo)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(LouerLblNombreDeVlo)
                        .addComponent(LouerSpinnerVelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_LouerPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(LouerBtnValider)
                        .addComponent(LouerBtnAnnuler))
                    .addContainerGap())
        );
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {"Location", "1 heure", "5$ CAN"},
                {"Caution", "", "200$ CAN"},
            },
            new String[] {
                "Libell\u00E9", "Dur\u00E9e", "Prix"
            }
        ));
        scrollPane.setViewportView(table);
        LouerPanel.setLayout(gl_LouerPanel);
    }
}