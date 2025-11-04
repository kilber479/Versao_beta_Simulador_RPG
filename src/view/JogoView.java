package view;

import controller.BatalhaController;
import model.*;
import java.util.Scanner;

public class JogoView {

    private Scanner sc;
    private BatalhaController batalhaController;

    public JogoView() {
        this.sc = new Scanner(System.in);
        this.batalhaController = new BatalhaController();
    }

    public void iniciarJogo() {
        System.out.println("\n--- Batalha Iniciada ---\n");

        System.out.print("Digite o nome do Jogador 1: ");
        String nome1 = sc.nextLine();
        Personagem jogador1 = escolherClasse(nome1);

        System.out.print("\nDigite o nome do Jogador 2: ");
        String nome2 = sc.nextLine();
        Personagem jogador2 = escolherClasse(nome2);

        batalhaController.iniciarBatalha(jogador1, jogador2);
    }

    private Personagem escolherClasse(String nome) {
        System.out.println("\nEscolha a classe para " + nome + ":");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        System.out.print("Opção: ");

        int escolha = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        switch (escolha) {
            case 1:
                return new Guerreiro(nome);
            case 2:
                return new Mago(nome);
            case 3:
                return new Arqueiro(nome);
            default:
                System.out.println("Opção inválida! Guerreiro selecionado por padrão.");
                return new Guerreiro(nome);
        }
    }
}
