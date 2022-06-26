public class EmployeeeWage {
    public static int Part_time = 8,Wage_per_Hour = 20,Full_day_Hour = 8,Total_wage=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        int status = (int)(Math.random()*3);
        switch (status ) {
            case 0: {
                System.out.println("employee is Absent");
                break;
            }
            case 1: {
                System.out.println("employee is present");
                Total_wage = Full_day_Hour * Wage_per_Hour;
                break;
            }
            default: {
                System.out.println("Part time");
                Total_wage = Wage_per_Hour * Part_time;
                break;
            }
        }
        System.out.println(Total_wage);
    }
}
