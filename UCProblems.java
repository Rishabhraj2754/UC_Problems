public class UCProblems {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee");
        final int WAGE_PER_HR = 20;
        final int FUL_DAY  = 8;
        int pay = 0;
        double num = Math.floor((Math.random()*10)) % 2;
        if (num==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
