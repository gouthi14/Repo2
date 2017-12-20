public class CommandLine
{

    public static void main(String[] args)
    {
        if(args.length==0)
        {
        System.out.println("No arguments are passed");
        }
        else
        {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
                int sum=a+b;
            System.out.println("using Addtion operator of: "+a+"and "+b+"the sum is: "+sum);

            int Mul=a*b;

           System.out.println("Using Multiplcation Operator: "+a+ "  and  " +b+"  multiplay is : "+Mul);

            double div=a/b;
             
              System.out.println("Using Divide Operator:  "+a+  "  and  "+b+ "Division is:   "+div);


          int Min=a-b;

    System.out.println("Using Subtration Operator:  "+a+ "  and  "+b+"  the Subtration is :   "+Min);

        
}
}
}