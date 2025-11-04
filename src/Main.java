import view.JogoView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("======================================");
            System.out.println("        SIMULADOR DE BATALHA RPG      ");
            System.out.println("======================================");
            System.out.println("1 - Começar Jogo");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    JogoView jogo = new JogoView();
                    jogo.iniciarJogo();
                    break;
                case 2:
                    System.out.println("Saindo do jogo... Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 2);

        sc.close();
    }
}
