

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        Worker worker1 = new Worker("John", "Doe", "W001", "Mr.", 1985, 20.0);
        Worker worker2 = new Worker("Jane", "Smith", "W002", "Ms.", 1990, 18.0);
        Worker worker3 = new Worker("Bob", "Johnson", "W003", "Dr.", 1978, 22.0);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        SalaryWorker salaryWorker1 = new SalaryWorker("Alice", "Johnson", "SW001", "Prof.", 1982, 25.0, 100000.0);
        SalaryWorker salaryWorker2 = new SalaryWorker("Charlie", "Brown", "SW002", "Dr.", 1975, 30.0, 120000.0);
        SalaryWorker salaryWorker3 = new SalaryWorker("Eva", "Williams", "SW003", "Mrs.", 1988, 28.0, 110000.0);

        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");

            for (Worker worker : workers) {
                double hoursWorked;

                switch (week) {
                    case 1:
                        hoursWorked = 40.0;
                        break;
                    case 2:
                        hoursWorked = 50.0;
                        break;
                    case 3:
                        hoursWorked = 40.0;
                        break;
                    default:
                        hoursWorked = 0.0;
                        break;
                }

                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }

            System.out.println();
        }

    }

}