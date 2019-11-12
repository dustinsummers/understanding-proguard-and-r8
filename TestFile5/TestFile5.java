class TestFile5 {
	public static void main(String[] args){
		sendMessage(message -> System.out.println("My new fancy message"));
		sendMessage(message -> System.out.println("My second fancy message"));

		sendMessage(System.out::println);
		sendMessage(System.out::println);
	}


	interface PostMan<String> {
		void letterTime(String message);
	}
	private static void sendMessage(PostMan<String> message) {
		message.letterTime("Sending a default message");
	}
}
