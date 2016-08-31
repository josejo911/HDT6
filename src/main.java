/**
 * Jose Jo Escobar,14343
 * Alejandro Chaclan, 15018
 * Hoja de trabajo No 6
 * Algortimos y estructura de datos
 * on 31/08/2016.
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class main {

    private JFrame frame;
    private JTextField textBoxNombre;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    main window = new main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Administrador de desarrolladores");
        frame.setBounds(100, 100, 659, 404);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblHojaDeTrabajo = new JLabel("Hoja de Trabajo #6");
        lblHojaDeTrabajo.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblHojaDeTrabajo.setBounds(30, 24, 168, 23);
        frame.getContentPane().add(lblHojaDeTrabajo);

        JLabel lblNombre = new JLabel("Ingrese su nombre:");
        lblNombre.setBounds(30, 112, 94, 14);
        frame.getContentPane().add(lblNombre);

        textBoxNombre = new JTextField();
        textBoxNombre.setBounds(134, 109, 161, 20);
        frame.getContentPane().add(textBoxNombre);
        textBoxNombre.setColumns(10);

        JLabel lblSeleccioneQueTipo = new JLabel("Seleccione que tipo de implementacion SET desea usar:");
        lblSeleccioneQueTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblSeleccioneQueTipo.setBounds(30, 55, 321, 14);
        frame.getContentPane().add(lblSeleccioneQueTipo);

        JRadioButton rdbtnHASH = new JRadioButton("HashSet");
        rdbtnHASH.setBounds(30, 76, 83, 23);
        frame.getContentPane().add(rdbtnHASH);

        JRadioButton rdbtnTREE = new JRadioButton("TreeSet");
        rdbtnTREE.setBounds(115, 76, 83, 23);
        frame.getContentPane().add(rdbtnTREE);

        JRadioButton rdbtnLINKHASH = new JRadioButton("LinkedHashSet");
        rdbtnLINKHASH.setBounds(204, 76, 126, 23);
        frame.getContentPane().add(rdbtnLINKHASH);

        JLabel lblPorFavorSeleccione = new JLabel("Seleccione sus opciones como desarrollador:");
        lblPorFavorSeleccione.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblPorFavorSeleccione.setBounds(30, 143, 265, 14);
        frame.getContentPane().add(lblPorFavorSeleccione);

        JCheckBox chckbxJava = new JCheckBox("Java");
        chckbxJava.setBounds(30, 164, 60, 23);
        frame.getContentPane().add(chckbxJava);

        JCheckBox chckbxMovil = new JCheckBox("Movil");
        chckbxMovil.setBounds(92, 164, 54, 23);
        frame.getContentPane().add(chckbxMovil);

        JCheckBox chckbxWeb = new JCheckBox("Web");
        chckbxWeb.setBounds(161, 164, 54, 23);
        frame.getContentPane().add(chckbxWeb);

        JButton btnIngresoDatos = new JButton("Ingresar a base de datos");
        btnIngresoDatos.setFont(new Font("Yu Gothic", Font.BOLD, 12));
        btnIngresoDatos.setBounds(30, 192, 185, 32);
        frame.getContentPane().add(btnIngresoDatos);
    }
}
