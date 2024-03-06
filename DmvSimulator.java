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
                System.out.println("You do NOT have the required paperwork! Be a competent person and bring everything you need before waiting in line!!!\n Jeez you are incompetent!!!");
                break;
            }
            numberCalled++;

            if (numberCalled > 100) {
                numberCalled = 1;
            }
        }
    }
}
