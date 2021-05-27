package apartment;

public class House {

	String houseNumber;
	String houseName;
	String phoneNumber;
	String houseType;
	
	public House(String id,String name ,String phoneNumber, String houseType) {
		this.houseNumber = id;
		this.houseName = name;
		this.phoneNumber = phoneNumber;
		this.houseType = houseType;
	}

	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
}
