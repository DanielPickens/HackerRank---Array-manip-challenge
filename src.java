/* My awesome solution */

import java.util.*;
import java.lang.*;
import java.io.*;

/* We are defining the class and then adding and assigning and initiating int variables N and M, then we will want to find max sum where our interval endpoints " k" values in the array separately */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        /* Save interval endpoint's "k" values in array */
        long [] array = new long[N + 1];
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            array[a-1] += k;
            array[b]   -= k;
        }
        scan.close();
        
        /* Find max value */
        long sum_of_manip = 0;
        long max_of_manip = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            max = Math.max(max_of_manip, sum);
        }
        
        System.out.println(max_of_manip);
    }
}
	}
}



time complexity  O(n+m)
