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
        System.out.println("hola juan pedro, y mis otros cambios. Generando conflicto");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // Devuelve la posición donde se encontró la clave
            }
        }
        return -1; // Si no se encontró
    }
    
}
