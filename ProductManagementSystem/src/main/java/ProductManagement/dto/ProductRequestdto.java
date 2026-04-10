package ProductManagement.dto;

public class ProductRequestdto {
	String name;
	String description;
	int price;
	String photoUrl;
	public ProductRequestdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductRequestdto(String name, String description, int price, String photoUrl) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.photoUrl = photoUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	@Override
	public String toString() {
		return "ProductRequestdto [name=" + name + ", description=" + description + ", price=" + price + ", photoUrl="
				+ photoUrl + "]";
	}
	
}
