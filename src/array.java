import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        int a[] = nhapMang();
        xuatMang(a);


    }
    public static int[]  nhapMang() {
        System.out.println("nhập vào số phần tử của mảng");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
//        khởi tạo mảng có n phần tử
        int array[]=new int[n];
        System.out.println("nhập phần tử cho mảng");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        return array;

    }
    public  static  void xuatMang(int[] array){
        System.out.println("Mảng bạn vừa nhập là:");
        System.out.print("array[");

        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println(array[array.length-1]+"]");
    }
}
