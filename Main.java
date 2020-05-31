package abc;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


		Sorting sort = new Sorting();
		System.out.println("食材の名前を入力してください");
		Scanner foodNameScanner = new Scanner(System.in);
		String foodName = foodNameScanner.nextLine();
		System.out.println("食材のグラム数を入力してください");
		Scanner gramsScanner = new Scanner(System.in);
		int grams = gramsScanner.nextInt();
		sort.sort(foodName,grams);

		foodNameScanner.close();
		gramsScanner.close();
	}

}
