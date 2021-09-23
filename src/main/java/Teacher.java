public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    //to create a new teacher object on initialization with the provided values
    Teacher(int id,String name,int salary)
    {
        this.id=id;
        this.name =name;
        this.salary=salary;
        this.salaryEarned =0;
        

    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
   public String getName()
   {
       return name;
   }

   public int getSalary()
   {
       return salary;
   }

    public int getId() {
        return id;
    }

    public void receiveSalary(){
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);
   }

    public int getSalaryEarned() {
        return salaryEarned;
    }
}
