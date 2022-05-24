package TCC_TOTEM.TelaTV;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Tela extends JFrame {

	JButton jb = new JButton("");
	JButton jb2 = new JButton("");
	JButton jb3 = new JButton("");
	int I = 0;
	String mensagem = "";
	String mensagemant = "";
	String[] Mensagens = new String[3];

	public Tela() {

		setLayout(null);
		jb.setBounds(425, 150, 1200, 200);
		jb2.setBounds(425, 450, 1200, 200);
		jb3.setBounds(425, 750, 1200, 200);
		add(jb);
		add(jb2);
		add(jb3);

		setTitle("Titulo da Janela");
		setSize(1200, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		// Recebendo mensagem
		if (mensagem != mensagemant) {
			if (I == 3) {
				I = 0;
			}
			if (I == 0) {
				jb.setText(mensagem);
				mensagemant = mensagem;
			}
			if (I == 1) {
				jb2.setText(mensagem);
				mensagemant = mensagem;
			}
			if (I == 2) {
				jb3.setText(mensagem);
				mensagemant = mensagem;
			}
			I++;
		}
	}

	public static void main(String[] args) {
		new Tela();

	}

}
