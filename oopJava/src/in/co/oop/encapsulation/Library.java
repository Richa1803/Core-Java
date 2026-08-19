package in.co.oop.encapsulation;

public class Library {
	
	private Long libraryId;
	private String libraryName;
	private String address;
	private int totalBook;
	private String contactNo;
	
	public Long getLibraryId() {
		return this.libraryId;
		
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return this.libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName=libraryName;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public int getTotalBook() {
		return this.totalBook;
	}
	public void setTotalBook(int totalook) {
		this.totalBook = totalBook;
	}
	public String getContactNo() {
		return this.contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo=contactNo;
	}

}
