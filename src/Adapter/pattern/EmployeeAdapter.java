package Adapter.pattern;

public class EmployeeAdapter implements Employee{
    ContractBasedEmployee contractBasedEmployee;

    EmployeeAdapter(ContractBasedEmployee contractBasedEmployee){
        this.contractBasedEmployee = contractBasedEmployee;
    }
    @Override
    public String getFullName() {
        return contractBasedEmployee.getfName()+" "+contractBasedEmployee.getlName();
    }

    @Override
    public double calculateAnnualSalary() {
        return contractBasedEmployee.getHourlySalary() * contractBasedEmployee.getNoOfWeeklyHours() * 52;
    }
}
