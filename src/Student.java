public class Student {
    private String firstName;
    private String lastName;
    private int age;


    public Student() {
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(" James", " Nike",56);
        System.out.println(student);
        Student student1 = new Student("Joy", "Pius", 67);
        var teams = student1;
//        teams.equals(student);
        if (teams == student){
        System.out.println(teams + " The teams Is equals:" + student + "");
    }else{
            System.out.println(teams+ " is not equals to "+ student);
            System.out.println(teams.equals(student));
        }
    }
}
