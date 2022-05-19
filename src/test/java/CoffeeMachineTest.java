import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CoffeeMachineTest {
    @Test
    public void test1() {
        CoffeeMachine test1 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test1.openMachine());
    }

    @Test
    public void test2() {
        CoffeeMachine test2 = new CoffeeMachine();
        test2.isPowerOn = true;
        assertEquals("Error!", test2.openMachine());
    }

    @Test
    public void test3() {
        CoffeeMachine test3 = new CoffeeMachine();
        assertEquals("Turn Machine On first!", test3.addMoney(30));
    }

    @Test
    public void test4() {
        CoffeeMachine test4 = new CoffeeMachine();
        test4.openMachine();
        assertEquals("Successfully added money", test4.addMoney(30));
    }

    @Test
    public void test5() {
        CoffeeMachine test5 = new CoffeeMachine();
        test5.openMachine();
        test5.closeMachine();
        assertEquals("Turn Machine On first!", test5.addMoney(30));
    }

}