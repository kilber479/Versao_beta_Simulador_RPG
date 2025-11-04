package model;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 100, 25, 6);
    }

    @Override
    public int habilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo!");
        return ataque + 15;
    }

    @Override
    public void habilidadePassiva() {
        if (vida > 0 && vida < 100) {
            vida += 5;
            if (vida > 100) vida = 100;
            System.out.println(nome + " recupera 5 de vida com Regeneração Mágica! (vida atual: " + vida + ")");
        }
    }
}
