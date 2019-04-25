package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.Avaliacao;

public class Formulario {
	
	private JFrame form;
    private JLabel lblValor1, lblValor2, lblValor3, lblValor4, lblpresenca, lblResultado;
    private JTextField txtValor1, txtValor2, txtValor3, txtValor4;
    private JComboBox cboEscolha;
    private JButton btnCalcularMedia;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("CALCULO DE RENDIMENTO - ALUNO");
        form.setBounds(400, 150, 550, 500);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        lblValor4 = new JLabel("<< SELECIONE >>");
        lblValor4.setBounds(40, 30, 180, 20);
        painel.add(lblValor4);
        
        lblValor1 = new JLabel("Valor P1: ");
        lblValor1.setBounds(300, 30, 100, 20);
        painel.add(lblValor1);
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(390, 30, 80, 20);
        txtValor1.setEnabled(false);
        painel.add(txtValor1);
        
        lblValor2 = new JLabel("Valor P2: ");
        lblValor2.setBounds(300, 80, 100, 20);
        painel.add(lblValor2);

        txtValor2 = new JTextField();
        txtValor2.setBounds(390, 80, 80, 20);
        txtValor2.setEnabled(false);
        painel.add(txtValor2);
        
        lblValor3 = new JLabel("Valor P3: ");
        lblValor3.setBounds(300, 130, 100, 20);
        painel.add(lblValor3);
        
        lblpresenca = new JLabel("Presença: ");
        lblpresenca.setBounds(300, 160, 100, 20);
        painel.add(lblpresenca);

        txtValor3 = new JTextField();
        txtValor3.setBounds(390, 130, 80, 20);
        txtValor3.setEnabled(false);
        painel.add(txtValor3);
        
        lblpresenca = new JLabel("Total Presença");
        lblpresenca.setBounds(410, 80, 80, 20);
        lblpresenca.setEnabled(true);
        
        txtValor4 = new JTextField();
        txtValor4.setBounds(390, 160, 80, 20);
        txtValor4.setEnabled(false);
        painel.add(txtValor4);
        
        cboEscolha = new JComboBox();
        cboEscolha.setBounds(40, 60, 200, 25);
        cboEscolha.addItem("<< SELECIONE >>");
        cboEscolha.addItem("2 Valores");
        cboEscolha.addItem("3 valores");
        cboEscolha.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    switch(cboEscolha.getSelectedIndex()){
                        case 1: 
                            lblValor1.setText("Valor P1:");
                            lblValor2.setText("Valor P2");
                            lblValor3.setText("-");
                            txtValor1.setEnabled(true);
                            txtValor2.setEnabled(true);
                            txtValor3.setEnabled(false);
                            txtValor4.setEnabled(true);
                            break;
                        case 2: 
                            lblValor1.setText("Valor P1:");
                            lblValor2.setText("Valor P2:");
                            lblValor3.setText("Valor P3");
                            txtValor1.setEnabled(true);
                            txtValor2.setEnabled(true);
                            txtValor3.setEnabled(true);
                            txtValor4.setEnabled(true);

                            break;
          
                        default:
                            lblValor1.setText("Valor 1:");
                            lblValor2.setText("Valor 2:");
                            lblValor3.setText("Valor 3:");
                            txtValor1.setEnabled(false);
                            txtValor2.setEnabled(false);
                            txtValor3.setEnabled(false);
                            txtValor4.setEnabled(false);

                    }
                    lblResultado.setText("Resultado: ");
                    txtValor1.setText("");
                    txtValor2.setText("");
                    txtValor3.setText("");
                }
            }
        });
        painel.add(cboEscolha);
        
        btnCalcularMedia = new JButton("Calcular Média Final");
        btnCalcularMedia.setBounds(150, 180, 220, 25);
        btnCalcularMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Avaliacao objAv = new Avaliacao();
                
                switch (cboEscolha.getSelectedIndex()){
                    case 1: 
                    	objAv.setMedia(Float.parseFloat(txtValor1.getText()));
                    	objAv.setMedia(Float.parseFloat(txtValor2.getText()));

                        break;
                    case 2: 
                        Avaliacao objAv1 = new Avaliacao();
                        objAv1.setMedia(Float.parseFloat(txtValor1.getText()));
                    	objAv1.setMedia(Float.parseFloat(txtValor2.getText()));
                    	objAv1.setMedia(Float.parseFloat(txtValor3.getText()));
         
                        break;
                    
                }
                //objAv.calcularPercentualPresenca();
                lblResultado.setText(String.format("Resultado:", objAv.getPresenca()));
            }
        });
        painel.add(btnCalcularMedia);
        
        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(150, 230, 200, 30);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 16));
        lblResultado.setForeground(Color.RED);
        painel.add(lblResultado);
        
        form.setVisible(true);
    }
   
}