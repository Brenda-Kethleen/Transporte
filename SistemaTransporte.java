package org.example;

public class SistemaTransporte {

    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta();
        Transporte carro = new Carro();

        executar(bicicleta, 100);
        executar(carro, 100);
    }

    static void executar(Transporte t, double distancia){
        t.calcularTrajeto(distancia);
    }

}
