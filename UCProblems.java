public class UCProblems {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        int WAGE_PER_HR = 20;
        int FULL_DAY= 8;
        int PAY = 0;
        int PART_TIME = 4;
        double num = Math.floor((Math.random()*10)) % 3;
        if (num == 1){
            System.out.println("Employee is Present");
            PAY = WAGE_PER_HR * FULL_DAY;
        }
        else if (num ==2){
            System.out.println("Employee is PartTime");
            PAY = WAGE_PER_HR * PART_TIME;
        }
        else if (num == 0){
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee paid per day is"+" "+PAY);
    }
}
