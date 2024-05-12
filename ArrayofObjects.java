import java.util.ArrayList;

class Student {

    int rollNo;
    String name;
    int marks;

}

public class ArrayofObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Ikram";
        s1.marks = 78;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Ifdal";
        s2.marks = 70;

        Student s3 = new Student();
        s3.rollNo = 2;
        s3.name = "Antara";
        s3.marks = 75;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out
                    .println("Name: " + students[i].name + " || " + "Roll No.: " + students[i].rollNo + " || "
                            + "Marks: "
                            + students[i].marks);
        }
    }
}