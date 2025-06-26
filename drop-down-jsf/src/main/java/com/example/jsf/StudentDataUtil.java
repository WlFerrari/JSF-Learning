package com.example.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named("studentDataUtil")
@ApplicationScoped
public class StudentDataUtil {

    private List<Student> students;

    public StudentDataUtil() {
        loadSampleData();
    }

    public void loadSampleData() {
        students = new ArrayList<>();

        students.add(new Student("Mary", "Public", "mary@2luvcom"));
        students.add(new Student("John", "Garden", "john@2luvcom"));
        students.add(new Student("Ajay", "Rao", "ajay@2luvcom"));
    }

    public List<Student> getStudents() {
        return students;
    }
}
