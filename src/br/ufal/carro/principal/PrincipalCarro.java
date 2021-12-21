package br.ufal.carro.principal;

import br.ufal.carro.Carro;
import br.ufal.carro.MotorDiesel;
import br.ufal.carro.MotorFlex;

public class PrincipalCarro {
    public static void main(String[] args) {
        MotorFlex motorFlex = new MotorFlex();
        MotorDiesel motorDiesel = new MotorDiesel();

        Carro prisma = new Carro("Prisma", "Vermelho", motorFlex, 54);
        Carro panamera = new Carro("Panamera", "Preto", motorDiesel, 39);

        System.out.println("O que acontece se acelerar-mos um carro sem combustível?");
        System.out.println();

        prisma.ligar();
        prisma.acelerar(10);

        System.out.println("--------------------------------------------------------------------------------------------");


        System.out.println("Qual a velocidade de um carro com motor flex, se acelerarmos com 10 unidades de combustível?");
        System.out.println();

        prisma.abastecer(11);
        prisma.ligar();
        prisma.acelerar(10);

        System.out.println("--------------------------------------------------------------------------------------------");


        System.out.println("E se o motor for a diesel?");
        System.out.println();

        panamera.abastecer(11);
        panamera.ligar();
        panamera.acelerar(10);

        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
