package TCC_TOTEM.TCC_ADM;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class ADM extends JFrame {

    JButton jb1 = new JButton("Selecionar");
    JButton jb2 = new JButton("Chamar");

    public ADM() {

    }

    public JComponent telaPainel() {
        JPanel painel = new JPanel();// Painel principal, nele eu adiciono outros paines que organizam a tela

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JScrollPane srcPainel = new JScrollPane(p);
        srcPainel.setPreferredSize(new Dimension(900, 600));
        painel.add(srcPainel);
        for (int i = 1; i <= 25; i++) {
            p.add(new JButton("botao-teste " + i));
        }
        return painel;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        TelaADM tela = new TelaADM();
        new ADM();

    }
}
