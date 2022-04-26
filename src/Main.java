import java.util.Random;
public class Main {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_Part_TIME = 1;
    public static final int Total_working_hour = 100;
    public static   int Dailyhours_sum =0;


    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation System");

        int Full_day_hour = 10;
        int Half_day_hour = 5;
        int Per_hour_wage = 20;


        int Emp_check = (int) (Math.floor(Math.random() * 10) % 3);
        int dailemployeeywage = 0;
        int dayscount = 0;
        int totalwagepermonth=0;
        while (dayscount< WORKING_DAYS_PER_MONTH && Dailyhours_sum < 100 ){
            Emp_check = (int) (Math.floor(Math.random() * 10) % 3);
            switch (Emp_check) {

                case IS_FULL_TIME:
                    System.out.println("full time");
                    dailemployeeywage=Full_day_hour*Per_hour_wage;
                    Dailyhours_sum += Full_day_hour;
                    if(Dailyhours_sum>=100)
                        break;
                        System.out.println("Daily wage " + dailemployeeywage);


                    break;
                case IS_Part_TIME:
                    System.out.println("part time");
                    dailemployeeywage=Half_day_hour*Per_hour_wage;
                    System.out.println("Daily wage "+dailemployeeywage);
                    Dailyhours_sum += Half_day_hour ;
                    break;
                default:
                    System.out.println("absent");
                    Dailyhours_sum += 0 ;

        }
            System.out.println("Employee wage " +dayscount+ "  is"   +dailemployeeywage+ "");
           totalwagepermonth +=dailemployeeywage;
             dayscount++;


        }
        System.out.println("Total monthly wage is " +totalwagepermonth);
        System.out.println("Total hours in month" + Dailyhours_sum);
    }}
        // if(Emp_check==2){
        //    System.out.println("Employee is Wage is Full Time");
        //    System.out.println("Working hour is "+Full_day_hour);
        // }else if (Emp_check==1){
        //     System.out.println("Employee is Wage is Part Time");
        //    System.out.println("Working hour is 4");
        // }else{
        //     System.out.println("Employee is Absent");




