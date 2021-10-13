import java.util.Scanner;

//Application for printing out the useful information about Java integer primitives
public class PrimitivesInformationAppl {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in); //input data from the console
		while(true) {
			System.out.println("enter integer primitive type (long, int, short, char, byte or exit");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				break;
			}
			printInformationByType(line);
		}
		System.out.println("thanks for using our application & bye");

	}

	private static void printInformationByType(String type) {
		// your homework should contain switch by the given type (long, int, short, char, byte)
		//for default there should be out: Wrong primitive type
		// for each type there should be an appropriate method of printing information of the type
		//for example, printCharInformation - method printing out the info about type "char"
		switch (type) {
		case "byte":
			printByteInfo();
			break;
		case "char":
			printCharInfo();
			break;
		case "short":
			printShortInfo();
			break;
		case "int":
			printIntInfo();
			break;
		case "long":
			printLongInfo();
			break;
		default: System.out.printf("Wrong type: %s\n", type);
			break;
		}	
	}

	private static void printByteInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void printCharInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void printShortInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void printIntInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void printLongInfo() {
		// TODO Auto-generated method stub
		
	}
}
