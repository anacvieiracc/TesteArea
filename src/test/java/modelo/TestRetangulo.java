package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRetangulo {

    @Test
    public void testGetAreaConstrutorVazio() {
        Retangulo instance = new Retangulo();
        double expResult = 0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetArea() {
        Retangulo instance = new Retangulo(3.0, 2.0);
        double expResult = 6.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0);
    }
}