package assignment2_inheritance;

class Building {
	String name;
	float height;

	void occupy() {
		System.out.println("Occupying the Building");
	}

	void conductMeetings() {
		System.out.println("Meeting is conducted");
	}

	void evacuate() {
		System.out.println("Evacuate the building");
	}
}

class House extends Building {
	@Override
	void occupy() {
		System.out.println("House is occupied with family");
	}

	@Override
	void conductMeetings() {
		System.out.println("Family meetings is condecuted at house");
	}

	@Override
	void evacuate() {
		System.out.println("Family evacuate from house to go to city");
	}
}

class OfficeBuilding extends Building {
	@Override
	void occupy() {
		System.out.println("Office is occupied with employees");
	}

	@Override
	void conductMeetings() {
		System.out.println("Meeting is condecuted at office Building");
	}

	@Override
	void evacuate() {
		System.out.println("Office members are evacuated");
	}
}

class SkyScraper extends Building {
	@Override
	void occupy() {
		System.out.println("SkyScraper is occupied with luxurious rooms");
	}

	@Override
	void conductMeetings() {
		System.out.println("Meeting is condecuted at SkyScraper");
	}

	@Override
	void evacuate() {
		System.out.println("Delegates are evacuated");
	}
}

public class Asg2pgm13 {
	public static void main(String[] args) {
		House h = new House();
		OfficeBuilding pf = new OfficeBuilding();
		SkyScraper s = new SkyScraper();

		h.occupy();
		h.conductMeetings();
		h.evacuate();

		pf.occupy();
		pf.conductMeetings();
		pf.evacuate();

		s.occupy();
		s.conductMeetings();
		s.evacuate();
	}
}
