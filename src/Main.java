//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee("Bharath",107,200);
        int check = (int)((Math.random()*10))%2;

        if(check == 0){
            e1.attendance = false;
        }
        else {
            e1.attendance = true;
        }

        if(e1.attendance){
            System.out.println("Employee is present");
            e1.workHour = 8;
        }else {
            System.out.println("Employee is absent");
        }
        //it is a Not static method
        Main m1 = new Main();
        System.out.println(m1.calculateSalary(e1));
    }
    double calculateSalary(Employee e){
        return e.workHour*e.wagePerHour;
    }
}