public class LowerRightAngle {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        outer(1);
    }
static int temp;

static void star()
    {
        System.out.print('*');
    }
static void inner(int j)
    {
    if(j== temp)
    { star();
}
 else
    {
        star();
        inner(j+1);
 }
    }
static void outer( int i)
    {
        temp = i;
        if( i == 5)
        {
            inner(1);
            System.out.println();
        }
 else
        {
            inner(1);
	    System.out.println();
            outer (i+1);
        }

    }
}
