public class DmvSimulator {
    public static void main(String[] args) {
        int userNumber = (int) ((Math.random()) * 100);
        if (userNumber == 0) {
            userNumber = 1;
        }
        int numberCalled = userNumber + 1;
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called");
        while (true) {
            System.out.println("Calling number: " + numberCalled);

            if (numberCalled == userNumber) {
                System.out.println("You don't have the required paperwork");
                break;
            }
            numberCalled++;

            if (numberCalled > 100) {
                numberCalled = 1;
            }
        }
    }
}
