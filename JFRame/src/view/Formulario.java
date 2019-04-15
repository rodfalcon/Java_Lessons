package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Formulario {
	private JFrame form;
    private JLabel lblGenero;
    private JComboBox cboGenero;
    int itemSelecionado;    
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("JComboBox");
        form.setBounds(520, 200, 350, 200);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblGenero = new JLabel("Gênero:");
        lblGenero.setBounds(50, 60, 60, 20);
        form.getContentPane().add(lblGenero);
        
        cboGenero = new JComboBox();
        cboGenero.setBounds(120, 60, 150, 20);
        cboGenero.addItem("<< SELECIONE >>");
        cboGenero.addItem("Masculino");
        cboGenero.addItem("Feminino");
        cboGenero.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // se o estado do item for de seleção...
                if (e.getStateChange() == ItemEvent.SELECTED){
                    // ...se o valor for válido (diferente de "<< SELECIONE >>")...
                    if (cboGenero.getSelectedIndex() > 0){
                        // ...e se o item selecionado for diferente do valor anterior...
                        if (cboGenero.getSelectedIndex() != itemSelecionado)
                            // ...exibe o resultado da tela
                            JOptionPane.showMessageDialog(null, e.getItem().toString());
                        // armazena o valor do item selecionado
                        itemSelecionado = cboGenero.getSelectedIndex();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Gênero inválido!");
                        cboGenero.setSelectedIndex(itemSelecionado);
                    }
                }
            }
        });
        form.getContentPane().add(cboGenero);
                
        form.setVisible(true);
    }
}
