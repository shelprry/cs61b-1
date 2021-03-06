import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /* Do not change this to be private. For silly testing reasons it is public. */
    public Calculator tester;

    /**
     * setUp() performs setup work for your Calculator.  In short, we 
     * initialize the appropriate Calculator for you to work with.
     * By default, we have set up the Staff Calculator for you to test your 
     * tests.  To use your unit tests for your own implementation, comment 
     * out the StaffCalculator() line and uncomment the Calculator() line.
     **/
    @Before
        public void setUp() {
            //tester = new StaffCalculator(); // Comment me out to test your Calculator
            tester = new Calculator();   // Un-comment me to test your Calculator
        }

    // TASK 1: WRITE JUNIT TESTS
    // YOUR CODE HERE
    @Test
        public void testAdd1(){
            assertEquals(tester.add(3,4),7);
        }

    @Test
        public void testAdd2(){
            assertEquals(tester.add(3,-4),-1);
        }
    @Test
        public void testAdd3(){
            assertEquals(tester.add(3,-3),0);
        }


    @Test
        public void testAdd4(){
            assertEquals(tester.add(-35,-25),-60);
        }


    @Test
        public void testAdd5(){
            assertEquals(tester.add(33,0),33);
        }


    @Test
        public void testAdd6(){
            assertEquals(tester.add(0,-33),-33);
        }

    @Test
        public void testMultiply1(){
            assertEquals(tester.multiply(2,5),10);
        }
    @Test
        public void testMultiply2(){
            assertEquals(tester.multiply(0,-3),0);
        }


    @Test
        public void testMultiply3(){
            assertEquals(tester.multiply(-41,3),-123);
        }


    @Test
        public void testMultiply4(){
            assertEquals(tester.multiply(-2,-3),6);
        }


    @Test
        public void testMultiply5(){
            assertEquals(tester.multiply(-3,0),0);
        }


    @Test
        public void testMultiply6(){
            assertEquals(tester.multiply(1,1),1);
        }




    /* Run the unit tests in this file. */
    public static void main(String... args) {
        jh61b.junit.textui.runClasses(CalculatorTest.class);
    }       
}
