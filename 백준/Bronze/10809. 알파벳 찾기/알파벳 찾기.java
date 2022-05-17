import java.util.Scanner;

class Main {
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

			String test = sc.nextLine();

			char [] arr = test.toCharArray();

			for (int i = 97 ; i < 123 ; i++) {
				if (test.contains("" + (char)i )) {
					
					System.out.print( test.indexOf("" + (char)i)+ " ");
				} else {
					System.out.print(-1 + " ");
				}
			}


	}

}


