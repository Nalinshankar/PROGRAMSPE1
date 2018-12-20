import java.util.*;
class prog2{
    static int isPowerOfFour(int n)
    {
        int count = 0;
        int x = n & (n - 1);
        if ( n > 0 && x == 0)
        {
            while(n > 1)
            {
                n >>= 1;
                count += 1;
            }
            return (count % 2 == 0) ? 1 : 0;
        }
        return 0;
    }
    public static void main(String args []){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number : ");
        n=sc.nextInt();
        int res=isPowerOfFour(n);
        if(res==1)
            System.out.println(n + " is a power of 4");
        else
            System.out.println(n + " is not a power of 4");
    }
}