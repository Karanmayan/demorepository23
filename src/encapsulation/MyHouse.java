package encapsulation;

public class MyHouse {
	public static void main(String[] args) {
		FriendHouse o = new FriendHouse();
		int lockerAmt = o.getLockerAmt();
		System.out.println(lockerAmt);
		o.setLockerAmt(1000);
		int lockerAmt2 = o.getLockerAmt();
		System.out.println(lockerAmt2);
	}

}

