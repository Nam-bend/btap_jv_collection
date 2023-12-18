package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class StudentManagementSystem {

    StudentManagementSystem() {
        this.studentList = new ArrayList<>();
    }


    private List<Students> studentList = new ArrayList<>();

    public void addStudent(Students students) {
        studentList.add(students);
    }

    public void displayStudentList() {        // displayStudent -lap in danh sach thong tin sv qua "student.returnInformation"
        for (Students student : studentList) {
            student.returnInformation();
            System.out.println("========================");
        }
    }

    public void addGrade(String studentID, String course, double grade) {
        // phương thức để lấy điểm của sv thông qua studentID  và add điểm qua lớp student "student.addGrade(course,grade)
        for (Students student : studentList) {
            if (student.getStudentID().equals(studentID)) {
                student.addGrade(course, grade);
                return;
            }
        }
        System.out.println("Student with ID " + studentID);


    }

    void displayStudentGrades(String studentID) {
        //hiển thi điểm số sv thong qua studentID
        // sdung map để lấy all điểm sv do va cac mon học

        for (Students student : studentList) {
            if (student.getStudentID().equals(studentID)) {
                System.out.println("Grades for Student ID: " + studentID);
                Map<String, Double> grades = student.getGrades();  //
                for (String course : grades.keySet()) {     // dùng vòng for duyet qua grades lấy ten mon học
                    System.out.println(course + ": " + grades.get(course));   //
                }
                return;
            }
        }
        System.out.println("Student with ID " + studentID);

    }

    public double calculateAverageGrade(String studentId) {
        for (Students student : studentList) {
            if (student.getStudentID().equals(studentId)) {
                HashMap<String, Double> grades = student.getGrades();
                if (grades.isEmpty()) {     // ktra map co rỗng khong
                    return 0;
                }
                double sum = 0;
                for (double grade : grades.values()) {   // duyet qua diem cua all mon học ttrong hash map
                    sum += grade;
                }
                return sum / grades.size();      // trả về giá trị điểm tb = tổng diểm /  grade.size() - " tra ve tong cac cap key-value trong Map"
            }
        }
        return 0;
    }

    public void displayHighestGrades() {
        //khoi tao bien
        double maxAverage = 0;
        Students highestScorer = null;  // lưu trữ tham chieu sv có diem cao nhat ban dau đặt = gia tri null

        for (Students student : studentList) {
            double average = calculateAverageGrade(student.getStudentID());  // khai bao 1 bien trung binh"average"
            if (average > maxAverage) {
                maxAverage = average;
                highestScorer = student;
            }
        }

        if (highestScorer != null) {    //  neu highestS  khac null thì ra được sinh vien có diem cao nhat va in ra thong tin sv do
            System.out.println("Student with highest grades:");
            highestScorer.returnInformation();
        } else {
            System.out.println("No students found.");
        }
    }

    public void findCommonCourses(ArrayList<Students> students) {
        if (students.size() < 2) {
            System.out.println("Provide at least two students to find common courses.");
            return;
        }

        Map<String, Integer> commonCourses = new HashMap<>();

        // Loop through courses of first student and check if they exist for others
        for (String course : students.get(0).getCourses()) {
            boolean isCommon = true;
            for (int i = 1; i < students.size(); i++) {
                if (!students.get(i).getCourses().contains(course)) {    //contain " phuong thuc List "ktra xem môn học này có trong danh sách ko với trường hợp cụ thể
                                                                        // ở đây thì ktra xem sv khác có môn học này khong ?
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                commonCourses.put(course, commonCourses.getOrDefault(course, 0) + 1);
            }
        }

        System.out.println("Common Courses:");
        for (String course : commonCourses.keySet()) {
            System.out.println(course + " is present for " + commonCourses.get(course) + " student(s).");
        }
    }
}


