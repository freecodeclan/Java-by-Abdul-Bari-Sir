package revisonSession;

class TV{
    public void switchON(){
        System.out.println("TV is switched ON");
    }
    public void changeChannel(){
        System.out.println("Change Channel");
    }
}
class SmartTV extends TV{
    @Override
    public void switchON(){
        System.out.println("SmartTV is switched ON");
    }
    public void changeChannel(){
        System.out.println("Change Channel of Smart TV");
    }
    public void browse(){
        System.out.println("SmartTV browsing");
    }
}

public class overridingProject {
    public static void main(String[] args) {
        TV t = new SmartTV();
        
        t.changeChannel();
        t.switchON(); 
    }
    
}
