package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.Normalizer.Form;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultText;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import conversao.Massa;
import conversao.Temperatura;

public class Formulario {
	private JFrame form;
	private JLabel lbltemperatura, lblmassa, lblresp1, lblresp2;
	private JTextField txtdado1, txtdado2;
	private JButton btnmassa, btntemp;
	
	public Formulario() {
		iniciar_componentes();
	}

	private void iniciar_componentes() {
		form = new JFrame("CONVERSOR DE TEMPERATURA");
        form.setBounds(650, 350, 600, 400);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        lbltemperatura = new JLabel("Temperatura");
        lbltemperatura.setBounds(50, 10, 90, 100);
        painel.add(lbltemperatura);
        
        lblmassa = new JLabel("Massa");
        lblmassa.setBounds(400, 10, 90, 100);
        painel.add(lblmassa);
        
        lblresp1 = new JLabel("Convertido:");
        lblresp1.setForeground(Color.RED);
        lblresp1.setBounds(50, 140, 200, 20);
        painel.add(lblresp1);
        
        lblresp2 = new JLabel("Convertido:");
        lblresp2.setForeground(Color.RED);
        lblresp2.setBounds(400, 140, 200, 20);
        painel.add(lblresp2);
        
        txtdado1 = new JTextField();
        txtdado1.setBounds(50, 100, 120, 20);
        txtdado1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				validar_numero(e, true);
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
                zerarResultado();				
			}
		});
        
        painel.add(txtdado1);
        
        txtdado2 = new JTextField();
        txtdado2.setBounds(350, 100, 120, 20);
        txtdado2.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				validar_numero(e, true);
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				zerarResultado();		
				
			}
		});
        
        painel.add(txtdado2);
        
        btntemp = new JButton("de ºC para ºF");
        btntemp.setBounds(50, 180, 200, 20);
        btntemp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean btn_selecionado = true;
				Temperatura objTemp = new Temperatura();
				float valor_final = 0;
				
				switch(btntemp.getText()) {
				case "de ºC para ºF": {
					objTemp.converterDeCelsiusParaFahrenheit(Float.parseFloat(txtdado1.getText()));
					valor_final = objTemp.getTemperatura();
					lblresp1.setText(String.format("%.2f ºF", valor_final));
					btntemp.setText("de ºF para ºC");
					break;
				}
				case "de ºF para ºC": {
					objTemp.converterDeFahrenheitParaCelsius(Float.parseFloat(txtdado1.getText()));
					valor_final = objTemp.getTemperatura();
					lblresp1.setText(String.format("%.0f ºC", valor_final));
					btntemp.setText("de ºC para ºF");
					break;
				}
																					}				
			}
		});        
        
        painel.add(btntemp);
        
        btnmassa = new JButton("de Kg para Lb");
        btnmassa.setBounds(300, 180, 200, 20);
        btnmassa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Massa objtemp = new Massa();
				float valor_final = 0;
				
				switch(btnmassa.getText()) {
				case "de Kg para Lb": {
					objtemp.converterDeQuiloParaLibra(Float.parseFloat(txtdado2.getText()));
					valor_final = objtemp.getMassa();
					lblresp2.setText(String.format("%.2f Lb", valor_final));
					btnmassa.setText("de Lb para Kg");
					break;
				}
				case "de Lb para Kg": {
					objtemp.converterDeLibraParaQuilo(Float.parseFloat(txtdado2.getText()));
					valor_final = objtemp.getMassa();
					lblresp2.setText(String.format("%.2f", valor_final));
					btnmassa.setText("de ºC para ºF");
					break;
				}
																					}				
			}
		});
        
        painel.add(btnmassa);
        
        form.setVisible(true);
        
		
	}
	
	 private void zerarResultado(){
	        lblresp1.setText("0.0");
	    }
	
	 private void validar_numero(KeyEvent e, boolean permitePontoDecimal) {
	        if (!Character.isDigit(e.getKeyChar()) && (e.getKeyChar() != '.' || !permitePontoDecimal)){
	            e.consume();
	        }
	    }    

}

