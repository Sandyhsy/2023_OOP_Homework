import java.util.*;
public class A1093325_0224_1 {
    public static void main(String[] args){
        int num;
        String numType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number.");
        num = scanner.nextInt();
        if(num == 0){
            numType = "natural"; 
        }else if(num == 1){
            numType = "odd";         
        }else if(num%2 == 0){
            numType = "even";         
        }else{
            numType = "odd";         
        }
        System.out.println(num+" is a "+numType+" number");
    }
}
