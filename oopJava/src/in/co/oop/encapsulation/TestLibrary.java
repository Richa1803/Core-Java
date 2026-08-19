package in.co.oop.encapsulation;

public class TestLibrary {
	public static void main(String[] args) {

		Library l = new Library();

		l.setLibraryId(40001L);
		l.setLibraryName("Rays");
		l.setAddress("rays technologies Indore");
		l.setTotalBook(2);
		l.setContactNo("7415896354");

		System.out.println("Library Id=" + l.getLibraryId());
		System.out.println("Library Name=" + l.getLibraryName());
		System.out.println("Address=" + l.getAddress());
		System.out.println("Total book=" + l.getTotalBook());
		System.out.println("Contact Number" + l.getContactNo());
	}

}
