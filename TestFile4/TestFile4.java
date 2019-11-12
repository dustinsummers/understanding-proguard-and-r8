class TestFile4 {
	interface PostMan<String> {
		void letterTime(String message);
	}

	public static void main(String[] args){
		PostMan postMan = message -> System.out.println(message);

		postMan.letterTime("Sending a message: I'm Using Lamdas");
	}
}
