//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Address address = new Address("narkatiya","siwan",841243);
        Address address1 = new Address("pipra","gopalganj",841226);

        Employee emp = new Employee("aftab",1,address);
        Employee emp1 = new Employee("SAHID",2,address1);

        emp.display();
        emp1.display();

    }
}