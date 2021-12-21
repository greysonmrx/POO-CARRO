package br.ufal.carro;

public class MotorFlex extends Motor {
    public void acelerar(Carro c, int quantCombustivel) {
        this.setAceleracao(quantCombustivel * 500);
        c.setVelocidade(this.getAceleracao() / 50);
    }
}
