package Adapter.pattern;

public class ContractBasedEmployee {
    private String fName;
    private String lName;
    private double hourlySalary;
    private int weeklyHours;

    public ContractBasedEmployee(String fName, String lName, double hourlySalary, int weeklyHours) {
        this.fName = fName;
        this.lName = lName;
        this.hourlySalary = hourlySalary;
        this.weeklyHours = weeklyHours;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getNoOfWeeklyHours() {
        return weeklyHours;
    }
}
