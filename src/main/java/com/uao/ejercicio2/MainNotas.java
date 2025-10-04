/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.ejercicio2;

/**
 *
 * @author USER
 */

public class MainNotas {
    public static void main(String[] args) {
        Notas nota1 = new Notas(2.5, 3.6, 4.0, 1.8, 3.3);
        System.out.printf("La cantidad de notas mayores o iguales a 3.0 son: %d\n",nota1.contarNotasMayores());

        Notas nota2 = new Notas(4.5, 4.0, 5.0, 2.9, 3.0);
        System.out.printf("La cantidad de notas mayores o iguales a 3.0 son: %d\n",nota2.contarNotasMayores());
    }    
}
