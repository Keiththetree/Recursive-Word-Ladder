import java.io.IOException;
import java.util.Scanner;
public class WordLadderApp {
	public static void main(String[] args) {
		try {
			WordDictionary dict = new WordDictionary("words_small.txt");
			WordLadderSolver solver = new WordLadderSolver(dict);
			System.out.println("Example Ladder:");
			System.out.println(solver.findLadder("fish","mast"));
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter start word: ");
			String start = scanner.nextLine();
			System.out.print("Enter end word: ");
			String end = scanner.nextLine();
			start.trim();
			end.trim();
			start.toLowerCase();
			end.toLowerCase();
			System.out.println(solver.findLadder(start,end));

		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}





	}
}
