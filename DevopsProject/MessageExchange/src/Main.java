//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("initiator");
        Player player2 = new Player("receiver");

        player1.sendMessage(player2, "Initial message");

        // Wait for the message exchange to complete
        try {
            Thread.sleep(1000); // Wait for 1 second
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program terminated gracefully.");
    }
}
