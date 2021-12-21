package br.ufal.carro;

public abstract class Motor {
    private boolean ligado;
    private int aceleracao;

    public Motor() {
        this.ligado = true;
        this.aceleracao = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    protected void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getAceleracao() {
        return this.aceleracao;
    }

    public abstract void acelerar(Carro c, int quantCombustivel);
}
