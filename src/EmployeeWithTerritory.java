public class EmployeeWithTerritory extends Employee
{
   private int territory;
   public int getTerritory()
   {
      return territory;
   }
   public void setTerritory(int terr)
   {
      territory = terr;
   }
   @Override
   public double getSalary(){
      System.out.println("Here's the child class of getSalary. it overrode the parent.");
      return super.getSalary();
   }
}

