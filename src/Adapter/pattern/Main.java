package Adapter.pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee fullTimeEmployee1 = new FullTimeEmployee("aftab","alam",5000);

        employeeList.add(fullTimeEmployee1);

        ContractBasedEmployee contractBasedEmployee = new ContractBasedEmployee("sohail","ansari",200,10);
        employeeList.add(new EmployeeAdapter(contractBasedEmployee));

        for(Employee employee : employeeList){
            System.out.println(employee.getFullName()+" "+employee.calculateAnnualSalary());
            System.out.println();
        }
    }
}
