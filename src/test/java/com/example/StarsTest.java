package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StarsTest {
    Stars stars = new Stars();

    // Testes partições
    // partição: numero primo
    @Test
    public void testPrimeN() {
        assertEquals(9, stars.countFullStars(19));
        
    }

    // partição: numero par
    @Test
    public void testEvenN() {
        assertEquals(2, stars.countFullStars(10));
    }

    // partição: numero impar
    @Test
    public void testOddN() {
        assertEquals(4, stars.countFullStars(15));
    }

    // partição: numero grande
    @Test
    public void testBigN() {
        assertEquals(2000, stars.countFullStars(10000));
    }

    // partição: numero pequeno
    @Test
    public void testSmallN() {
        assertEquals(2, stars.countFullStars(5));
    }

    
    // Testes valor limite
    // limite inferior: n = 3
    @Test
    public void testLowerLimitN() {
        assertEquals(1, stars.countFullStars(3));
    }

    // limite superior: n = 2147483647
    @Test
    public void testUpperLimitN() {
        assertEquals(1073741823, stars.countFullStars(2147483647));
    }

    // fora do domínio: n = 0
    @Test
    public void testOutOfLimitN() {
        assertThrows(IllegalArgumentException.class, () -> stars.countFullStars(0));
    }

    // Testes de contrato
    // Pre-condição: n < 3 e n > 2147483647
    @Test
    public void testPreConditionN() {
        assertThrows(IllegalArgumentException.class, () -> stars.countFullStars(2));
        assertThrows(IllegalArgumentException.class, () -> stars.countFullStars(2147483647 + 1));
    }

    // Pós-condição: fullStars <= n/2
    @Test
    public void testPostConditionN() {
       for(int n = 3; n <= 100; n++){
        int fullStars = stars.countFullStars(n);
        assertTrue(fullStars <= n/2);
    }
}
}
