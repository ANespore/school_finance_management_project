import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //show how to call methods from classes

        //7.pay fees for a student with student id ,8.get balance
        /*



        System.out.println(karina.getGrade());

        System.out.println(karina.getFeesPaid());

        nyu.addStudents(karina);
        nyu.addStudents(maija);
        for (Student students : nyu.getStudens() ){
            System.out.println("Student name: " + students.getName());
        }


        System.out.println( "Total money earned by NYU is:  " + nyu.getTotalMoneyEarned());
        Teacher Anda = new Teacher(45,"Anda",200);
        Teacher Indra = new Teacher(44,"Indra",400);
        Anda.receiveSalary();
        Indra.receiveSalary();
        System.out.println("Total salary received by Anda "   +    Anda.getSalaryEarned());
        System.out.println("Money spent by school  " +nyu.getTotalMoneySpent());
        System.out.println("school balance  is " +(nyu.getTotalMoneyEarned()-nyu.getTotalMoneySpent()));
        System.out.println("school balance  is " + nyu.getBalance());

        //create method in school class that returns balance of the school "getBalance "
        */
        School nyu = new School();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println("Welcome to the school finance management system, please choose an activity: ");
            System.out.println("1. View all students");
            System.out.println("2. View all teachers");
            System.out.println("3. Add student");
            System.out.println("4. Add teacher ");
            System.out.println("5. Pay all salaries to teachers ");
            System.out.println("6. Get total money earned by school ");
            System.out.println("7. Pay fees for a student ");
            System.out.println("8. Get school balance ");
            System.out.println("\n Enter Quit to end program ... ");
            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput){
                case "Quit":
                    System.out.println("Exiting application....");
                    break;
                case "1":
                    for (Student students : nyu.getStudens() ) {
                        System.out.println("   Student id :  " + students.getId() + "  Student name: " +
                                students.getName() + "   Students grade:  " + students.getGrade());
                    }
                    break;
                case "2":
                    for (Teacher teachers : nyu.getTeachers() ) {
                        System.out.println("Teacher id :  " + teachers.getId() + "  Teacher name: " + teachers.getName());
                    }
                    break;
                case "3":
                    int student_id =0;
                    int student_grade =0;
                    System.out.println("Add student id:  ");
                    try {
                        student_id=Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e) {
                        System.out.println("Inserted value is not a number, please try again");
                        break;
                    }
                    System.out.println("Add student name:  ");
                    String student_name = scanner.nextLine();
                    System.out.println("Add student grade:  ");
                    try {
                        student_grade=Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e) {

                        System.out.println("Inserted value is not a number, please try again");
                        break;
                    }
                    Student student = new Student(student_id,student_name,student_grade);
                    nyu.addStudents(student);
                    break;
                case "4":
                    int teacher_id =0;
                    int teacher_salary =0;
                    System.out.println("Add teacher id:  ");
                    try {
                        teacher_id=Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e) {
                        System.out.println("Inserted value is not a number, please try again");
                        break;
                    }
                    System.out.println("Add teacher name:  ");
                    String teacher_name = scanner.nextLine();
                    System.out.println("Add teachers salary:  ");
                    try {
                        teacher_salary=Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e) {

                        System.out.println("Inserted value is not a number, please try again");
                        break;
                    }

                    Teacher teacher = new Teacher(teacher_id,teacher_name,teacher_salary);
                    nyu.addTeacher(teacher);
                    break;
                case "5":
                    for (Teacher teacher1 : nyu.getTeachers() ) {
                        teacher1.receiveSalary();
                    }
                    break;
                case "6":
                    System.out.println(nyu.getTotalMoneyEarned());
                    break;
                case "7":
                    System.out.println("All current students:  ");
                    for (Student students : nyu.getStudens() ) {
                        System.out.println("   Student id :  " + students.getId() + "  Student name: " +
                                students.getName() + "   Students grade:  " + students.getGrade());
                    }
                    System.out.println("Choose student id:  ");
                    int stud_id = scanner.nextInt();
                    System.out.println("Enter fees:   ");
                    int fees = scanner.nextInt();
                    for (Student students : nyu.getStudens() ) {
                        if(students.getId() ==stud_id) {
                            Student student1 = new Student(students.getId() , students.getName() ,students.getGrade());
                            student1.payFees(fees);
                        }
                    }
                    break;
                case "8":
                    System.out.println(nyu.getBalance());
                    break;


                default:
                    break;

            }


        }
        while (!userInput.equalsIgnoreCase("Quit"));
        return;

    }



}
