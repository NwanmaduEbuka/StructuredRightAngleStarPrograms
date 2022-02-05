class LowerRightAngle1 { 
    public static void main(String[] args) {
        outer(1);
    }
    public static int temp;

    static void space ()
    {
        System.out.print(' ');
    }

    static void star()
    {
        System.out.print('*');
    }

    static void inner1(int j)
    {
        if ( temp==5)
        {

        }
 else
     if(j==4)
     {
         space();
     }
 else
     {
            space();
            inner1(j+1);
 }
    }
    static void inner2(int j)
    {
        if(j==temp)
        {
            star();
        }
 else
        {
            star();
            inner2(j+1);
 }
    }
    static void outer (int i)
    {
        temp = i;
        if (i == 5)
        {
            inner1(i);
            inner2(1);
            System.out.println();
        }
 else
        {
            inner1(i);
            inner2(1);
            System.out.println();
            outer(i+1);
     }
    }    
}
