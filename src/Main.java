//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee("Bharath",107,200);
        int check = (int)((Math.random()*10))%3;

        if (check == 0){
            e1.attendance = 0;
        }else if (check == 1) {
            e1.attendance = 1;
        }else {
            e1.attendance = 2;
        }

        if(e1.attendance==1){
            System.out.println("Employee is present");
            e1.workHour = 8;
        }else if(e1.attendance == 0) {
            System.out.println("Employee is absent");
        }else {
            System.out.println("Employee is part time");
            e1.workHour = 4;
        }

        //it is a Not static method
        Main m1 = new Main();
        System.out.println(m1.calculateSalary(e1));


    }
    double calculateSalary(Employee e){
        return e.workHour*e.wagePerHour;
    }
}