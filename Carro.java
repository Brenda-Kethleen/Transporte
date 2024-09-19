package org.example;

public class Carro implements Transporte{

    private String modelo;
    private String cor;
    private String placa;

    @Override
    public void calcularTrajeto(double distancia) {
        double resultado = (distancia/40);
        System.out.println("O carro gasta " + resultado + " tempo.");
    }


}
