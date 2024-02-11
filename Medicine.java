package com.mydata.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String medicineName;

    private int cost;

    private String companyName;

    private String medicinetype;

    private String mfgdate;

    private String expirydate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMedicinetype() {
		return medicinetype;
	}

	public void setMedicinetype(String medicinetype) {
		this.medicinetype = medicinetype;
	}

	public String getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public Medicine(int id, String medicineName, int cost, String companyName, String medicinetype, String mfgdate,
			String expirydate) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.cost = cost;
		this.companyName = companyName;
		this.medicinetype = medicinetype;
		this.mfgdate = mfgdate;
		this.expirydate = expirydate;
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medicineName=" + medicineName + ", cost=" + cost + ", companyName="
				+ companyName + ", medicinetype=" + medicinetype + ", mfgdate=" + mfgdate + ", expirydate=" + expirydate
				+ "]";
	}

  
}
