import java.util.*;
public class A1093325_0224_2 {
    public static void main(String[] args){
        float cel,fah;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input temperature in degree celsius.");
        cel = scanner.nextInt();
        fah = cel*9/5+32;
        System.out.println(cel+" celsius = "+fah+" fahrenheit.");
    }
}
