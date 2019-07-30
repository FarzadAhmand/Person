import java.util.*;

public class Main
{
	public static void main(String[] args)
	{   for(int i=1;i<50;i++)
		System.out.println(fibo(i));
		System.out.println(returnFibo(5));
	}

	public static long fibo(int n) {
		long f1=0,f2=1,f3=1;
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else {
			for (int i=2;i < n;i++) {
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			return f3;
		}
	}

	public static long returnFibo(int n) {
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else
			return returnFibo(n - 1) + returnFibo(n - 2);
	}
}
