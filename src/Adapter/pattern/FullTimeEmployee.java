package Adapter.pattern;

public class FullTimeEmployee implements Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public FullTimeEmployee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getFullName() {
        return firstName+" "+lastName;
    }

    @Override
    public double calculateAnnualSalary() {
        return 12*monthlySalary;
    }
}
