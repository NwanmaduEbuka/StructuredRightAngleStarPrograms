public class Nwanm{

    /**
     * Nwanmadu Chukwuebuka, E.
       PhD Student at University of Nigeria, Nsukka.
	   Computer Sc Teacher at Lady Ibiam Girls' Secondary School, Enugu.
       Tail Recursion 
       UpperRight, Right Angle Triangle
       With Java Program
       14th October, 2021
	   Copyright subject to the host platform
       			 		
     */
public static void main(String[] args) {
        // TODO code application logic here
        outer(5);
    }
static int temp;

static void space()
	{
		System.out.print(' ');
	}

static void star()
    {
        System.out.print('*');
    }

static void inner1(int j1)
    {
	if(temp== 5)
	{}
	else

	if (j1== 1)
    {
        space();
    }
	else
    {
	space();inner1(j1-1);
    }
    
    }

static void inner2(int j2)
    {
	if (j2== 1)
    {
        star();
    }
	else
    {
	star();inner2(j2-1);
    }
    
    }

static void outer( int i)
    {
        temp = i;
        if( i == 1)
        {
            inner1(5-temp);
	    inner2(temp);
            System.out.println();
        }
 else
        {
            inner1(5-temp);
	    inner2(temp);
	    System.out.println();
            outer (i-1);
        }

    }
}
