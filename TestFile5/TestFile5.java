class TestFile4 {
	public static void main(String[] args){
		load(System.out::println);
		load(System.out::println);
	}


	interface PostMan<String> {
		void letterTime(String message);
	}
	private static void sendMessage(PostMan<String> message) {
		message.letterTime("Sending a message: I'm Using Lambdas")
	}
}