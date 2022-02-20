package ConceptJumpingStatement;
//create project package class main method
//create for loop inside main method
//create if statement 
//type continue for jumping statement inside if loop
//type syso+ctrl+space outside if statement and run the program

public class ContinueJumpingStatement {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if (i==6) {
				continue;
//continue statement is used to remove the condition from if statement in the output
			}
			System.out.println(i);
		}
	}

}
