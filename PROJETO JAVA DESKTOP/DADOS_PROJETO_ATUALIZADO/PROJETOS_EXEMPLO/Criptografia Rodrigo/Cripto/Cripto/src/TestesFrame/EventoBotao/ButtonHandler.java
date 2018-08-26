/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesFrame.EventoBotao;

/**
 *
 * @author Gelvazio Camargo
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonHandler implements ActionListener {
private JButton ok, cancela;
	
	public ButtonHandler(JButton ok, JButton cancela){
		this.ok = ok;
		this.cancela = cancela;
	}

	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == ok)
				JOptionPane.showMessageDialog(null, "O botão OK foi clicado");
			
		if(evento.getSource() == cancela)
			JOptionPane.showMessageDialog(null, "O botão CANCELA foi clicado");
	}

}


