public class Inventors {

    // Instance fields
    private final String itTechnology;
    private final String itNameCreator;
    private final int itAge;
    private final String itCityOfBirth;
    private final String itRecentCityOfResidence;
    private final String itAchievementsMerits;

    // Constructor method
    public Inventors(String technology, String nameCreator, int age, String cityOfBirth,
                     String recentCityOfResidence, String achievementsMerits) {
        this.itTechnology = technology;
        this.itNameCreator = nameCreator;
        this.itAge = age;
        this.itCityOfBirth = cityOfBirth;
        this.itRecentCityOfResidence = recentCityOfResidence;
        this.itAchievementsMerits = achievementsMerits;
    }

    public static void main(String[] args) {

        Inventors inventor1 = new Inventors(
                "Python", "Guido van Rossum",
                66, "Haarlem, Netherlands", "United States",
                "Creator of Python, Distinguished Engineer at Microsoft");

        Inventors inventor2 = new Inventors(
                "Java", "James Gosling",
                66, "Calgary, Canada", "United States",
                "Creator of Java, Duke's Choice Award for Technology Leadership");

        Inventors inventor3 = new Inventors(
                "MySQL", "Michael Widenius",
                59, "Helsinki, Finland", "Sweden",
                "Creator of MySQL, MariaDB Corporation AB");

        Inventors inventor4 = new Inventors(
                "Linux", "Linus Torvalds",
                52, "Helsinki, Finland", "United States",
                "Creator of Linux, Maintainer of the Linux Kernel");

        Inventors inventor5 = new Inventors(
                "C++", "Bjarne Stroustrup",
                71, "Aarhus, Denmark", "United States",
                "Creator of C++, Turing Award Recipient Author of the 'C++ Programming language'");

        // Printing details of Inventors
        System.out.println("Inventor 1:");
        System.out.println("Technology: " + inventor1.itTechnology);
        System.out.println("Name of Creator: " + inventor1.itNameCreator);
        System.out.println("Age: " + inventor1.itAge);
        System.out.println("City of Birth: " + inventor1.itCityOfBirth);
        System.out.println("Recent City of Residence: " + inventor1.itRecentCityOfResidence);
        System.out.println("Achievements/Merits: " + inventor1.itAchievementsMerits);
        System.out.println();

        System.out.println("Inventor 2:");
        System.out.println("Technology: " + inventor2.itTechnology);
        System.out.println("Name of Creator: " + inventor2.itNameCreator);
        System.out.println("Age: " + inventor2.itAge);
        System.out.println("City of Birth: " + inventor2.itCityOfBirth);
        System.out.println("Recent City of Residence: " + inventor2.itRecentCityOfResidence);
        System.out.println("Achievements/Merits: " + inventor2.itAchievementsMerits);
        System.out.println();

        System.out.println("Inventor 3:");
        System.out.println("Technology: " + inventor3.itTechnology);
        System.out.println("Name of Creator: " + inventor3.itNameCreator);
        System.out.println("Age: " + inventor3.itAge);
        System.out.println("City of Birth: " + inventor3.itCityOfBirth);
        System.out.println("Recent City of Residence: " + inventor3.itRecentCityOfResidence);
        System.out.println("Achievements/Merits: " + inventor3.itAchievementsMerits);
        System.out.println();

        System.out.println("Inventor 4:");
        System.out.println("Technology: " + inventor4.itTechnology);
        System.out.println("Name of Creator: " + inventor4.itNameCreator);
        System.out.println("Age: " + inventor4.itAge);
        System.out.println("City of Birth: " + inventor4.itCityOfBirth);
        System.out.println("Recent City of Residence: " + inventor4.itRecentCityOfResidence);
        System.out.println("Achievements/Merits: " + inventor4.itAchievementsMerits);

        System.out.println("Inventor 5:");
        System.out.println("Technology: " + inventor5.itTechnology);
        System.out.println("Name of Creator: " + inventor5.itNameCreator);
        System.out.println("Age: " + inventor5.itAge);
        System.out.println("City of Birth: " + inventor5.itCityOfBirth);
        System.out.println("Recent City of Residence: " + inventor5.itRecentCityOfResidence);
        System.out.println("Achievements/Merits: " + inventor5.itAchievementsMerits);
        System.out.println();

    }
}