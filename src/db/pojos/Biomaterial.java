package db.pojos;

import java.io.Serializable;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Biomaterial")
@XmlType(propOrder = {"product_name", "price_unit", "available_units", "information"})
public class Biomaterial implements Serializable{

	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private Integer biomaterial_id;
	@XmlTransient
	private Utility utility;
	@XmlTransient
	private Maintenance maintenance;
	@XmlElement
	private String product_name;
	@XmlElement
	private Float price_unit;
	@XmlElement
	private Integer available_units;
	@XmlTransient
	//@XmlJavaTypeAdapter(SQLDateAdapter.class)
	private Date expiration_date;
	@XmlElement
	private String information;
	@XmlTransient
	private List<Transaction> transaction_list = new LinkedList<Transaction>();
	
	
	public Biomaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Biomaterial(Utility utility, Maintenance maintenance, String name_product, Float price_unit,
			Integer available_units, Date expiration_date) {
		super();
		this.utility = utility;
		this.maintenance = maintenance;
		this.product_name = name_product;
		this.price_unit = price_unit;
		this.available_units = available_units;
		this.expiration_date = expiration_date;
	}
	
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information=information;
	}
	public Integer getBiomaterial_id() {
		return biomaterial_id;
	}
	
	public void setBiomaterial_id(Integer biomaterial_id) {
		this.biomaterial_id = biomaterial_id;
	}
	
	public Utility getUtility() {
		return utility;
	}
	
	public void setUtility(Utility utility) {
		this.utility = utility;
	}
	
	public Maintenance getMaintenance() {
		return maintenance;
	}
	
	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}
	
	public String getName_product() {
		return product_name;
	}
	
	public void setName_product(String name_product) {
		this.product_name = name_product;
	}
	
	public Float getPrice_unit() {
		return price_unit;
	}
	
	public void setPrice_unit(Float price_unit) {
		this.price_unit = price_unit;
	}
	
	public Integer getAvailable_units() {
		return available_units;
	}
	
	public void setAvailable_units(Integer available_units) {
		this.available_units = available_units;
	}
	
	public Date getExpiration_date() {
		return expiration_date;
	}
	
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	public List<Transaction> getTransaction_list() {
		return transaction_list;
	}
	public void setTransaction_list(List<Transaction> transaction_list) {
		this.transaction_list = transaction_list;
	}
	@Override
	public String toString() {
		return "Biomaterial [biomaterial_id=" + biomaterial_id + ", utility=" + utility + ", maintenance=" + maintenance
				+ ", product_name=" + product_name + ", price_unit=" + price_unit + ", available_units="
				+ available_units + ", expiration_date=" + expiration_date + ", information: " + information + "]";
	}
}

