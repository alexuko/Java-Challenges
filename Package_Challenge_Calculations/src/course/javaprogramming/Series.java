package course.javaprogramming;

public class Series {

    public static long nSum( int n ){
        return (n * (n+1) / 2 );
    }
    public static long factorial( int n ){
        if(n == 0) return 1;

        long result = 1;

        for (int factor = 1; factor <= n; factor++) {
            result *= factor;
        }

        return result;
    }
    public static long fibonacci( int n ){
        long fib = 0;
        long t1 = 0;
        long t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            fib = t1 + t2;
            t1 = t2;
            t2 = fib;
        }
        return fib;
    }


}
