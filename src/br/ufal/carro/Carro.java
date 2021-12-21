package br.ufal.carro;

public class Carro {
    private String modelo;
    private String cor;
    private int velocidade;
    private Tanque tanque;
    private Motor motor;

    public Carro(String modelo, String cor, Motor motor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocidade = 0;
        this.tanque = new Tanque(capacidadeTanque);
    }

    public void ligar() {
        this.motor.ligar();
        System.out.println("O carro " + this.modelo + " está ligado");
    }

    public void desligar() {
        if (this.getVelocidade() > 0) {
            this.freiar();
            System.out.println("O carro " + this.modelo + " freou e está a " + this.getVelocidade() + " km/h");
        }

        this.motor.desligar();
        System.out.println("O carro " + this.modelo + " está desligado");
    }

    public void acelerar(int quantCombustivel) {
        int combustivelUsado = this.tanque.usarCombustivel(quantCombustivel);

        this.motor.acelerar(this, Math.abs(combustivelUsado));

        System.out.println("O carro " + this.modelo + " acelerou e está a " + this.getVelocidade() + " km/h");

        if (combustivelUsado < quantCombustivel) {
            this.desligar();
        }
    }

    public void freiar() {
        this.setVelocidade(0);
    }

    protected void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void abastecer(int quantidade) {
        this.tanque.abastecer(quantidade);

        System.out.println("O carro " + this.modelo + " abasteceu " + quantidade + " unidades de combustível");
    }
}
