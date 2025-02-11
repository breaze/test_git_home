/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.breaze.test_git_home;

/**
 *
 * @author breaze
 */
public class Demo {
    
    public int buscarNumeroEnArreglo(int[] arreglo, int valorBuscado){
        // Recorremos el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            // Si encontramos el valor, devolvemos el índice
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        // Si no se encuentra el valor, devolvemos -1
        return -1;
    }
    
}
