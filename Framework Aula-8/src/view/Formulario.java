package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.Aplicacao;

public class Formulario {
	private JFrame form;
    private JLabel lblCapital, lblPrazo, lblTipoAplicacao, lblValorFinal;
    private JTextField txtCapital, txtPrazo;
    private JComboBox cboAplicacao;
    private JButton btnCalcularRendimento;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("Calculadora de rendimentos");
        form.setBounds(550, 300, 450, 280);
        // centraliza o formulário
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLayout(null);
        Container painel = form.getContentPane();
        
        lblCapital = new JLabel("Valor a ser aplicado");
        lblCapital.setBounds(30, 25, 120, 20);
        painel.add(lblCapital);
        
        txtCapital = new JTextField();
        txtCapital.setBounds(160, 25, 70, 20);
        txtCapital.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                validarPreenchimentoNumerico(e, true);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                zerarResultado();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            	
            }
        });
        painel.add(txtCapital);
        
        lblPrazo = new JLabel("Prazo da aplicação");
        lblPrazo.setBounds(30, 60, 120, 20);
        painel.add(lblPrazo);
        
        txtPrazo = new JTextField();
        txtPrazo.setBounds(160, 60, 70, 20);
        txtPrazo.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                validarPreenchimentoNumerico(e, false);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                zerarResultado();
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        painel.add(txtPrazo);
        
        lblTipoAplicacao = new JLabel("Tipo de aplicação");
        lblTipoAplicacao.setBounds(30, 95, 120, 20);
        painel.add(lblTipoAplicacao);
        
        cboAplicacao = new JComboBox();
        cboAplicacao.setBounds(180, 95, 130, 20);
        cboAplicacao.addItem("<< SELECIONE >>");
        cboAplicacao.addItem("Poupança");
        cboAplicacao.addItem("CDI");
        cboAplicacao.addItem("Tesouro Direto");
        painel.add(cboAplicacao);
        
        lblValorFinal = new JLabel("Valor final: R$ 0,00");
        lblValorFinal.setForeground(Color.BLUE);
        lblValorFinal.setBounds(100, 140, 200, 20);
        painel.add(lblValorFinal);
        
        btnCalcularRendimento = new JButton("Calcular investimento");
        btnCalcularRendimento.setBounds(70, 180, 200, 20);
        btnCalcularRendimento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cboAplicacao.getSelectedIndex() > 0 &&
                    txtCapital.getText().length() > 0 &&
                    txtPrazo.getText().length() > 0){
                        float taxa = 0;
                        Aplicacao objAplicacao = new Aplicacao();
                        switch(cboAplicacao.getSelectedIndex()){
                            case 1: taxa = 0.38f; break;
                            case 2: taxa = 0.53f; break;
                            case 3: taxa = 0.65f; break;
                        }
                        objAplicacao.calcularRendimento(Float.parseFloat(txtCapital.getText()), 
                                Integer.parseInt(txtPrazo.getText()), taxa);
                        float valorFinal = objAplicacao.getValor_final();
                        lblValorFinal.setText(String.format("Valor final: R$ %.2f", valorFinal));
                }
            }
        });
        painel.add(btnCalcularRendimento);
        
        form.setVisible(true);
    }
    
    private void zerarResultado(){
        lblValorFinal.setText("Valor final: R$ 0,00");
    }
    
    private void validarPreenchimentoNumerico(KeyEvent e, boolean permitePontoDecimal) {
        if (!Character.isDigit(e.getKeyChar()) && (e.getKeyChar() != '.' || !permitePontoDecimal)){
            e.consume();
        }
    }    
}