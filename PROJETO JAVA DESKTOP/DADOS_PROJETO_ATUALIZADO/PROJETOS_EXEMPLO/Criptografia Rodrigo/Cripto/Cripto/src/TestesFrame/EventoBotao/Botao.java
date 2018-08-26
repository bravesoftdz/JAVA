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


import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Botao extends JFrame{
	private JButton ok = new JButton("OK"); 
	private JButton cancela = new JButton("Cancela");
	private ButtonHandler handler;
	
	public Botao(){
		super("Criando botões");
		setLayout(new FlowLayout());
		handler=new ButtonHandler(ok, cancela);
		
		ok.addActionListener(handler);
		add(ok);
		
		cancela.addActionListener(handler);
		add(cancela);
                
                ok.setSize(100, 100);
                cancela.setSize(100,100);

	}

        
}


