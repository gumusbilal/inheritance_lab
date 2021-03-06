import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Martin", "TY 87 67 55B", 50000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Martin", developer.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("TY 87 67 55B", developer.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10000.00);
        assertEquals(60000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500.00 ,developer.payBonus(), 0.01);
    }

    @Test
    public void raiseCannotBeNegative() {
        developer.raiseSalary(-1000.00);
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        developer.setName("Rob");
        assertEquals("Rob", developer.getName());
    }

    @Test
    public void cannotChangeNameToEmptyString() {
        developer.setName("");
        assertEquals("Martin", developer.getName());
    }
}

