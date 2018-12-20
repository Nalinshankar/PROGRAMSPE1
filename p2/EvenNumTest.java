import java.util.*;
class EvenNumTest{
    public static boolean isEven(int number){
            boolean value=true;
            if(number%2==0)
                 value=true;
            else
                 value=false;
            return value;
    }
    public static void main(String [] args){
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(isEven(number))
            System.out.println("true");
    }
}