package model;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 20, 10);
    }

    @Override
    public int habilidadeEspecial() {
        System.out.println(nome + " usa Golpe Poderoso!");
        return ataque * 2;
    }

    @Override
    public void habilidadePassiva() {
        System.out.println(nome + " está protegido pela Armadura Pesada!");
    }

    @Override
    public void receberDano(int dano) {
        dano *= 0.8;
        super.receberDano((int) dano);
    }
}
