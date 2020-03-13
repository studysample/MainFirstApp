package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="purchaseOrderTab")
public class PurchaseOrder {
   
	@Id
	@GeneratedValue
	@Column(name="purchaseid")
	private Integer pcordId;
	@Column(name="purchasecode")
	private String pcordCode;
	
	@Column(name="purchaserefnum")
	private String pcordReferanceNumber;
	@Column(name="purchasequacheck")
	private String pcordQualityCheck;
	@Column(name="purchasedefstts")
	private String pcordDefaultStatus;
	@Column(name="purchasedesc")
	private String pordDesc;
	
	@ManyToOne
	@JoinColumn(name="shipIdFK")
	private ShipmentType shipOb;
	
	@ManyToOne
	@JoinColumn(name="userIdFK")
	private WhUserType Vendor;

	public PurchaseOrder() {
		super();
	}

	public Integer getPcordId() {
		return pcordId;
	}

	public void setPcordId(Integer pcordId) {
		this.pcordId = pcordId;
	}

	public String getPcordCode() {
		return pcordCode;
	}

	public void setPcordCode(String pcordCode) {
		this.pcordCode = pcordCode;
	}

	public String getPcordReferanceNumber() {
		return pcordReferanceNumber;
	}

	public void setPcordReferanceNumber(String pcordReferanceNumber) {
		this.pcordReferanceNumber = pcordReferanceNumber;
	}

	public String getPcordQualityCheck() {
		return pcordQualityCheck;
	}

	public void setPcordQualityCheck(String pcordQualityCheck) {
		this.pcordQualityCheck = pcordQualityCheck;
	}

	public String getPcordDefaultStatus() {
		return pcordDefaultStatus;
	}

	public void setPcordDefaultStatus(String pcordDefaultStatus) {
		this.pcordDefaultStatus = pcordDefaultStatus;
	}

	public String getPordDesc() {
		return pordDesc;
	}

	public void setPordDesc(String pordDesc) {
		this.pordDesc = pordDesc;
	}

	public ShipmentType getShipOb() {
		return shipOb;
	}

	public void setShipOb(ShipmentType shipOb) {
		this.shipOb = shipOb;
	}

	public WhUserType getVendor() {
		return Vendor;
	}

	public void setVendor(WhUserType vendor) {
		Vendor = vendor;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [pcordId=" + pcordId + ", pcordCode=" + pcordCode + ", pcordReferanceNumber="
				+ pcordReferanceNumber + ", pcordQualityCheck=" + pcordQualityCheck + ", pcordDefaultStatus="
				+ pcordDefaultStatus + ", pordDesc=" + pordDesc + ", shipOb=" + shipOb + ", Vendor=" + Vendor + "]";
	}

	
}
