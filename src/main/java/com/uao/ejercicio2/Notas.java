/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uao.ejercicio2;

/**
 *
 * @author USER
 */
public class Notas {
    double[] notas;

    public Notas(double nota1, double nota2, double nota3, double nota4, double nota5){
        this.notas = new double[]{nota1, nota2, nota3, nota4, nota5};
    }

    public int contarNotasMayores(){
        int contador = 0;
        for(double nota : notas){
            if (nota >=3.0) {
                contador++;
            }
        }
        return contador;
    }

}

