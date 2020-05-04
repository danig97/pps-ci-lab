public class MainClass {
	/**
	 * Log a message on the output.
	 */
	public static void log(String msg) {
		synchronized(System.out) {
			System.out.println(msg);
		}
	}

	/**
	 * Execute the program.
	 */
	public static void main(String[] args) {
		// Stampa solo Hello World.
		log("Hello World!");
	}
}