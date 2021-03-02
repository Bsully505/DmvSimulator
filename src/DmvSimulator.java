public class DmvSimulator {

    public static void main(String[] args){
        System.out.println("Welcome to the DMV please wait until give a ticket number");
        int ticketNum = (int)(Math.random()*100);//random num 1-100
        System.out.format("your Ticket is %d \n", ticketNum);
        for (int i = 0 ; i< 100 ;i++){
            System.out.format("Now calling Ticket %d \n", ((i+ticketNum)%100)+1);
        }
        System.out.println("You should have came with ther right papers leave now!!!!");

    }
}
