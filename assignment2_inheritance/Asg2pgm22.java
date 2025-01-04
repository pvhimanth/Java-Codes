package assignment2_inheritance;

class Guest {
	private String guestID;
	private String name;
	private long contactNumber;

	public Guest(String guestID, String name, long contactNumber) {
		this.guestID = guestID;
		this.name = name;
		this.contactNumber = contactNumber;
	}

	public Guest() {
		this("AGR45", "Himanth", 6302702694L);
		System.out.println("GuestID: " + guestID);
		System.out.println("Name: " + name);
		System.out.println("ContactNumber: " + contactNumber);
	}

}

class HotelGuest extends Guest {
	int roomNumber = 2;

	public HotelGuest() {
		System.out.println("RoomNumber: " + roomNumber);
	}
}

public class Asg2pgm22 {
	public static void main(String[] args) {
		HotelGuest hg = new HotelGuest();
	}
}
