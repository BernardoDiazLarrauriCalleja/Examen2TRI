/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2tri;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ber
 */
public class ExamenTest {

    /**
     * Test del método elMayorDe. listaenteros == null valor esperado Excepcion
     * "Lista de números vacía, no se puede calcular el máximo").
     */
    @Test
    public void testElMayorDe01() throws Exception {
        System.out.println("elMayorDe cuando no hay número en el Array");

        int[] listaEnteros = null;
        String expResult = "Lista de números vacía, no se puede calcular el máximo";

        try {
            int result = Examen.elMayorDe(listaEnteros);
            fail("No debe pasar el test. La lista de número no puede estar vacía");
        } catch (Exception e) {

            System.out.println(e);
            /* assertTrue(Examen.elMayorDe(listaEnteros)== null);*/
        }

    }
}
