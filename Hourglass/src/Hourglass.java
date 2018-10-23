
public class Hourglass {
	public static void main(String[] args) {
		printBase();
		printTopHalf();
		printmid();
		printBotHalf();
		printBase();
	}
	public static void printStringofChars(String str, int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print(str);
		}
	}
	public static void printmid() {
		System.out.println("     ||");
	}
	public static void printBase() {
		String side = "|";
		System.out.print(side);
		printStringofChars( "\"" , 10);
		System.out.print(side);
		System.out.println("");
	}	
	public static void printTopHalf() {
		String sideL ="\\";
		String sideR ="/";
		for(int x = 1; x<=4; x++) {
			printStringofChars(" ",x);
			System.out.print(sideL);
			for(int i = -2*x+10; i >= 0; i -= 8) {
				printStringofChars(":", i);
			}
			System.out.print(sideR);
			System.out.println("");
		}
	}
	public static void printBotHalf() {
		String sideL ="/";
		String sideR ="\\";
		for(int x = 4; x>=1; x--) {
			printStringofChars(" ",x);
			System.out.print(sideL);
			for(int i = -2*x+10; i >= 0; i -= 8) {
				printStringofChars(":", i);
			}
			System.out.print(sideR);
			System.out.println("");
		}
	}
}