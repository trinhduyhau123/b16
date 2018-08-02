import java.util.Scanner;

public class SoNT {
    public static void main(String[] args) {
        int a;
        System.out.println("Nhap so: ");
        Scanner scanner = new Scanner(System.in);
        a  = scanner.nextInt();
        boolean check = true;
        if(a<2){
            check = false;
        }
        if(a==2){
            check = true;
        }
        if(a>2){
            if(a%2==0){
                check = false;
            }
            else{
                for(int i=3;i<=Math.sqrt((double)a);i+=2){
                    if(a%i==0){
                        check = false;
                    }else{
                        check = true;
                    }
                }
            }
        }
        if(check){
            System.out.println(a +" la so nguyen to");
        }
        else{
            System.out.println(a + "ko phai so nguyen to");
        }
    }
}
