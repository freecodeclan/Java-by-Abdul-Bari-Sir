package revisonSession;


class Student{
    public int rollNo;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total(){
        return m1 + m2 + m3;
    }
    public float average(){
        return (float)total() / 3;
    }
    public char grade(){
         if(average() >= 70){
           return 'A';
        }
        else{
            return 'B';
        }
    }

}
public class studentData {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = 1;
        s.name = "John";
        s.course = "CS";
        s.m1 = 30;
        s.m2 = 40;
        s.m3 = 20;

        System.out.println("Total Marks: " + s.total());
        System.out.println("average Marks: " + s.average());
        System.out.println("Your grade is: " + s.grade());
    }
}
