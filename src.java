/* My awesome solution */

import java.util.*;
import java.lang.*;
import java.io.*;

/* We are defining the class and then adding and assigning and initiating int variables N and M, then we will want to find max sum where our interval endpoints " k" values in the array separately */
class Solution
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
	
	
	
	Expl:
/*For a value k, we can mark its left endpoint a in the original array, along with its right endpoint b in the original array. To distinguish between a and b we can store +k for a and -k for b. Now, we technically have stored all information that the m operations represent, into an array. Most importantly, we stored it in O(m) time./*

The next step is to actually find the maximum value based off of our unique representation of the data. We traverse our array from left to right. Whenever we reach a left endpoint a (which we represented with a positive number), we just add that to our sum. Whenever we reach a right endpoint b (which we represented with a negative number), we subtract that from our sum (well, technically we add a negative value). By doing so, the value sum represents the value that array[i] would have if we had applied all m operations to it. The maximum value of sum that we get while traversing the array is the value we return. .
