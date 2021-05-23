import java.util.Scanner;
public class GeeksToolbox{
    public static void main(String [] args){
    Scanner myObj = new Scanner(System.in);
    int menu, num;
    System.out.println("Welcome to Geek's Toolbox");
    System.out.println("Menu");
    System.out.println("1. Decimal to Binary");
    System.out.println("2. Decimal to Octal");
    System.out.print("Enter your option: ");
    menu = myObj.nextInt();
    switch(menu){
        case 1:
            System.out.print("Enter the number: ");
            num = myObj.nextInt();
            System.out.print(num + " = ");
            d2b(num);
            break;
        case 2:
            System.out.print("Enter the number: ");
            num = myObj.nextInt();
            System.out.print(num + " = ");
            d2o(num);
    }

    }
    public static void d2b(int dec){
        int[] bin = {0, 0, 0, 0, 0, 0, 0, 0};
        while(dec > 1){
            for(int i = 7; i >= 0; i--){
                bin[i] = dec%2;
                dec/=2;
            }
            for(int i = 0; i < 8; i++){
                System.out.print(bin[i]);
            }
            System.out.print("\n");
        }
        
    }
    public static void d2o(int dec){
        int [] oct = {0, 0, 0, 0, 0, 0, 0, 0};
        while(dec > 1){
            for(int i = 7; i >= 0; i-- ){
                oct[i] = dec%8;
                dec/=8;
            }
            for(int i = 0; i < 8; i++){
                System.out.print(oct[i]);
            }
            System.out.print("\n");
        }
    }
}
