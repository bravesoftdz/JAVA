package TestesFrame.UsodeBotao;

/**
 *
 * @author Gelvazio Camargo
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Botao extends JFrame {

    private JButton ok,
            cancelar;

    public Botao() {
        super("Criando botões");
        setLayout(new FlowLayout());

        ok = new JButton("OK");
        cancelar = new JButton("Cancelar");
        add(ok);
        add(cancelar);
    }
}
