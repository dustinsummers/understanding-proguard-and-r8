fun main(vararg args: String){
	println(PostMan.letterTime("Fyre Festival!"))
}

class PostMan(val message: String){
	fun sendMessage(trap: String) = "$message... $trap"

	companion object{
		fun letterTime(trap: String) = PostMan("You've been invited to").sendMessage(trap)
	}
}