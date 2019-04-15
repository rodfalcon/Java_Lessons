package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario {
	private JFrame form;
    private JLabel lblCPF;
    private JTextFieldCustom txtNome;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // *** form ***
        form = new JFrame("Componentes customizados");
        form.setBounds(400, 200, 400, 150);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // *** lblCPF ***
        lblCPF = new JLabel("Não aceita letras:");
        lblCPF.setBounds(30, 30, 120, 20);
        form.getContentPane().add(lblCPF);
        
        txtNome = new JTextFieldCustom();
        txtNome.setBounds(150, 30, 180, 25);
        form.getContentPane().add(txtNome);
        
        form.setVisible(true);
    }
}