public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;


    Student (int id,String name,int grade)
    {
        this.id = id;
        this.name = name;
        this.grade=grade;
        feesPaid = 0;
        totalFees = 30000;

    }

    public void setGrade(int grade)
    {
        this.grade = grade;

    }

    public void payFees(int feesPaid){

        this.feesPaid += feesPaid;
        School.updateTotalMoneyEarned(feesPaid);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }


    public int getTotalFees() {
        return totalFees;
    }

}
