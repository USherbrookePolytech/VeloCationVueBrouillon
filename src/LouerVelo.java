import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Bebo
 *
 */
public class LouerVelo
{

    private JFrame frmLouer;

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
                    LouerVelo window = new LouerVelo();
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
    public LouerVelo()
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
        frmLouer.setBounds(100, 100, 450, 300);
        frmLouer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
