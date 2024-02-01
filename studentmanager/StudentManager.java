package studentmanager;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();
    private int nextId = 1;

    public StudentManager() {
        addStudent(new Student(nextId++, "Nguyễn Văn A", 18, "nguyena@gmail.com"));
        addStudent(new Student(nextId++, "Trần Thị B", 19, "tranb@gmail.com"));
        addStudent(new Student(nextId++, "Hoàng Văn C", 22, "hoangc@gmail.com"));
        addStudent(new Student(nextId++, "Lê Thị D", 21, "led@gmail.com"));
    }

    public void addStudent(Student student) {
        if (!students.containsKey(student.getId())) {
            students.put(student.getId(), student);
        } else {
            System.out.println("Sinh viên với ID " + student.getId() + " đã tồn tại.");
        }
    }

    public void displayAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public void searchStudentsByName(String name) {
        boolean found = false;
        for (Student student : students.values()) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên: " + name);
        }
    }

    public void updateStudent(int id, Student updatedStudent) {
        if (students.containsKey(id)) {
            students.put(id, updatedStudent);
            System.out.println("Cập nhật thông tin sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + id);
        }
    }

    public void deleteStudent(int id) {
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Xóa sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + id);
        }
    }
}
