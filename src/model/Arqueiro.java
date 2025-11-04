package model;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 110, 18, 8);
    }

    @Override
    public int habilidadeEspecial() {
        System.out.println(nome + " dispara Tiro Triplo!");
        return ataque + 10;
    }

    @Override
    public void habilidadePassiva() {
        System.out.println(nome + " está com Reflexos Rápidos prontos!");
    }

    @Override
    public void receberDano(int dano) {
        if (random.nextDouble() < 0.15) {
            System.out.println(nome + " desviou do ataque!");
            return;
        }
        super.receberDano(dano);
    }
}
