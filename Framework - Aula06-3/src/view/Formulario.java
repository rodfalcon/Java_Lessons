package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Formulario {
	private JFrame form;
    private JLabel lblSemestresRestantes;
    private JComboBox cboSemestresRestantes;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // *** form ***
        form = new JFrame("JComboBox");
        form.setBounds(400, 200, 400, 200);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // *** lblSemestresRestantes ***  
        lblSemestresRestantes = new JLabel("Quantos semestres para você se formar?");
        lblSemestresRestantes.setBounds(30, 20, 300, 20);
        form.getContentPane().add(lblSemestresRestantes);
        
        // *** cboSemestresRestantes ***
        cboSemestresRestantes = new JComboBox();
        cboSemestresRestantes.addItem("<< SELECIONE >>");
        cboSemestresRestantes.addItem("1 semestre");
        cboSemestresRestantes.addItem("2 semestres");
        cboSemestresRestantes.addItem("3 ou mais semestres");
        cboSemestresRestantes.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                    switch(cboSemestresRestantes.getSelectedIndex()){
                        case 0: JOptionPane.showMessageDialog(null, "Escolha um item válido!"); break;
                        case 1: JOptionPane.showMessageDialog(null, "Parabéns!"); break;
                        case 2: JOptionPane.showMessageDialog(null, "É... Está mais ou menos bem..."); break;
                        case 3: JOptionPane.showMessageDialog(null, "Vai prestar novo vestibular?"); break;
                    }
            }
        });
        form.setVisible(true);

        cboSemestresRestantes.setBounds(30, 60, 300, 20);
        form.getContentPane().add(cboSemestresRestantes);
        
        form.setVisible(true);
    }
}
