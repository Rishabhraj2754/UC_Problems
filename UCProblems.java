public class UCProblems {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        int WAGE_PER_HR = 20;
        int FULL_DAY= 8;
        int PAY = 0;
        int PART_TIME = 4;
        int num =(int) Math.floor((Math.random()*10)) % 3;
        System.out.println(num);

        switch (num) {
            case 1: {
                System.out.println("Employee is Present");
                PAY = WAGE_PER_HR * FULL_DAY;
            }
            break;
            case 2: {
                System.out.println("Employee is on Part Time");
                PAY = WAGE_PER_HR * PART_TIME;
            }
            break;
            case 0: {
                System.out.println("Employee is Absent");
            }
            break;
        }
        System.out.println("The total Wage of Employee is"+" "+PAY);



    }
}
