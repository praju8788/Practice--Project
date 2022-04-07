package practicalcoding;
/* Code by 
Prajakta Hajare
*/

public class Longest_increasing_sub {
	static int max_ref;                // stores the LIS
	 
	  
    static int _lis(int arr[], int n)
    {
        
        if (n == 1)
            return 1;
 
        int res, max_ending_here = 1;
 
       
        for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1]
                && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }
 
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
 
        return max_ending_here;
    }
 
    static int lis(int arr[], int n)
    {
        max_ref = 1;
 
        _lis(arr, n);
 
        return max_ref;
    }
 
    
    public static void main(String args[])
    {
        int arr[] = {10, 9, 2, 5, 3, 7, 101, 18 };
        int n = arr.length;
        System.out.println("By\n");
        System.out.println("Prajakta Hajare\n\nOutput is:\n");
        System.out.println("Length of lis is " + lis(arr, n)
                           + "\n");
    }
}



