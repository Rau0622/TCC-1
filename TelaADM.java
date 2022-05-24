package TCC_TOTEM.TCC_ADM;

import TCC_TOTEM.Totem;
import TCC_TOTEM.Totemstatic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class TelaADM extends JFrame implements ActionListener {
	String mensagem = " ";
	JButton C1 = new JButton("chamar senha Normal");
	JButton C2 = new JButton("chamar senha Preferencial");
	JButton C3 = new JButton("Chamar senha Pedagogica");
	JButton C4 = new JButton("Re-Chamar senha atual");
	static String[] Armazem = new String[10];
	int I = 0;
	JButton B1 = new JButton("Vazio");
	JButton B2 = new JButton("Vazio");
	JButton B3 = new JButton("Vazio");
	JButton B4 = new JButton("Vazio");
	JButton B5 = new JButton("Vazio");
	JButton B6 = new JButton("Vazio");
	JButton B7 = new JButton("Vazio");
	JButton B8 = new JButton("Vazio");
	JButton B9 = new JButton("Vazio");
	JButton B10 = new JButton("Vazio");

	public void actionPerformed(ActionEvent e) {
		if (I == 10) {
			I = 0;
		}
		B1.setText(Armazem[0]);
		B2.setText(Armazem[1]);
		B3.setText(Armazem[2]);
		B4.setText(Armazem[3]);
		B5.setText(Armazem[4]);
		B6.setText(Armazem[5]);
		B7.setText(Armazem[6]);
		B8.setText(Armazem[7]);
		B9.setText(Armazem[8]);
		B10.setText(Armazem[9]);
		if (e.getSource() == C1) {
			// Recebimento de Historico
			mensagem = "Senha setada: N" // Totemstatic.Historico2[0]
			;
			JOptionPane.showMessageDialog(null, mensagem);
			Armazem[I] = mensagem;
			I++;
			// Envio mensagem
		}
		if (e.getSource() == C2) {
			// Recebimento de Historico
			mensagem = "Senha setada: P" // Totemstatic.Historico3[1]
			;
			JOptionPane.showMessageDialog(null, mensagem);
			Armazem[I] = mensagem;
			I++;
			// Envio mensagem
		}
		if (e.getSource() == C3) {
			// Recebimento de Historico
			mensagem = "Senha setada: Pe" // Totemstatic.Historico4[1]
			;
			JOptionPane.showMessageDialog(null, mensagem);
			Armazem[I] = mensagem;
			I++;
			// Envio mensagem
		}
		if (e.getSource() == C4) {
			JOptionPane.showMessageDialog(null, mensagem);
		}
		if (e.getSource() == B1) {
			mensagem = Armazem[0];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B2) {
			mensagem = Armazem[1];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B3) {
			mensagem = Armazem[2];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B4) {
			mensagem = Armazem[3];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B5) {
			mensagem = Armazem[4];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B6) {
			mensagem = Armazem[5];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B7) {
			mensagem = Armazem[6];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B8) {
			mensagem = Armazem[7];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B9) {
			mensagem = Armazem[8];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
		if (e.getSource() == B10) {
			mensagem = Armazem[9];
			JOptionPane.showMessageDialog(null, mensagem);
			// Envio mensagem
		}
	}

	public TelaADM() {

		C1.addActionListener(this);
		C2.addActionListener(this);
		C3.addActionListener(this);
		C4.addActionListener(this);

		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);
		B10.addActionListener(this);

		setLayout(null);
		C1.setBounds(100, 350, 250, 100);
		C2.setBounds(100, 550, 250, 100);
		C3.setBounds(100, 750, 250, 100);
		C4.setBounds(1600, 75, 250, 100);
		B1.setBounds(1600, 350, 200, 50);
		B2.setBounds(1600, 400, 200, 50);
		B3.setBounds(1600, 450, 200, 50);
		B4.setBounds(1600, 500, 200, 50);
		B5.setBounds(1600, 550, 200, 50);
		B6.setBounds(1600, 600, 200, 50);
		B7.setBounds(1600, 650, 200, 50);
		B8.setBounds(1600, 700, 200, 50);
		B9.setBounds(1600, 750, 200, 50);
		B10.setBounds(1600, 800, 200, 50);

		add(C1);
		add(C2);
		add(C3);
		add(C4);
		add(B1);
		add(B2);
		add(B3);
		add(B4);
		add(B5);
		add(B6);
		add(B7);
		add(B8);
		add(B9);
		add(B10);

		setTitle("Titulo da Janela");
		setSize(1200, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TelaADM();

	}

}