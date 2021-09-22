import java.util.ArrayList;

public class School {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> studens;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    School()
    {   teachers = new ArrayList<>();
        studens = new ArrayList<>();
        totalMoneySpent =0;
        totalMoneyEarned =0;

    }

    public ArrayList<Teacher> getTeachers()
    {
        return teachers;
    }

    public ArrayList<Student> getStudens() {
        return studens;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void  addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudents(Student student)
    {
        this.studens.add(student);
    }


    //static indicates that the member belongs to the type itself and not an instance of that type
    //Only one instance of the static member is created, which is shared among all instances of the class 
    public static void updateTotalMoneyEarned(int moneyEarned)
    {
        totalMoneyEarned +=  moneyEarned;


    }

    public static void updateTotalMoneySpent(int MoneySpent){
        totalMoneySpent += MoneySpent;

    }

    public int getBalance()
    {
        int school_Balance;
        school_Balance = School.totalMoneyEarned - School.totalMoneySpent;
        return school_Balance;
    }


}
