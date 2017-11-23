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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;

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
        frmPaiement.setBounds(0, 0, 600, 500);
        frmPaiement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPaiement.setLocationRelativeTo(null);
        
        JPanel PaiementPanel = new JPanel();
        PaiementPanel.setBorder(new TitledBorder(null, "Proc\u00E9dez au paiement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frmPaiement.getContentPane().add(PaiementPanel, BorderLayout.CENTER);
        
        JScrollPane scrollPane = new JScrollPane();
        
        JButton btnAide = new JButton("Aide");
        
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {null, null, null},
                {null, null, null},
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
        
        JPanel PaiementPanelBoutons = new JPanel();
        
        JPanel PaiementPanelMonPanier = new JPanel();
        PaiementPanelMonPanier.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        
        JLabel lblMonPanier = new JLabel("Mon Panier");
        lblMonPanier.setFont(new Font("Tahoma", Font.BOLD, 14));
        GroupLayout gl_PaiementPanel = new GroupLayout(PaiementPanel);
        gl_PaiementPanel.setHorizontalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addContainerGap(192, Short.MAX_VALUE)
                    .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.TRAILING)
                        .addComponent(PaiementPanelMonPanier, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                        .addGroup(Alignment.LEADING, gl_PaiementPanel.createSequentialGroup()
                            .addGap(62)
                            .addComponent(lblMonPanier)
                            .addPreferredGap(ComponentPlacement.RELATED, 72, GroupLayout.PREFERRED_SIZE)))
                    .addGap(179))
                .addGroup(Alignment.LEADING, gl_PaiementPanel.createSequentialGroup()
                    .addGap(10)
                    .addGroup(gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_PaiementPanel.createSequentialGroup()
                            .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, gl_PaiementPanel.createSequentialGroup()
                            .addComponent(PaiementPanelBoutons, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, gl_PaiementPanel.createSequentialGroup()
                            .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
        );
        gl_PaiementPanel.setVerticalGroup(
            gl_PaiementPanel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanel.createSequentialGroup()
                    .addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(29)
                    .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addGap(18)
                    .addComponent(lblMonPanier)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(PaiementPanelMonPanier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(47)
                    .addComponent(PaiementPanelBoutons, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        
        JLabel lblPrixTotal = new JLabel("Prix total : 310$ CAN");
        PaiementPanelMonPanier.add(lblPrixTotal);
        lblPrixTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton btnRetour = new JButton("Retour");
        btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton PaiementBtnAbandonner = new JButton("Abandonner");
        PaiementBtnAbandonner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        PaiementBtnAbandonner.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton PaiementBtnPayerViaPaypal = new JButton("Payer via Paypal");
        PaiementBtnPayerViaPaypal.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GroupLayout gl_PaiementPanelBoutons = new GroupLayout(PaiementPanelBoutons);
        gl_PaiementPanelBoutons.setHorizontalGroup(
            gl_PaiementPanelBoutons.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_PaiementPanelBoutons.createSequentialGroup()
                    .addComponent(PaiementBtnAbandonner, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGap(41)
                    .addComponent(btnRetour, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGap(41)
                    .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
        gl_PaiementPanelBoutons.setVerticalGroup(
            gl_PaiementPanelBoutons.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_PaiementPanelBoutons.createSequentialGroup()
                    .addGroup(gl_PaiementPanelBoutons.createParallelGroup(Alignment.TRAILING)
                        .addComponent(btnRetour, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addGroup(gl_PaiementPanelBoutons.createParallelGroup(Alignment.BASELINE)
                            .addComponent(PaiementBtnAbandonner, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(PaiementBtnPayerViaPaypal, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                    .addGap(0))
        );
        PaiementPanelBoutons.setLayout(gl_PaiementPanelBoutons);
        PaiementBtnPayerViaPaypal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        PaiementPanel.setLayout(gl_PaiementPanel);
    }
}
