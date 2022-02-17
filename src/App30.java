import java.util.Scanner;
public class App30{
    public static void 
    main(String[]args){
        Scanner sc = new
        Scanner(System.in);
        int n,tong=0;
        System.out.print("Nhap so nguyen duong n: ");
        n = sc.nextlnt();
        while (n>0){
            tong+=n%10;
            n=n/10;
        }
        System.out.print("tong cac so cua n: "+tong);
        sc.close();
    }
}