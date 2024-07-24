package secao3;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrderedIndex {

    @Test
    @Order(2)
    void testA() {
        System.out.println("Running Test A");
    }
    
    @Test
    @Order(3)
    void testB() {
        System.out.println("Running Test B");
    }

    @Test
    @Order(1)
    void testC() {
    	System.out.println("Running Test C");
    }
}
