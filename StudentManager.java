import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(String studentId, double newGrade) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.setGrade(newGrade);
                break;
            }
        }
    }

    public void editStudentName(String studentId, String newName) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.setFullName(newName);
                break;
            }
        }
    }

    public void deleteStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    public void sortStudents() {
        students.sort((student1, student2) -> Double.compare(student2.getGrade(), student1.getGrade()));
    }

    public Student searchStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
