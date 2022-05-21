
import java.util.Scanner;


class Main {

		public static void main(String[] args){
			int gogo = 1;
			Scanner sc = new Scanner(System.in);

			int count = sc.nextInt();
			if (count != 0 ) {
				gogo = count;

				for (int i = 1 ; i < count ; i ++) {
					gogo *= (count-i);
				
				}
			}
			System.out.println(gogo);
		}
}


