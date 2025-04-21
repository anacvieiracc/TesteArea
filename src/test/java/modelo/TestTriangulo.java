package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangulo {

    @Test
    public void testGetAreaConstrutorVazio() {
        Triangulo instance = new Triangulo();
        double expResult = 0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetArea() {
        Triangulo instance = new Triangulo(3.0, 2.0);
        double expResult = 3.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0);
    }
}
