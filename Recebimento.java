package TCC_TOTEM.Teste;

import java.io.PrintStream;
import java.net.Socket;

public class Recebimento {
        public static void main(String[] args) {
            Socket socket;

            PrintStream saida;
            //2
            try {
                socket = new Socket("localhost", 9876);
            } catch (Exception e) {
                System.out.println("Erro ao Solicitar conexão");
                System.out.println("Erro: " + e.getMessage());
                return;
            }

            try {
                saida = new PrintStream(socket.getOutputStream());

                saida.println(saida);

            } catch (Exception e) {
                System.out.println("Erro ao enviar dados");
                System.out.println("Erro: " + e.getMessage());
            }
            try {
               System.out.println("Saindo..");
               socket.close();
            } catch (Exception e) {
                System.out.println("Erro ao encerrar conexão");
                System.out.println("Erro: " + e.getMessage());
            }

        }
}
