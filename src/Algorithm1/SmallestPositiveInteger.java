package Algorithm1;

public class SmallestPositiveInteger {
	static int firstMissPositive(int a[])
	{
	    int n = a.length;

	    for(int i = 0; i < n; i++) 
	    {
	      
	      while (a[i] >= 1 && a[i] <= n && a[i] != a[a[i] - 1]) {
	        
	        int temp=a[a[i]-1];
	            a[a[i]-1]=a[i];
	            a[i]=temp;
	      }
	    }

	    for(int i = 0; i < n; i++)
	        if (a[i] != i + 1)
	            return (i + 1);

	    return (n + 1);
	
}
	public static void main(String[] args)
	{
	    int a[] = {4, 3, -7, 6, 5, 2, -16, 17 };
	    int ans = firstMissPositive(a);
	    
	    System.out.println(ans);
	}
	}
