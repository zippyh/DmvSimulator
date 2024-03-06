public class DmvSimulator {
    public static void main(String[] args) {
        int userNumber = (int) ((Math.random()) * 200) + 1;
        int numberCalled = userNumber + 1;
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called");
        while (true) {
            System.out.println("Calling number: " + numberCalled);

            if (numberCalled == userNumber) {
                if((int) Math.random() * 100 == 100) {
                    System.out.println("You have the required paperwork");
                } else {
                    System.out.println("You do NOT have the required paperwork! Be a competent person and bring everything you need before waiting in line!!!\n You will not be leaving anytime soon MWAH HAHAHAHAHAA!!!");
                }

                break;
            }
            numberCalled++;

            if (numberCalled > 200) {
                numberCalled = 1;
            }
        }
    }
}
