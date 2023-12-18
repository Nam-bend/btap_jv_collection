package Student;
import java.util.*;


public class Students {
    private String studentID ;
    private  String name ;
    private  String gender ;
    private  String dateOfBirth ;
    private String address ;
    private String contactNumber ;
    private Set<String> courses =new HashSet<>();
    private Map<String,Double> grades =new HashMap<>();

    Students(String studentID, String name ,String gender,String dateOfBirth,String address,String contactNumber) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.contactNumber = contactNumber;
        this.courses = new HashSet<>();
        this.grades = new HashMap<>();
    }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentId(String studentId) {
            this.studentID = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public HashSet<String> getCourses() {
            return (HashSet<String>) courses;
        }

        public void setCourses(HashSet<String> courses) {
            this.courses = courses;
        }

        public HashMap<String, Double> getGrades() {
            return (HashMap<String, Double>) grades;
        }

        public void setGrades(HashMap<String, Double> grades) {
            this.grades = grades;
        }
    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void addGrade(String course, double grade) {
        this.grades.put(course, grade);
    }
        public void returnInformation(){
            System.out.println("student :");
            System.out.println("Student id : " +getStudentID());
            System.out.println("name student : "+ getName()) ;
            System.out.println("gender : "+ getGender());
            System.out.println("address :"+address);
            System.out.println("date of birth :"+ dateOfBirth);
            System.out.println("contact number :"+ contactNumber);
            System.out.println("courses : "+courses);
            System.out.println("grades :"+ grades);
        }

    }



