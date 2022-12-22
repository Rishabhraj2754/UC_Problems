public class UCProblems {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        int DailyWAGE_PER_HR = 20;
        int Emp_Hr  = 8;
        int DailyWages = 0;
        int IS_FULL_TIME = 1;
        double num = Math.floor((Math.random()*10)) % 2;
        if (IS_FULL_TIME == 1){
            System.out.println("Employee is Present");
            DailyWages = Emp_Hr * DailyWAGE_PER_HR;
        }
        else{
            System.out.println("Employee is Absent");
        }
        System.out.println("The daliy wages of employee is"+" "+DailyWages);
    }
}
