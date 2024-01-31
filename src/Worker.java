import java.text.DecimalFormat;
import java.text.DecimalFormat;
public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        return hoursWorked * hourlyPayRate;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return "Weekly pay: " + formatDollar(weeklyPay);
    }
    public String formatDollar(double amount) {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "$" + df.format(amount);
    }
}