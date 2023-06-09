package practice;

public class SwitchStatement {
	String month = "MARCH";
	public void checkSwitch()
	{
		switch(month)
		{
		case "JANUARY":
			System.out.println(month + "IS THE THIRD MONTH OF A YEAR");
			break;
		case "feburary":
			System.out.println(month + "IS THE THIRD MONTH OF A YEAR");
		case "MARCH":
			System.out.println(month + "IS THE THIRD MONTH OF A YEAR");
		
		}
		
	}
	public static void main(String args[])
	{
		SwitchStatement o = new SwitchStatement();
		o.checkSwitch();
	}

}
