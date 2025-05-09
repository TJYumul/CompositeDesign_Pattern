public class Client {
    public static void main(String[] args) {

        Teacher csTeacher = new Teacher("Prof. Jerry", "Software Engineering", 60000);
        Teacher itTeacher = new Teacher("Prof. Laureta", "Intermediate Programming", 55000);

        Student csStudent1 = new Student("Bulatao", "22-12345-678", 35000);
        Student csStudent2 = new Student("TJ", "22-11761-964", 35000);
        Student csStudent3 = new Student("Arvyx", "22-98765-123", 35000);

        Student itStudent1 = new Student("Daniel", "22-34567-897", 33000);
        Student itStudent2 = new Student("Robee", "22-54321-876", 33000);

        Department csDept = new Department("Department of Computer Science");
        csDept.add(csTeacher);
        csDept.add(csStudent1);
        csDept.add(csStudent2);
        csDept.add(csStudent3);

        Department itDept = new Department("Department of Information Technology");
        itDept.add(itTeacher);
        itDept.add(itStudent1);
        itDept.add(itStudent2);

        College cics = new College("College of Informatics and Computing Studies");
        cics.add(csDept);
        cics.add(itDept);

        cics.displayDetails();
        System.out.println("\nTotal number of students: " + cics.getNumberOfStudents());
        System.out.println("Total budget: ₱" + cics.getBudget());
    }
}
