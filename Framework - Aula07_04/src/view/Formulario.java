package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Formulario {

	private JFrame form;
    private JLabel lblPaises;
    private JRadioButton rdbSantos, rdbSV, rdbGuaruja, rdbPG;
    private JButton btnExibirMsg;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("Outros componentes - JRadioButton");
        form.setBounds(300, 250, 480, 250);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        lblPaises = new JLabel("Qual cidade você mora?");
        lblPaises.setBounds(50, 20, 180, 25);
        painel.add(lblPaises);
        
        rdbSantos = new JRadioButton("Santos");
        rdbSantos.setBounds(50, 50, 100, 20);
        rdbSantos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Maior cidade da Baixada Santista e onde se encontra o maior porto das Américas!");
            }
        });
        painel.add(rdbSantos);
        
        rdbSV = new JRadioButton("São Vicente");
        rdbSV.setBounds(50, 75, 100, 20);
        rdbSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Primeira cidade do Brasil e onde teve a primeira câmara municipal das Américas!");
            }
        });
        painel.add(rdbSV);
        
        rdbGuaruja = new JRadioButton("Guarujá");
        rdbGuaruja.setBounds(50, 100, 100, 20);
        rdbGuaruja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Conhecida como \"Pérola do Atlântico\", possui belíssimas praias (inclusive para surf)!");
            }
        });
        painel.add(rdbGuaruja);
        
        rdbPG = new JRadioButton("Praia Grande");
        rdbPG.setBounds(50, 125, 100, 20);
        rdbPG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cidade que mais cresce na Baixada, estima-se que logo será a mais populosa da região.");
            }
        });
        painel.add(rdbPG);
        
        form.setVisible(true);
    }
    
}
