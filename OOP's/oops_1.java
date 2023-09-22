/**
 * oops_1
 */
public class oops_1 {

    public static void main(String[] args) {
        Student s = new Student();

        s.roll = 1;
        s.name = "Harsh";
        s.course = "CS";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;

        System.out.println("Total: "+ s.total());
        System.out.println("Details:\n " + s.toString());
        
    }
        static class Student {
        int roll;
        String name;
        String course;
        int m1,m2,m3;

        int total(){
            return m1+m2+m3;
        }

        float average(){
            return (float) total() / 2;
        }

        char grade(){
            if (average() >= 60)
                    return 'A';
            else{
                return 'B';
            }
        }

        public String toString(){
            return "Roll No."+roll+"\n"+"\n"+name+"\n"+"Course:"+course+"\n";
        }

        
        }
    }
