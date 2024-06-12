package collections;



public class Mobile implements Comparable<Mobile> {
	int iemi;
	String brand;
	int prices;

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int iemi, String brand, int prices) {
		super();
		this.iemi = iemi;
		this.brand = brand;
		this.prices = prices;
	}

	public int getIemi() {
		return iemi;
	}

	public void setIemi(int iemi) {
		this.iemi = iemi;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrices() {
		return prices;
	}

	public void setPrices(int prices) {
		this.prices = prices;
	}

	@Override
	public boolean equals(Object obj) {
		Mobile m = (Mobile) obj;
		if (this.iemi == m.iemi) {
			return true;
		} else {
			return false;
		}

	}
	

	@Override
	public String toString() {
		return "Mobile [iemi=" + iemi + ", brand=" + brand + ", prices=" + prices + "]";
	}

	@Override
	public int hashCode() {

		return this.iemi;

	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
