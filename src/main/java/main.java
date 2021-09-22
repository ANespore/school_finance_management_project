public class main {
    public static void main(String[] args) {

        //show how to call methods from classes

        School nyu = new School();

        Student karina = new Student (101,"Karina",8);
        Student maija = new Student (103,"Maija",7);

        System.out.println(karina.getGrade());
        karina.payFees(500);
        maija.payFees(700);
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

    }



}
