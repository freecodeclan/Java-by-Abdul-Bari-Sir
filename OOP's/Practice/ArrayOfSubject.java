public class ArrayOfSubject {
    public static void main(String[] args) {

        Subject subs[] = new Subject[3];

        // Objects 
        subs[0] = new Subject("s101", "Data Structures", 100);
        subs[1] = new Subject("s102", "SAD", 100);
        subs[2]  = new Subject("s103", "Operating System", 100);

        for(Subject s:subs){
            System.out.println(s);
        }
        
    }
    static class Subject{
        private String subID;
        private String name;
        private int maxMarks;
        private int marksObtain;

        // Constructor 
        public Subject(String subID, String name, int maxMarks){
            this.subID = subID;
            this.name = name;
            this.maxMarks = maxMarks;
        }

        // Property Methods
        public String getSubID(){
            return subID;
        }
        public String getName(){
            return name;
        }
        public int getMaxMarks(){
            return maxMarks;
        }
        public int getMarksObt(){
            return marksObtain;
        }

        public void setmaxMarks(int mm){
            maxMarks = mm;
        }
        public void setMarksObatain(int mo){
            marksObtain = mo;
        }

        // Enquiry Method
        public boolean isQualified(){
            return marksObtain >= maxMarks/10*4;
        }

        public String toString(){
            return "\nSubject ID:"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
        }


    }
}
