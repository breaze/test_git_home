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
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Verifica si la clave está en el medio
            if (arreglo[medio] == clave) {
                return medio;
            }

            // Si la clave es mayor, ignora la mitad izquierda
            if (arreglo[medio] < clave) {
                inicio = medio + 1;
            } 
            // Si la clave es menor, ignora la mitad derecha
            else {
                fin = medio - 1;
            }
        }

        // Si no se encontró la clave
        return -1;
    }
    
}
