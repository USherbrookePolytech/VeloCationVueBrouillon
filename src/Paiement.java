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
        frmPaiement.setBounds(100, 100, 353, 231);
        frmPaiement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel PaiementPanel = new JPanel();
        PaiementPanel.setBorder(new TitledBorder(null, "Proc\u00E9dez au paiement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmPaiement.getContentPane().add(PaiementPanel, BorderLayout.CENTER);
        
        JButton PaiementBtnPayerViaPaypal = new JButton("Payer via Paypal");
        PaiementBtnPayerViaPaypal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        JButton PaiementBtnAbandonner = new JButton("Abandonner");
        
        JLabel PaiementLblMontantPayer = new JLabel("Montant à payer : XX $CAN");
        PaiementLblMontantPayer.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        JScrollPane scrollPane = new JScrollPane();
        
        JLabel lblPrixTotal = new JLabel("Prix total : 310$ CAN");
        lblPrixTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
        GroupLayout gl_PaiementPanel = new GroupLayout(PaiementPanel);
        gl_PaiementPanel.setHorizontalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap(84, Short.MAX_VALUE)
                    .addComponent(PaiementLblMontantPayer)
                    .addGap(73))
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addGap(19)
                    .addComponent(PaiementBtnAbandonner)
                    .addGap(18)
                    .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap(100, Short.MAX_VALUE)
                    .addComponent(lblPrixTotal)
                    .addGap(89))
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addContainerGap())
        );
        gl_PaiementPanel.setVerticalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PaiementLblMontantPayer)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(lblPrixTotal)
                    .addGap(14)
                    .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PaiementBtnAbandonner)))
        );
        
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {"2", "V\u00E9lo Caution", new Integer(300)},
                {"2", "V\u00E9lo non abo 24h", new Integer(10)},
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
            boolean[] columnEditables = new boolean[] {
                true, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
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
