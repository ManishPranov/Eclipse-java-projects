package ConceptJumpingStatement;
//create project package class main method
//create for loop inside main method
//create if statement 
// type break for jumping statement inside if loop
//type syso+ctrl+space outside if statement and run the program

public class BreakJumpingStatement {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if (i==6) {
//				here break is used to remove the values of conditions in the if statement(here i==6) and iteration in the for loop(here i++) in the output
				break;
			}
			System.out.println(i);
		}
	}

}
