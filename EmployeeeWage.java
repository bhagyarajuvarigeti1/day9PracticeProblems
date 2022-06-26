public class EmployeeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        int status = (int)(Math.random()*2);
        if(status == 0){
            System.out.println("employee is Absent");
        }
        else if(status == 1){
            System.out.println("employee is present");
        }
    }
}
