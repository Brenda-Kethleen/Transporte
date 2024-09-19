package org.example;

//herda metodo, mais não herda os atributos por ser uma interface
//implements é para estanciar uma interface
public class Bicicleta implements Transporte{

private int quantPassageiros;
private String marca;
private String quantRodas;

    @Override
    public void calcularTrajeto(double distancia) {
        double resultado = (distancia/90);
        System.out.println("Tempo de bike = " + resultado);
    }
}
