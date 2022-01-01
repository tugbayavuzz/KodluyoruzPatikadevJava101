package salaryCalculator;


import java.util.Calendar;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double tax;
    double bonus;
    double total;
    double increaise;
    double bonusPrice = 0;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.total = this.salary;
        this.increaise = 0; //default
        this.bonus = 0;
        this.tax = 0;

    }

    void taxCalculate() {
        if (this.total > 1000.0) {
            this.tax = this.total * 0.03;
            this.total = (this.total - this.tax);
            System.out.println("Tax: " + this.tax);
        } else {
            this.tax = 0;
            System.out.println("Tax: " + this.tax);
        }
    }

    void bonus() {
        if (workHours > 40) {
            this.bonus = this.workHours - 40;
            this.bonus *= 30;
            this.bonusPrice = bonus;
            System.out.println("Bonus price: " + this.bonusPrice);
        } else {
            this.bonus = bonus;
            System.out.println("Bonus price: " + this.bonus);
        }

    }

    void increaiseSalary() {
        this.total = this.salary;
        int now = Calendar.getInstance().get(Calendar.YEAR);
        int time = now - hireYear;

        if (time < 10) {
            this.total *= 0.05;
            this.increaise += this.total;
            System.out.println("Salary increase  :" + this.increaise);

        }
        if (time > 9 && time < 19) {
            this.total *= 0.10;
            this.increaise += this.total;
            System.out.println("Salary increase  :" + this.increaise);
        }
        if (time > 19) {
            this.total *= 0.15;
            this.increaise += this.total;
            System.out.println("Salary increase  :" + this.increaise);
        }
    }

    void employeeInfo() {
        System.out.println("--------------------------------------");
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Salary : " + this.salary);
        System.out.println("Employee WorkHour : " + this.workHours);
        System.out.println("Employee Work Start Year  : " + this.hireYear);
        this.taxCalculate();
        this.bonus();
        this.increaiseSalary();
        System.out.println("Salary with tax and bonus : " + (this.salary - this.tax + this.bonus));
        System.out.println("Total salary :" + (this.total + this.salary));

    }
}
