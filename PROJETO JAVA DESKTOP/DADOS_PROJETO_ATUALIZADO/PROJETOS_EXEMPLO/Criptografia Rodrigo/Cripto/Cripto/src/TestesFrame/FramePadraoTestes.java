package TestesFrame;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author Gelvazio Camargo
 */
public class FramePadraoTestes extends javax.swing.JFrame {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Meu primeiro frame em Java");
        Painel meuPainel = new Painel();
        // janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(meuPainel);
        janela.setSize(600, 400);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}
