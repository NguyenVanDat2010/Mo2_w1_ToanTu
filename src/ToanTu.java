import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width=scan.nextFloat();
        System.out.println("Nhập chiều cao: ");
        height=scan.nextFloat();
        float area=width*height;
        System.out.println("Diện tích hcn là: "+area);
    }
}
