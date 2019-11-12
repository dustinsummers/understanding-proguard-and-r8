class TestFile3 {

    interface PostMan{
        void letterTime(Message message);
    }

    static class Messenger implements PostMan{

        @Override
        public void letterTime(Message message) {
            System.out.println("Sending a message: " + message.getMessage());
        }
    }

    public static void main(String[] args) {
        // Log out message
        sendMessage(new Messenger());
    }

    private static void sendMessage(Messenger messenger){
        messenger.letterTime(new Message("I'm implementing interfaces!!"));
    }

    private static void messageToRemove(boolean isRemoved){
	System.out.println("This will get removed");
    }

}

class Message{
    public Message(String message){
        this.message = message;
    }

    private String message;

    public void setMessage(String newMessage){
        this.message = newMessage;
    }

    public String getMessage(){
        return this.message;
    }
}

class ClassToRemove{
	public ClassToRemove(boolean isRemoved){
	   this.isRemoved = isRemoved;
	}

	private boolean isRemoved;

	public void doesNothing(){
	    System.out.println("What is the purpose of my life as a method?");
	}

}
