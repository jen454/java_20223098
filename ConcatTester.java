
public class ConcatTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animal11 = "quick brown fox";
		String animal12 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		String message = article.concat(" " + animal11).concat(" " + action).concat(" " + article).concat(" " + animal12);
		System.out.println(message);
	}
}
