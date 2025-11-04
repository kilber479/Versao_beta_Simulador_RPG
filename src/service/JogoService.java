package service;

import java.util.Scanner;
import model.Personagem;
import model.Guerreiro;
import model.Mago;
import controller.BatalhaController;

public class JogoService {

    private BatalhaController batalhaController;
    private Scanner sc;

    public JogoService() {
        this.batalhaController = new BatalhaController();
        this.sc = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("=== Simulador de Batalha RPG ===\n");

        Personagem jogador1 = criarPersonagem(1);
        Personagem jogador2 = criarPersonagem(2);

        System.out.println("\nPreparando o campo de batalha...\n");
        batalhaController.iniciarBatalha(jogador1, jogador2);
    }

    private Personagem criarPersonagem(int numero) {
        System.out.print("Digite o nome do Personagem " + numero + ": ");
        String nome = sc.nextLine();

        System.out.println("Escolha a classe:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.print("Opção: ");

        int opcao = 0;
        try {
            opcao = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, classe padrão será Guerreiro.");
        }

        switch (opcao) {
            case 1:
                return new Guerreiro(nome);
            case 2:
                return new Mago(nome);
            default:
                System.out.println("Classe inválida, Guerreiro selecionado por padrão.");
                return new Guerreiro(nome);
        }
    }
}