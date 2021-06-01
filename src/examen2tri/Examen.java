/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2tri;

/**
 * @author Juan Carlos Granero Maraver <jgramar761@iesportada.org>
 */
public class Examen {

    public static int TAMAÑOMAXIMO = 100;

    public static int elMayorDe(int[] listaEnteros) throws Exception {
        if (listaEnteros == null) {
            throw new Exception("Lista de números vacía, no se puede calcular el máximo");
        }
        if (listaEnteros.length > TAMAÑOMAXIMO) {
            throw new Exception("Lista de números demasido grande, no se puede calcular el máximo");
        }
        int maximo = listaEnteros[0];
        for (int i = 1; i < listaEnteros.length; i++) {
            if (maximo < listaEnteros[i]) {
                maximo = listaEnteros[i];
            }
        }
        return maximo;
    }
}
