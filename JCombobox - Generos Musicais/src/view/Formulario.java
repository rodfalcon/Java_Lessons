package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Formulario {
	private JFrame form;
	private JLabel lblGenero, lblInterprete, lblMusica;
	private JComboBox cboGenero, cboInterprete, cboMusica;
    private String[] arrInterpreteRock = {"", "RHCP", "Metallica", "Rolling Stones"},
                     arrInterpreteMPB = {"", "Chico Buarque", "Caetano Veloso", "Zé Ramalho"}, 
                     arrInterpreteTango = {"", "Carlos Gardel", "Astor Piazzolla", "Mercedes Sosa"};
    private String[] arrMusicaRock1 = {"", "Dark Necessities", "Californication", "Give It Away"}, 
                     arrMusicaRock2 = {"", "Enter Sandman", "Nothing Else Matters", "Unforgiven"}, 
                     arrMusicaRock3 = {"", "Satisfaction", "Wild Horses", "Start Me Up"},
                     arrMusicaMPB1 = {"", "Apesar de Você", "Quem Te Viu, Quem Te Vê", "Cotidiano"}, 
                     arrMusicaMPB2 = {"", "Você é Linda", "Sampa", "Você Não Me Ensinou a Te Esquecer"}, 
                     arrMusicaMPB3 = {"", "Chão de Giz", "Avohai", "Admirável Gado Novo"}, 
                     arrMusicaTango1 = {"", "Por Una Cabeza", "El Dia Que Me Quieras", "Volver"},
                     arrMusicaTango2 = {"", "Adios Nonino", "Outono Porteño", "Soledad"},
                     arrMusicaTango3 = {"", "Gracias a La Vida", "Todo Cambia", "Solo le Pido a Dios"};
  
public Formulario() {
	inicializarComponentes();
	}

private void inicializarComponentes() {
	form = new JFrame("JComboBox - música");
    form.setBounds(470, 200, 500, 300);
    form.setLayout(null);
    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lblGenero = new JLabel("Gênero músical:");
    lblGenero.setBounds(30, 30, 100, 20);
    form.getContentPane().add(lblGenero);
    
    cboGenero = new JComboBox();
    cboGenero.setBounds(140, 30, 270, 20);
    cboGenero.addItem("");
    cboGenero.addItem("Rock");
    cboGenero.addItem("MPB");
    cboGenero.addItem("Tango");
    cboGenero.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED)
                cboInterprete.setModel(popularInterprete(cboGenero.getSelectedIndex()));
        }
    });
    form.getContentPane().add(cboGenero);
            
    lblInterprete = new JLabel("Cantor/Banda:");
    lblInterprete.setBounds(30, 80, 100, 20);
    form.getContentPane().add(lblInterprete);
    
    cboInterprete = new JComboBox();
    cboInterprete.setBounds(140, 80, 270, 20);
    cboInterprete.addItem("");
    cboInterprete.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED)
                cboMusica.setModel(popularMusica(cboGenero.getSelectedIndex(), cboInterprete.getSelectedIndex()));
        }
    });
    form.getContentPane().add(cboInterprete);
            
    lblMusica = new JLabel("Música:");
    lblMusica.setBounds(30, 130, 100, 20);
    form.getContentPane().add(lblMusica);
    
    cboMusica = new JComboBox();
    cboMusica.setBounds(140, 130, 270, 20);
    cboMusica.addItem("");
    cboMusica.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED)
                JOptionPane.showMessageDialog(null, String.format(
                        "Gênero: %s\nIntérprete: %s\nMúsica: %s", 
                        cboGenero.getSelectedItem().toString(),
                        cboInterprete.getSelectedItem().toString(),
                        cboMusica.getSelectedItem().toString()));
        }
    });
    form.getContentPane().add(cboMusica);
            
    form.setVisible(true);
}

private DefaultComboBoxModel popularInterprete(int selectedIndex) {
    DefaultComboBoxModel comboModel = null;
    switch (selectedIndex){
        case 1: comboModel = new DefaultComboBoxModel(arrInterpreteRock); break;
        case 2: comboModel = new DefaultComboBoxModel(arrInterpreteMPB); break;
        case 3: comboModel = new DefaultComboBoxModel(arrInterpreteTango); break;
        default: comboModel = new  DefaultComboBoxModel();
    }
    return comboModel;
}    

private DefaultComboBoxModel popularMusica(int selectedIndexGenero, int selectedIndexInterprete) {
    DefaultComboBoxModel comboModel = null;
    switch (selectedIndexGenero){
        case 1: 
            switch (selectedIndexInterprete){
                case 1: comboModel = new DefaultComboBoxModel(arrMusicaRock1); break;
                case 2: comboModel = new DefaultComboBoxModel(arrMusicaRock2); break;
                case 3: comboModel = new DefaultComboBoxModel(arrMusicaRock3); break;
            } break;
        case 2: 
            switch (selectedIndexInterprete){
                case 1: comboModel = new DefaultComboBoxModel(arrMusicaMPB1); break;
                case 2: comboModel = new DefaultComboBoxModel(arrMusicaMPB2); break;
                case 3: comboModel = new DefaultComboBoxModel(arrMusicaMPB3); break;
            } break;
        case 3: 
            switch (selectedIndexInterprete){
                case 1: comboModel = new DefaultComboBoxModel(arrMusicaTango1); break;
                case 2: comboModel = new DefaultComboBoxModel(arrMusicaTango2); break;
                case 3: comboModel = new DefaultComboBoxModel(arrMusicaTango3); break;
            } break;
        
        default: comboModel = new  DefaultComboBoxModel();
    }
    return comboModel;
}    

}