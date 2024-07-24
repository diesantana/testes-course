package secao3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class InstanceTest {
	
	StringBuilder actual = new StringBuilder("");
	
	@AfterEach
	void afterEach() {
		System.out.println("The actual value is " + actual);
	}

    @Test
    void testA() {
        System.out.println("Running Test A");
        actual.append("1");
    }
    
    @Test
    void testB() {
        System.out.println("Running Test B");
        actual.append("2");
    }

}
