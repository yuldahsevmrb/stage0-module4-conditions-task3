package school.mjc.stage0.conditions.task3;

public class SalaryCalculator { //Basic Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"
    public void calculateSalary(int salary) {
        if(salary <= 0){
            System.out.println("wrong input!");
        } else if(salary <=10000){
            System.out.println((double)salary - (salary * 15/100));
        } else if(salary <=20000){
            System.out.println((double)salary - (salary * 18/100));
        } else if (salary > 20000){
            System.out.println((double)salary - (salary * 20/100));
        }
    }
}
