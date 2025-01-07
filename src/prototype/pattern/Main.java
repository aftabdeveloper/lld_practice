package prototype.pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Original list");
        Students originalList = new Students();
        originalList.loadStudents();
        System.out.println(originalList.getStudentList());

        System.out.println("cloned list");
        Students clonedList = originalList.Clone();
        System.out.println(clonedList.getStudentList());

        System.out.println("Object are same :"+ (originalList == clonedList));

        clonedList.getStudentList().add(new Student(5,"Saddam"));
        System.out.println("Cloned list after modification");
        System.out.println(clonedList.getStudentList());

        System.out.println("Original list after modification");
        System.out.println(originalList.getStudentList());
    }
}
