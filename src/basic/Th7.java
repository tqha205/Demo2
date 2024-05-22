package basic;

public class Th7 {

//    double img, real;

    public static void main(String[] args) {
//
//        caculate(2000, 5, .08, 12);
//        laixuat(2000,6,5);
//        String sentence = " x  in c h a  o";
//        System.out.println("\nchuoi ban dau :" + sentence);
//        sentence = sentence.replaceAll("\\s", "");
//
//        System.out.println("chuoi sau khi xoa khoang trang :" + sentence);


    }
//
//    public static void tinhNamNhuan(int year) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao nam :");
//        int year1 = sc.nextInt();
//        boolean isleep = false;
//        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
//            isleep = true;
//            System.out.println("la nam nhuan :" + year);
//        }
//        if (year % 4 == 0 && year % 100 != 0) {
////            isleep = true;
////            System.out.println("la nam nhuan :" + year);
////        }else {
//            System.out.println("khong phai nam nhuan :"+year);
//        }
//
//    }


    //    public static void main(String[] args) {
//        int year;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhập vào năm bạn cần kiểm tra:");
//        year = scan.nextInt();
//        scan.close();
//        boolean isLeap = false;
//        if(year % 4 == 0)//chia hết cho 4 là năm nhuận
//        {
//            if( year % 100 == 0)
//            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
//            {
//                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
//                    isLeap = true;
//                else
//                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
//            }
//            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
//                isLeap = true;
//        } else {
//            isLeap = false;
//        }
//
//        if(isLeap==true)
//            System.out.println(year + " là năm nhuận.");
//        else
//            System.out.println(year + " không phải là năm nhuận.");
//    }
//    public static void caculate(double p, double t, double r, int n) {
//        double amount = p * Math.pow(1 + (r / n), n * t);
//        double cinterest = amount - p;
//        System.out.println("Lãi kép sau " + t + " năm là : " + cinterest);
//        System.out.println("Số tiền có được sau " + t + " năm là: " + amount);
//    }

    //    public static void laixuat(float p, float r, float t) {
//        float tinhlai = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao so tien can gui :");
//        p = sc.nextFloat();
//        System.out.println("lai xuat hang nam:");
//        r = sc.nextFloat();
//        System.out.println("nhap thoi can gui:");
//        t = sc.nextFloat();
//        tinhlai = (p * r * t) / 100;
//        System.out.println("so tien lai :" + tinhlai);
//    }


    public static class th5 {

        //    Nhập vào 3 cạnh của tam giác, kiểm tra xem đó có phải là tam giác hay không?
    //    Nếu là tam giác thì nó thuộc loại tam giác gì (Vuông, cân, đều, vuông cân)
        public static void main(String[] args) {
            kiemTraTamGiac(2, 2, 6);
        }

        public static void kiemTraTamGiac(int a, int b, int c) {
    //        kiem tra tam giac
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("day la tam giac.");
            } else {
                System.out.println("day khong phai la tam giac:");
            }
    //        phan loai tam giac
            if (a == b && b == c) {
                System.out.println("tam giac nay la tam giac deu.");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("tam giac nay la tam giac vuong.");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                System.out.println("tam giac nay la tam giac can.");
            } else {
                System.out.println("tam giac nay la tam giac thuong.");
            }
        }

    }
}


