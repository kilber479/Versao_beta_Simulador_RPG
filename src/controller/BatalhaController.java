package controller;

import model.*;
import java.util.Scanner;

public class BatalhaController {
    private final Scanner scanner = new Scanner(System.in);

    public void iniciarBatalha(Personagem p1, Personagem p2) {
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            System.out.println("===================================");
            System.out.println(p1.getNome() + " - Vida: " + p1.getVida());
            System.out.println(p2.getNome() + " - Vida: " + p2.getVida());
            System.out.println("===================================");

            p1.habilidadePassiva();
            p2.habilidadePassiva();

            System.out.println("\n🎯 Turno de " + p1.getNome());
            int acao1 = escolherAcao(p1);
            executarAcao(p1, p2, acao1);
            if (p2.getVida() <= 0) break;

            System.out.println("\n🎯 Turno de " + p2.getNome());
            int acao2 = escolherAcao(p2);
            executarAcao(p2, p1, acao2);
        }

        System.out.println("\n🏁 Fim da batalha!");
        if (p1.getVida() <= 0 && p2.getVida() <= 0) {
            System.out.println("Empate!");
        } else if (p1.getVida() <= 0) {
            System.out.println(p2.getNome() + " venceu!");
        } else {
            System.out.println(p1.getNome() + " venceu!");
        }
    }

    private int escolherAcao(Personagem personagem) {
        System.out.println("Escolha uma ação:");
        System.out.println("1 - Atacar");
        System.out.println("2 - Defender");
        System.out.println("3 - Habilidade Especial");
        int escolha = scanner.nextInt();
        return Math.max(1, Math.min(3, escolha));
    }

    private void executarAcao(Personagem atacante, Personagem defensor, int acao) {
        switch (acao) {
            case 1:
                int dano = atacante.atacar();
                System.out.println(atacante.getNome() + " ataca causando " + dano + " de dano!");
                defensor.receberDano(dano);
                break;
            case 2:
                atacante.setDefendendo(true);
                System.out.println(atacante.getNome() + " está se defendendo!");
                break;
            case 3:
                int danoEspecial = atacante.habilidadeEspecial();
                System.out.println(atacante.getNome() + " causa " + danoEspecial + " de dano!");
                defensor.receberDano(danoEspecial);
                break;
        }
    }
}
