import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo ; i++)

        {
            if(iNo == 0)
            {
                return ;
            }
        }
    }
}    // End of Number class

class program79
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
      
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckPerfect(iValue);
        
        if(bRet == true )
        {
            System.out.println(iValue + " is Perfect number");
        }
        else 
        {
            System.out.println(iValue + " is not a perfect number");
        }

        //IMPORTANT
        sobj = null;
        nobj = null;

        System.gc();
        
    }
}