import java.io.*;
import java.util.*;
class factorial
    {
        public static  void main()
        {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int fact = 1;
            for(int i = 1; i<=N ;i++)
            {
                fact = fact * i ;
            
        }
        System.out.println("Factorial =" + fact);
    }
}