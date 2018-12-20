import java.util.*;
class prog6{
    static void charCheck(char input){
        if(input>=65 && input<=90)
            System.out.println("Capital Letter");
        else if(input>=97 && input<=122)
            System.out.println("Small Letter");
        else if(input>=48 && input<=57)
            System.out.println("Digit");
        else
            System.out.println("Special character");
    }
    public static void main(String [] args){
        char c;
        Scanner s=new Scanner(System.in);
        c=s.next().charAt(0);
        charCheck(c);
    }
}