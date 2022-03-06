/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAirlines;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


//Hancrets
import static org.hamcrest.CoreMatchers.anyOf; 
import static org.hamcrest.CoreMatchers.equalTo; 
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


/**
 *
 * Hamcrest tiene elmentos de comparacion 
 * Nos da una descripcion legible por una falla de la asercion
 * Prorpociona una cifra masd detallada de resultados
 */
public class HancrestTest {

    private List<String> values;

    @BeforeEach
    public void setUp() {
        values = new ArrayList< >();
        values.add("Michael");
        values.add("Jhon");
        values.add("Edwin");
    }

    @Test
    @DisplayName("Lista con Hamcrest y metodos especiciales de asercion")
    public void testWithHamcrest() {
         List<String> valor = new ArrayList<>();
         valor.add("Michael");
        valor.add("Jhon");
        valor.add("Edwin");
        assertThat(valor, hasSize(3));
        assertThat(valor, hasItem("Edwin"));
        assertThat(values, nullValue());
//        assertThat(valor, hasItem(anyOf(equalTo("Oliver"),
// equalTo("Jack"), equalTo("Harry"))));
    }
}
