public class Employee {
    double baseSalary;
    double bonusHrs;
    double sales;
    String name;
    void CalculateNetSalary(){
        System.out.println(baseSalary + bonusHrs - sales);
    }
}


