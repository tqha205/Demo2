package constructor;

public class Thuchanh extends Thuchanh2 {
    Thuchanh(){

    }
    public static void main(String[] args) {
        Thuchanh c1 = new Thuchanh();
        c1.hienthi();
        Thuchanh2 c3=new Thuchanh2("teo",3);
        c3.hienthi();

    }


}
