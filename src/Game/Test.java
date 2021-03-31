package Game;

public class Test {
    public static void main(String[] args) {
        Schoolboy schoolboy = new Schoolboy("Bob", 12);
        Schoolboy schoolboy1 = new Schoolboy("Joe", 14);
        Schoolboy schoolboy3 = new Schoolboy("Rimax", 11);
        Schoolboy schoolboy4 = new Schoolboy("Tampax", 13);

        Student student = new Student("Lis", 19);
        Student student1 = new Student("Roxana", 21);

        Employee employee = new Employee("Serh", 43);
        Employee employee1 = new Employee("Lori", 55);

        Team<Schoolboy> schoolTeam2 = new Team<>("Dragons");
        schoolTeam2.addNewParticipants(schoolboy3, schoolboy4);

        Team<Schoolboy> schoolTeam = new Team<>("Dragons");

        schoolTeam.addNewParticipants(schoolboy, schoolboy1);

        Team<Student> studentsTeam = new Team<>( "Wolfs");
        studentsTeam.addNewParticipants(student,student1);

        Team<Employee> employeesTeam = new Team<>("Engine");
        employeesTeam.addNewParticipants(employee,employee1);

        schoolTeam.playWith(schoolTeam2);
//        schoolTeam2.playWith(employeesTeam);

    }
}
