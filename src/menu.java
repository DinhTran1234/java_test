import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choice =-1;
        Scanner input=new Scanner(System.in);
        while (choice !=0){
            System.out.println("-------------------------");
            System.out.println("Menu");
            System.out.println("1. Love");
            System.out.println("2. Anh");
            System.out.println("3. Dũng");
            System.out.println("4. Hương");
            choice =input.nextInt();
            System.out.println("kết quả");
            switch (choice){
                case 1:
                    System.out.println("nhập");
                    break;
                case 2:
                    System.out.println("lại");
                    break;
                case 3:
                    System.out.println("đi");
                    break;
                case 4:
                    System.out.println("bạn");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không có lứa chọn");
            }
        }
    }
}
