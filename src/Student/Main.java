//Yêu cầu:
//Lớp Student:
//•	Tạo một lớp Student với các thuộc tính sau:
//•	studentId (mã sinh viên) - kiểu String.
//•	name (tên sinh viên) - kiểu String.
//•	gender (giới tính) - kiểu String.
//•	dateOfBirth (ngày sinh) - kiểu String.
//•	address (địa chỉ) - kiểu String.
//•	contactNumber (số điện thoại liên lạc) - kiểu String.
//•	courses (danh sách các môn học đang theo học) - kiểu HashSet<String>.
//•	grades (danh sách điểm số cho từng môn học) - kiểu HashMap<String, Double>.
//2.    Quản Lý Sinh Viên và Điểm Số:
//•	Tạo một lớp StudentManagementSystem để quản lý thông tin sinh viên và điểm số.
//•	Sử dụng ArrayList để lưu danh sách sinh viên.
//•	Thêm và quản lý thông tin của ít nhất 3 sinh viên.
//•	Viết phương thức để hiển thị danh sách sinh viên.
//•	Viết phương thức để thêm thông tin điểm số cho một sinh viên và một môn học cụ thể.
//•	Viết phương thức để hiển thị điểm số của một sinh viên cho tất cả các môn học.
//•	Viết phương thức để tính điểm trung bình của một sinh viên.
//•	Viết phương thức để tìm và hiển thị thông tin của sinh viên có điểm số cao nhất.
//•	Tạo một phương thức findCommonCourses(Array<Sinhvien> mangSinhvien)
// để tìm ra danh sách các môn học chung của mảng sinh viên vừa truyền vào (edited)

package Student ;

import java.util.ArrayList;

public class Main extends Students  {
    Main(String studentID, String name, String gender, String dateOfBirth, String address, String contactNumber) {
        super(studentID, name, gender, dateOfBirth, address, contactNumber);
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem() ;
        Students student1 = new Students("SV1","Nam","male","30/10","Nam Đinh","0342218551");
        student1.addCourse("Math");
        student1.addCourse("History");
        student1.addGrade("Math", 12);
        student1.addGrade("History", 89);

        system.addStudent(student1);
        Students student2 = new Students("SV2","Thu","female","15/1","Hai Duong","039*****9");
        student2.addCourse("Math");
        student2.addCourse("History");
        student2.addGrade("Math", 82);
        student2.addGrade("History", 90);
        system.addStudent(student2);

        system.displayStudentList();

        System.out.println("----------------------");
        system.displayStudentGrades("SV2");

        System.out.println("----------------------");
        system.calculateAverageGrade("SV1");
        System.out.println("______________________");
        system.displayHighestGrades();
        System.out.println("______________________");
        ArrayList<Students> studentList = new ArrayList<>() ;
        system.findCommonCourses(studentList);



    }
}


