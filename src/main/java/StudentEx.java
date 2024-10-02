public class StudentEx {

    public static String ceo;
    /*public Student() {
        System.out.println(" Student constructor ");
    }*/



    public StudentEx(String name, int age, String rollNo, int marks) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getStudentIno(){
        String studentInfo = " Student Name :"+this.name + " : Student Roll No : "+this.rollNo;
        return studentInfo;
    }

    private String name;
    private int age;
    private String rollNo;
    private int marks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static String getCeo() {
        return ceo;
    }

    public static void setCeo(String ceo) {
        StudentEx.ceo = ceo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                ", marks=" + marks +
                ", ceo=" + ceo +
                '}';
    }
}
