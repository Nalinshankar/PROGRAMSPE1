import java.util.*;
class prog1{
    static void pelindrome_checker(int num){
        int orinum,revnum,rem;
        orinum=num;
        revnum=0;
        while(num>0){
            rem=num%10;
            revnum=revnum*10+rem;
            num=num/10;
        }
        if (orinum==revnum)
            System.out.println("given number is pelindrome");
        else
            System.out.println("given number is not pelindrome");
    }
    public static void main(String args []){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        num=sc.nextInt();
        pelindrome_checker(num);
    }
}