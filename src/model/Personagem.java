package model;

import java.util.Random;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected boolean defendendo = false;
    protected Random random = new Random();

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public abstract int habilidadeEspecial();
    public abstract void habilidadePassiva();

    public int atacar() {
        return ataque + random.nextInt(5);
    }

    public int defender() {
        return defesa + random.nextInt(3);
    }

    public void receberDano(int dano) {
        if (defendendo) {
            dano -= defesa;
            if (dano < 0) dano = 0;
            defendendo = false;
        }
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public boolean isDefendendo() { return defendendo; }
    public void setDefendendo(boolean defendendo) { this.defendendo = defendendo; }
    public void setVida(int vida) { this.vida = vida; }
}
