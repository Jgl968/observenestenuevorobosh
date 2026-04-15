package ual.hmis;

import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1() {
        Coche coche1 = new Coche("rojo", "ford", 100, 4);
        Coche coche2 = new Coche("rojo", "ford", 100, 4);
        assert(coche1.equals(coche2));
    }
}
