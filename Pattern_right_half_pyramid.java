package pattern;

public class Rightangled {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 7) {
			int j = 1;
			while (j <= i) {
				System.out.print(" * ");
				j++;
				}
			System.out.println();
			i++;
			}
		}
}
