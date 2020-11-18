import java.util.Random;

class Test
{
  int fullday=20;
  int halfday=8;

        public int Random()
        {
          int a;
          Random r=new Random();
          a=r.nextInt(3);
          return a;
        }
}

class Employee
{
        public static void main(String[] args)
        {
           int status=0;
          Test t=new Test();
         int x=t.Random();
                switch(x)
                {
                 case 1:System.out.println("fullday"); status=20;
                        break;
                 case 2:System.out.println("halfday"); status=8;
                        break;
                 case 0: status=0;
                        break;
                }
         if(status!=0)
        {
                int wage=status*8;
                System.out.println(wage);
        }
        else
        {
                System.out.println("employee is absent");
	 }
      }
}

