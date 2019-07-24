class TestFile2 {

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