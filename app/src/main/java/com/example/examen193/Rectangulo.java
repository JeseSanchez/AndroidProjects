package com.example.examen193;

public class Rectangulo {
    private int Base, Altura;

    Rectangulo(){
        Base = 0;
        Altura = 0;
    }

    public void setBase(int base) {
        Base = base;
    }

    public int getBase() {
        return Base;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public int getAltura() {
        return Altura;
    }

    public int calcularPer(){
        return 2*(Base + Altura);
    }

    public int calcularArea(){
        return (Base*Altura);
    }
}
