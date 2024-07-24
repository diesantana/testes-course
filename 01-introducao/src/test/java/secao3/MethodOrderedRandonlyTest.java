package secao3;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
class MethodOrderedRandonlyTest {

    @Test
    void testA() {
        System.out.println("Running Test A");
    }
    
    @Test
    void testB() {
        System.out.println("Running Test B");
    }
    
    
    @Test
    void testD() {
        System.out.println("Running Test D");
    }

    @Test
    void testC() {
    	System.out.println("Running Test C");
    }
}
