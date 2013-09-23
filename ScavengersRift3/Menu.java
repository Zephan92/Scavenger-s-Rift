import java.util.*;
public abstract class Menu 
{
	public Scanner scan = new Scanner(System.in);
	public Utility util = new Utility();

	public Menu()
	{}

	public abstract String displayHeader();
	public abstract String displayMenu(int player);
	public abstract String displayPrompt();

	public void displayInterface(int player)
	{
		Utility util = new Utility();
		String header;
		System.out.print(displayHeader());
		String menu;
		System.out.print(displayMenu(player));
		String prompt;
		System.out.print(displayPrompt());
		util.promptUser();
	}
}
