public class MagicNumber {

    public static void main(String[] args) {
        // Original number
        int myNumber = 2;

        double stepOne = Math.pow(myNumber,2);
        double stepTwo = stepOne + myNumber;
        double stepThree = stepTwo / myNumber;
        double stepFour = stepThree + 17;
        double stepFive = stepFour - myNumber;
        double stepSix = stepFive / 6;

        System.out.println("Step six number is " + stepSix);

        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;

        System.out.println("Your magic number is " + magicNumber);










    }
}