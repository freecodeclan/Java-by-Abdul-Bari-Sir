package Interface;

class Phone{
    public void call(){
        System.out.println("Phone Call");
    }
    public void sms(){
        System.out.println("Phone sending msg");
    }
}
interface Icamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void stop();
}
class SmartPhone extends Phone implements Icamera, IMusicPlayer{
    public void videoCall(){
        System.out.println("SmartPhone video calling");
    }
    public void click(){
        System.out.println("Smartphone clicking photo");
    }
    public void record(){
        System.out.println("Smartphone recording video");
    }
    public void play(){
        System.out.println("Smarttphone video");
    }
    public void stop(){
        System.out.println("Smartphone stop");
    }

}


public class file_2 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.click();
        sp.play();
        sp.stop();
        sp.videoCall();
    }
    
}
