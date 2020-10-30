public class Lesson1 {

    //1


    //2
    byte    a = 1;
    short   b = 2;
    int     c = 3;
    long    d = 4;
    float   e = 4.5f;
    double  f = 5.5;
    char    g =  0;
    boolean i = true;

    //3
   public static int method (int a, int b, int c,int d)
   {
       return a * (b + (c / d));
   }

    //4
   public static boolean method1(int a, int b)
   {
       return  a >= 10 && a <= 20 && b >= 10 && b <= 20;
   }

    //5
    public static void method2(int a)
    {
        if (a >= 0) System.out.println(a+ " положительное число");
        if (a < 0) System.out.println(a+ " отрицательное число");
    }

    //6
    public static boolean method3(int a)
    {
        if(a < 0) return true;
        return false;
    }

    //7
    public static void method4(String name)
    {
        System.out.println("Привет, "+name+"!");
    }

    //8
    public static void method5(int year)
    {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println(year+ " високосный год!");
        } else {
            System.out.println(year+" не високосный год! ");
        }
    }


}
