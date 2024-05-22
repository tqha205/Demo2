package constructor;

public class Thuchanh2 {
    Thuchanh2() {
        System.out.println("xin chao.");
    }

    private String hoten;
    private double diem;

    public Thuchanh2(String hoten,double diem ) {
//
        this.hoten = hoten;
        this.diem = diem;
    }

    public void hienthi() {
        System.out.println(hoten + ": " + diem);
    }

}
