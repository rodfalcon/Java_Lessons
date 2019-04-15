package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario {
	private JFrame form;
    private JLabel lblPaises;
    private JCheckBox chkEua, chkArgentina, chkFranca;
    private JButton btnExibirMsg;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("Outros componentes - JCheckBox");
        form.setBounds(500, 450, 650, 500);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        lblPaises = new JLabel("Em quais países você moraria?");
        lblPaises.setBounds(50, 25, 180, 25);
        painel.add(lblPaises);
        
        chkEua = new JCheckBox("EUA");
        chkEua.setBounds(50, 60, 60, 20);
        painel.add(chkEua);

        chkFranca = new JCheckBox("França");
        chkFranca.setBounds(150, 60, 80, 20);
        painel.add(chkFranca);

        chkArgentina = new JCheckBox("Argentina");
        chkArgentina.setBounds(250, 70, 90, 30);
        painel.add(chkArgentina);

        btnExibirMsg = new JButton("Exibir mensagem");
        btnExibirMsg.setBounds(100, 100, 200, 25);
        painel.add(btnExibirMsg);
        
        form.setVisible(true);
    }
    
}

