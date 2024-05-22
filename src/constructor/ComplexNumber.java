package constructor;

public class ComplexNumber extends ComplexNumberParent {

    ComplexNumber() {
//        super();
        System.out.println("Ham khoi tao tu con khong tham so");
    }
    double real, img;
    ComplexNumber object;

    //constructor để khởi tạo số phức
    ComplexNumber(double r, double i) {
//        super(i);
        System.out.println("Ham khoi tao tu con voi ham 2 tham so");
        real = r;
        this.img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;//cộng các phần thực
        temp.img = c1.img + c2.img;//cộng các phần ảo

//        temp.object.real = c1.object.real + c2.object.real;
//        temp.object.img = c1.object.img + c2.object.img;
//        temp.object.object = c1.object;

        //trả về số phức đầu ra
        return temp;
    }

    public static void main(String args[]) {
//        Constructor.ComplexNumber c1 = new Constructor.ComplexNumber(5.2, 4.4);//nhập vào phần thực và phần ảo của số phức thứ nhất
//        System.out.println(c1.real + " --- " + c1.img);
//
//        Constructor.ComplexNumber c2 = new Constructor.ComplexNumber(2.0, 7.3);//nhập vào phần thực và phần ảo của số phức thứ hai
//        System.out.println(c2.real + " --- " + c2.img);
        ComplexNumber c3 = new ComplexNumber();
//        Constructor.ComplexNumber temp = sum(c1, c2);
//        System.out.printf("Kết quả là: " + temp.real + " + " + temp.img + "i");//hiển thị kết qua ra màn hình
//    }
    }
}
