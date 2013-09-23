import java.io.*;
public class Save implements Serializable
{
	private String playerName;
	private int tubewood;
	private boolean worldEvent;
	private int playerNumber;

	public String getPlayerName()
	{return playerName;}

	public void setPlayerName(String name)
	{playerName = name;}

	public int getPlayerNumber()
	{return playerNumber;}

	public void setPlayerNumber(int number)
	{playerNumber = number;}

	public int getResource(String resource)
	{
		if (resource.equals("tubewood"))
			return tubewood;
		else
			return -1;
	}

	public void setResource(String resource, int amount)
	{
		if (resource.equals("tubewood"))
			tubewood = amount;
	}

	public boolean getEvent(String event)
	{
		if (event.equals("worldEvent"))
			return worldEvent;
		else
			return false;
	}

	public void setEvent(String event, boolean done)
	{
		if (event.equals("worldEvent"))
			worldEvent = done;
	}

	public String toString()
	{
		return "The player name is: " + playerName
			+ "\nThe player number is: " + playerNumber
			+ "\nAmount of Tubewood collected is: " + tubewood
			+ "\nCompleted worldEvent: " + worldEvent;
	}

	public void saveFile(Save save, int player)
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try
		{
			if (player == 1)
				fos = new FileOutputStream("Save1.ser", false);
			else if (player == 2)
				fos = new FileOutputStream("Save2.ser", false);
			else if (player == 3)
				fos = new FileOutputStream("Save3.ser", false);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(save);
			oos.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}

	public Save readFile(int player)
	{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Save save = null;
		try
		{
			if (player == 1)
				fis = new FileInputStream("Save1.ser");
			else if (player == 2)
				fis = new FileInputStream("Save2.ser");
			else if (player == 3)
				fis = new FileInputStream("Save3.ser");
			ois = new ObjectInputStream(fis);
			save = (Save)ois.readObject();
			ois.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println(cnfe.getMessage());
		}
		return save;
	}
}
