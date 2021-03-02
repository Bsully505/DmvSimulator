public class DmvSimulator {

    public static void main(String[] args) {
        System.out.println("Welcome to the DMV please wait until give a ticket number");
        int ticketNum = (int) (Math.random() * 200);//random num 1-100
        System.out.format("your Ticket is %d \n", ticketNum);
        for (int i = 0; i < 200; i++) {
            System.out.format("Now calling Ticket %d \n", ((i + ticketNum) % 200) + 1);
        }
        int lucky_Number = (int) (Math.random() * 100);

        if (lucky_Number != 24) {
            System.out.println("You should have came with ther right papers leave now!!!!");
        }
        else{
            System.out.println("Thank you for having the required papers here is whatever you needed.");
        }

    }
}
