public class EmployeeTester {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setId(12345);
        emp1.setSalary(71600);
        System.out.println("Employee 1:\nID number: "+emp1.getId()+"\nSalary: $"+emp1.getSalary());

        //emp with terr in VA
        System.out.println();
        EmployeeWithTerritory emp2 = new EmployeeWithTerritory();
        emp2.setId(45678);
        emp2.setSalary(60500);
        emp2.setTerritory(540);

        System.out.println("Employee 2:\nID number: "+emp2.getId()+"\nSalary: $"+emp2.getSalary()+"\nTerritory: ("+emp2.getTerritory()+")");


    }//end main method
}//end driver
