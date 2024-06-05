public class Player {
    private final String name;
    private int messageCounter;

    public Player(String name) {
        this.name = name;
        this.messageCounter = 0;
    }

    public void sendMessage(Player recipient, String message) {
        // Additional logic for message validation, logging, etc.
        recipient.receiveMessage(this, message);
    }

    public void receiveMessage(Player sender, String message) {
        // Additional logic for message handling
        System.out.println(name + " received message from " + sender.getName() + ": " + message + " (Message counter: " + messageCounter + ")");
        messageCounter++;
        if (messageCounter < 10) {
            sender.sendMessage(this, "Reply to message " + messageCounter);
        }
    }

    public String getName() {
        return name;
    }
}

