package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@Column(name="purchaseshipcode")
	private String pcordShipmentCode;
	@Column(name="purchasevendor")
	private String  pcordVendor;
	@Column(name="purchaserefnum")
	private String pcordReferanceNumber;
	@Column(name="purchasequacheck")
	private String pcordQualityCheck;
	@Column(name="purchasedefstts")
	private String pcordDefaultStatus;
	@Column(name="purchasedesc")
	private String pordDesc;
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
	public String getPcordShipmentCode() {
		return pcordShipmentCode;
	}
	public void setPcordShipmentCode(String pcordShipmentCode) {
		this.pcordShipmentCode = pcordShipmentCode;
	}
	public String getPcordVendor() {
		return pcordVendor;
	}
	public void setPcordVendor(String pcordVendor) {
		this.pcordVendor = pcordVendor;
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
	@Override
	public String toString() {
		return "PurchaseOrder [pcordId=" + pcordId + ", pcordCode=" + pcordCode + ", pcordShipmentCode="
				+ pcordShipmentCode + ", pcordVendor=" + pcordVendor + ", pcordReferanceNumber=" + pcordReferanceNumber
				+ ", pcordQualityCheck=" + pcordQualityCheck + ", pcordDefaultStatus=" + pcordDefaultStatus
				+ ", pordDesc=" + pordDesc + "]";
	}
	
	
}
