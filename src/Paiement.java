import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Paiement
{

    private JFrame frmPaiement;

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
                    Paiement window = new Paiement();
                    window.frmPaiement.setVisible(true);
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
    public Paiement()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmPaiement = new JFrame();
        frmPaiement.setResizable(false);
        frmPaiement.setTitle("Paiement");
        frmPaiement.setBounds(100, 100, 377, 233);
        frmPaiement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPaiement.setLocationRelativeTo(null);
        
        JPanel PaiementPanel = new JPanel();
        PaiementPanel.setBorder(new TitledBorder(null, "Proc\u00E9dez au paiement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmPaiement.getContentPane().add(PaiementPanel, BorderLayout.CENTER);
        
        JButton PaiementBtnPayerViaPaypal = new JButton("Payer via Paypal");
        PaiementBtnPayerViaPaypal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JButton PaiementBtnAbandonner = new JButton("Abandonner");
        
        JScrollPane scrollPane = new JScrollPane();
        
        JLabel lblPrixTotal = new JLabel("Prix total : 310$ CAN");
        lblPrixTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton btnRetour = new JButton("Retour");
        
        JButton btnAide = new JButton("Aide");
        GroupLayout gl_PaiementPanel = new GroupLayout(PaiementPanel);
        gl_PaiementPanel.setHorizontalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(Alignment.LEADING, gl_PaiementPanel.createSequentialGroup()
                            .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(gl_PaiementPanel.createSequentialGroup()
                            .addComponent(btnRetour)
                            .addGap(22)
                            .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                                .addComponent(lblPrixTotal)
                                .addGroup(gl_PaiementPanel.createSequentialGroup()
                                    .addComponent(PaiementBtnAbandonner)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
                            .addGap(34))))
                .addGroup(Alignment.TRAILING, gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap(271, Short.MAX_VALUE)
                    .addComponent(btnAide)
                    .addGap(42))
        );
        gl_PaiementPanel.setVerticalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addComponent(btnAide)
                    .addGap(11)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(lblPrixTotal)
                    .addGap(15)
                    .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnRetour)
                        .addComponent(PaiementBtnAbandonner)
                        .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(17, Short.MAX_VALUE))
        );
        
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {"", "", null},
                {"", "", null},
            },
            new String[] {
                "Qte", "Libell\u00E9", "Prix uni. $CAN"
            }
        ) {
            Class[] columnTypes = new Class[] {
                Object.class, Object.class, Integer.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(32);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(96);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(80);
        scrollPane.setViewportView(table);
        PaiementPanel.setLayout(gl_PaiementPanel);
    }
}
