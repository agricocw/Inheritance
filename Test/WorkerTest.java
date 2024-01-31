import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    public void testCalculateWeeklyPayRegularHours() {
        Worker worker = new Worker("John", "Doe", "W001", "Mr.", 1990, 20.0);
        double weeklyPay = worker.calculateWeeklyPay(40.0);
        assertEquals(800.0, weeklyPay, 0.01); // Assuming no overtime, 40 hours at $20.0 per hour
    }

    @Test
    public void testCalculateWeeklyPayOvertimeHours() {
        Worker worker = new Worker("Jane", "Smith", "W002", "Ms.", 1988, 18.0);
        double weeklyPay = worker.calculateWeeklyPay(50.0);
        assertEquals(990.0, weeklyPay, 0.01); // 40 hours regular pay + 10 hours overtime at time and a half
    }

    @Test
    public void testCalculateWeeklyPayZeroHours() {
        Worker worker = new Worker("Bob", "Johnson", "W003", "Dr.", 1985, 22.0);
        double weeklyPay = worker.calculateWeeklyPay(0.0);
        assertEquals(0.0, weeklyPay, 0.01); // Zero hours should result in zero pay
    }

    @Test
    public void testDisplayWeeklyPayRegularHours() {
        Worker worker = new Worker("Alice", "Williams", "W004", "Mrs.", 1995, 25.0);
        String display = worker.displayWeeklyPay(40.0);
        assertEquals("Regular pay for 40.0 hours: $1000.0", display);
    }

    @Test
    public void testDisplayWeeklyPayOvertimeHours() {
        Worker worker = new Worker("Charlie", "Brown", "W005", "Mr.", 1982, 30.0);
        String display = worker.displayWeeklyPay(50.0);
        assertEquals("Regular pay for 40.0 hours: $1200.0", display);
        // Assuming no overtime-specific message for this test
    }

    @Test
    public void testDisplayWeeklyPayZeroHours() {
        Worker worker = new Worker("Eva", "Jones", "W006", "Dr.", 1990, 28.0);
        String display = worker.displayWeeklyPay(0.0);
        assertEquals("Regular pay for 0.0 hours: $0.0", display);
    }

    @Test
    public void testGettersAndSetters() {
        Worker worker = new Worker("Frank", "Miller", "W007", "Mr.", 1988, 24.0);

        // Test getters
        assertEquals("Frank", worker.getFirstName());
        assertEquals("Miller", worker.getLastName());
        assertEquals("W007", worker.getID());
        assertEquals("Mr.", worker.getTitle());
        assertEquals(1988, worker.getYOB());
        assertEquals(24.0, worker.getHourlyPayRate(), 0.01);

        // Test setters
        worker.setFirstName("NewFrank");
        worker.setLastName("NewMiller");
        worker.setID("NewW007");
        worker.setTitle("NewMr.");
        worker.setYOB(1990);
        worker.setHourlyPayRate(28.0);

        assertEquals("NewFrank", worker.getFirstName());
        assertEquals("NewMiller", worker.getLastName());
        assertEquals("NewW007", worker.getID());
        assertEquals("NewMr.", worker.getTitle());
        assertEquals(1990, worker.getYOB());
        assertEquals(28.0, worker.getHourlyPayRate(), 0.01);
    }

}