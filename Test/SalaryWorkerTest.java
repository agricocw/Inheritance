import org.junit.Test;

import java.util.Objects;
import static org.junit.Assert.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("John", "Doe", "SW001", "Prof.", 1980, 30.0, 120000.0);
        double weeklyPay = salaryWorker.calculateWeeklyPay(40.0);
        assertEquals(2307.69, weeklyPay, 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Smith", "SW002", "Dr.", 1990, 35.0, 100000.0);
        String display = salaryWorker.displayWeeklyPay(40.0);
        assertEquals("Weekly pay: $1923.08", display);
    }

    @Test
    public void testGettersAndSetters() {
        SalaryWorker salaryWorker = new SalaryWorker("Alice", "Johnson", "SW003", "Prof.", 1985, 25.0, 150000.0);

        assertEquals("Alice", salaryWorker.getFirstName());
        assertEquals("Johnson", salaryWorker.getLastName());
        assertEquals("SW003", salaryWorker.getID());
        assertEquals("Prof.", salaryWorker.getTitle());
        assertEquals(1985, salaryWorker.getYOB());
        assertEquals(25.0, salaryWorker.getHourlyPayRate(), 0.01);
        assertEquals(150000.0, salaryWorker.getAnnualSalary(), 0.01);

        salaryWorker.setFirstName("NewAlice");
        salaryWorker.setLastName("NewJohnson");
        salaryWorker.setID("NewSW003");
        salaryWorker.setTitle("NewProf.");
        salaryWorker.setYOB(1990);
        salaryWorker.setHourlyPayRate(30.0);
        salaryWorker.setAnnualSalary(180000.0);

        assertEquals("NewAlice", salaryWorker.getFirstName());
        assertEquals("NewJohnson", salaryWorker.getLastName());
        assertEquals("NewSW003", salaryWorker.getID());
        assertEquals("NewProf.", salaryWorker.getTitle());
        assertEquals(1990, salaryWorker.getYOB());
        assertEquals(30.0, salaryWorker.getHourlyPayRate(), 0.01);
        assertEquals(180000.0, salaryWorker.getAnnualSalary(), 0.01);
    }

    @Test
    public void testCalculateWeeklyPayWithDifferentHourlyRate() {
        SalaryWorker salaryWorker = new SalaryWorker("Bob", "Brown", "SW004", "Mr.", 1988, 22.0, 120000.0);
        double weeklyPay = salaryWorker.calculateWeeklyPay(40.0);
        assertEquals(2307.69, weeklyPay, 0.01);
    }

    @Test
    public void testDisplayWeeklyPayWithDifferentHourlyRate() {
        SalaryWorker salaryWorker = new SalaryWorker("Eva", "Williams", "SW005", "Mrs.", 1995, 28.0, 90000.0);
        String display = salaryWorker.displayWeeklyPay(40.0);
        assertEquals("Weekly pay: $1730.77", display);
    }

}
