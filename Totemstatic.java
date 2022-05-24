package TCC_TOTEM;

public class Totemstatic {

	static int[] Historico = new int[10];
	static String[] Historico1 = new String[10];
	static int[] Historico2 = new int[10];
	static int[] Historico3 = new int[10];
	static int[] Historico4 = new int[10];

	public static void senhas() {
		if (Totem.i == 10) {
			Totem.i = 0;
		}
		;
		if (Totem.Tipo == 1) {
			Totem.Nomeclatura = "Normal";
			Historico2[Totem.i] = Totem.Senha;
			Totem.Senha++;
		}
		;
		if (Totem.Tipo == 2) {
			Totem.Nomeclatura = "Preferencial";
			Historico3[Totem.i] = Totem.PSenha;
			Totem.PSenha++;
		}
		;
		if (Totem.Tipo == 3) {
			Totem.Nomeclatura = "Pedagogia";
			Historico4[Totem.i] = Totem.PeSenha;
			Totem.PeSenha++;
		}
		Historico1[Totem.i] = Totem.Nomeclatura;
		Historico[Totem.i] = Totem.Contador;
		Totem.Contador++;
	}

	public static void Historicostatos() {

	}

	public void main(String[] args) {
	}
}
