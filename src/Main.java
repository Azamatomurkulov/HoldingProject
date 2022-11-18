public class Main {


    public static void main(String[] args){
        Employee employee = new Employee("Bob",1500d,"Supervisor");
        Employee employee1 = new Employee("Ivan",1200d,"Cashier");
        Employee employee2 = new Employee("Vlad",1200d,"Sales");
        Employee employee3 = new Employee("Wane",1890d,"CEO");

        Company company = new Company("Nice",2890,"Kate");
        Company company1 = new Company("Vice",1290,"Julian");
        Company company2 = new Company("Water",2890d,"Joe");
        Company company3 = new Company();

        company1.addEmployee(employee);
        company1.addEmployee(employee2);
        company1.addEmployee(employee3);
        // Обьекты созданы для примера, все компании можно создавать на прямую в консоли.
        Holding holding = new Holding();

        holding.addCompany(company);
        holding.addCompany(company2);
        holding.addCompany(company1);
        // Обьекты созданы для примера, все компании можно создавать на пряму в консоли.
        MainMenu.start(holding);

    }
}
