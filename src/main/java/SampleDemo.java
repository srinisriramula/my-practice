 class Student {

    public static String ceo;
    /*public Student() {
        System.out.println(" Student constructor ");
    }*/



    public Student(String name, int age, String rollNo, int marks) {
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


public class SampleDemo {
    public static void main(String[] args) {
     /*   int counetr = 1;
        int loopSize = 7;
        String printText = "";
       *//* while(counetr < 5){
            System.out.println(" loop :: "+counetr);
            counetr++;
        }*//*
        for(int loopCount=0; loopCount < loopSize; loopCount++ ){
           printText = " keerthi "+loopCount +" , size of counter "+loopSize;
            System.out.println(printText);
            System.out.println(" for loop :: "+loopCount);
        }*/

     /*   SampleDemo sampleDemo = new SampleDemo();

        System.out.println("sampleDemo :: "+sampleDemo);*/
        //Student student = new Student();
        //Student student = new Student("Std1",15, "roll431", 120);
       /* student.setName("Std1");
        student.setAge(29);
        student.setMarks(200);
        student.setRollNo("Role777")*/
        ;

       /* System.out.println("student :: "+student);

        String studentInfo = student.getStudentIno();
        System.out.println("studentInfo :: "+studentInfo);

        System.out.println("toString :: "+student.toString());

        System.out.println("Name :: "+student.getName());*/

        Student studentObj = new Student("Std1",15, "roll431", 120);
        studentObj.ceo = "CEo1";

         Student studentObj2 = new Student("Std1",15, "roll431", 120);
        studentObj2.ceo = "CEO2";

        System.out.println(studentObj.toString() );
        System.out.println("CEO :: "+Student.ceo);
    }
}
