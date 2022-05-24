package TCC_TOTEM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Botao extends JFrame implements ActionListener {
	String mensagem = " ";
	JButton jb = new JButton("Senha Normal");
	JButton jb2 = new JButton("Senha Preferencial");
	JButton jb3 = new JButton("Senha Pedagogica");
	JButton jb4 = new JButton("X");

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jb) {
			Totem.Tipo = 1;
			mensagem = "Senha Normal: " + Totem.Senha;
			JOptionPane.showMessageDialog(null, mensagem);
			Totemstatic.senhas();
		}
		if (e.getSource() == jb2) {
			Totem.Tipo = 2;
			mensagem = "Senha Preferencial: " + Totem.PSenha;
			JOptionPane.showMessageDialog(null, mensagem);
			Totemstatic.senhas();
		}
		if (e.getSource() == jb3) {
			Totem.Tipo = 3;
			mensagem = "Senha Pedagogica: " + Totem.PeSenha;
			JOptionPane.showMessageDialog(null, mensagem);
			Totemstatic.senhas();
		}
		if (e.getSource() == jb4) {
			System.exit(0);
		}
	}

	public Botao() {

		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);

		setLayout(null);
		jb.setBounds(725, 350, 450, 150);
		jb2.setBounds(725, 550, 450, 150);
		jb3.setBounds(725, 750, 450, 150);
		jb4.setBounds(105, 100, 150, 150);
		add(jb);
		add(jb2);
		add(jb3);
		add(jb4);

		setTitle("Titulo da Janela");
		setSize(1200, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Botao();

	}

}
