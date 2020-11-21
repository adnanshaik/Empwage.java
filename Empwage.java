import java.util.Random;

class Test
{

        static int absent;

        int checkDays=1;
        int checkHours=0;
        String cname;
        int days=1;
        int a=1;
        int hours;
        int wage, cmpWage;
    public void calWage(String cname,int days,int hours,int cmpWage)    //Refactoed the code
    {
        this.cname=cname;
        this.days=days;
        this.hours=hours;
        this.cmpWage=cmpWage;

        while(checkDays!=days && checkHours!=hours)                     //Runs until days not equalto 20 && hrs not equal to 200
        {
          checkHours=8*a;
           a++;
           checkDays++;
           int x=Random();
           int y=Attendance(x);
          if(y!=0)
          {
                 wage+=y*cmpWage;
          }
          else
          {
                  absent++;
          }
        }
         System.out.println("Company="+cname+" "+"days="+days+" "+"hours="+hours+" "+"wage="+wage+" "+"absent="+absent);
    }
        public int Attendance(int c)                            //Returns the status of an employee.

  {
           int status=0;
                 switch(c)
                {
                 case 1: status=20;
                        break;
                 case 2: status=8;
                        break;
                 case 0:status=0;
                        break;
                }
                return status;

        }

        public int Random()                                     //returns the random number
        {
          int a;
          Random r=new Random();
          a=r.nextInt(3);
          return a;
  }
}

class Empwage
{

         public static void main(String[] args)
        {

          Test t=new Test();
           t.calWage("apple",20,200,20);
           t.calWage("fb",23,170,27);
         t.calWage("lg",25,17,25);
        }

}





















