public class Students {
    // Instance fields
    String studentName;
    String studentSurname;
    int studentAge;
    String studentCity;

    // constructor method
    public Students (String name, String surname, int age, String city) {
        studentName = name;
        studentSurname = surname;
        studentAge = age;
        studentCity = city;
    }

    // main method
    public static void main (String[] args){
        Students student1 = new Students("Vadzim", "Ramaniuk", 28, "Toronto");
        Students student2 = new Students("Julia", "Kravchuk", 25, "Toronto");
        Students student3 = new Students("James", "Gosling", 66, "Silicon Valley (California)");
        Students student4 = new Students("Guido", "van Rossum", 67, "Massachusetts");

        System.out.println
                ("Python creator is " + student4.studentName + " " + student4.studentSurname + ". He is "
                + student4.studentAge + " age now. He lives in " + student4.studentCity + ".");

        System.out.println
                ("Java creator is " + student3.studentName + " " + student3.studentSurname + ". He live in " +
                student3.studentCity);













    }
}