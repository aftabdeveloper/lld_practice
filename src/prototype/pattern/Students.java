package prototype.pattern;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{
    List<Student> studentList;

    public Students(){
        studentList = new ArrayList<>();
    }

    public Students(List<Student> studentList){
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void loadStudents(){
        // some code to fetch data from remote server
        studentList.add(new Student(1,"Aftab"));
        studentList.add(new Student(2,"SAahid"));
        studentList.add(new Student(3,"Osim"));
    }

    public Students Clone(){
        List<Student> clonedList = new ArrayList<>();
        for(Student student : studentList){
            clonedList.add(student);
        }
        return new Students(clonedList);
    }
}
