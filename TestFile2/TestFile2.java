class TestFile2 {

    interface PostMan{
        void letterTime(String message);
    }

    static class Messenger implements PostMan{

        @Override
        public void letterTime(String message) {
            System.out.println("Sending a message: " + message);
        }
    }

    public static void main(String[] args) {
        // Log out message
        sendMessage(new Messenger());
    }

    private static void sendMessage(Messenger messenger){
        messenger.letterTime("I'm implementing interfaces!!");
    }
}