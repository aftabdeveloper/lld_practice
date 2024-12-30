public class Employee {
    String name;
    int empId;
    Address address;
    public Employee(String name, int empId, Address address){
        this.name = name;
        this.empId = empId;
        this.address = address;
    }

    public void display(){
        System.out.println(name+" "+empId+" "+address.city+ " "+address.pinCode+" "+address.name);
    }
}
