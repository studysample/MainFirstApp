package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="parttab")
public class Part {
	@Id
	@GeneratedValue
	@Column(name="prid")
	private Integer id;
	@Column(name="prcode")
	private String partCode;
	@Column(name="prlen")
	private String partLen;
	@Column(name="prwid")
	private String partWid;
	@Column(name="prhgt")
	private String partHgt;
	@Column(name="prcost")
	private String baseCost;
	@Column(name="prcurrency")
	private String baseCurrency;
	@Column(name="prnote")
	private String note;
	@ManyToOne
	@JoinColumn(name="uomIDFK")
	private Uom uomob;
	
	@ManyToOne
	@JoinColumn(name="orderSaleIdFK")
	private OrderMethod omSaleOb;  //HAS-A
	
	@ManyToOne
	@JoinColumn(name="orderPurchaseIDFK")
	private OrderMethod omPurchaseOb;

	public Part() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartCode() {
		return partCode;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	public String getPartLen() {
		return partLen;
	}

	public void setPartLen(String partLen) {
		this.partLen = partLen;
	}

	public String getPartWid() {
		return partWid;
	}

	public void setPartWid(String partWid) {
		this.partWid = partWid;
	}

	public String getPartHgt() {
		return partHgt;
	}

	public void setPartHgt(String partHgt) {
		this.partHgt = partHgt;
	}

	public String getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(String baseCost) {
		this.baseCost = baseCost;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Uom getUomob() {
		return uomob;
	}

	public void setUomob(Uom uomob) {
		this.uomob = uomob;
	}

	public OrderMethod getOmSaleOb() {
		return omSaleOb;
	}

	public void setOmSaleOb(OrderMethod omSaleOb) {
		this.omSaleOb = omSaleOb;
	}

	public OrderMethod getOmPurchaseOb() {
		return omPurchaseOb;
	}

	public void setOmPurchaseOb(OrderMethod omPurchaseOb) {
		this.omPurchaseOb = omPurchaseOb;
	}

	@Override
	public String toString() {
		return "Part [id=" + id + ", partCode=" + partCode + ", partLen=" + partLen + ", partWid=" + partWid
				+ ", partHgt=" + partHgt + ", baseCost=" + baseCost + ", baseCurrency=" + baseCurrency + ", note="
				+ note + ", uomob=" + uomob + ", omSaleOb=" + omSaleOb + ", omPurchaseOb=" + omPurchaseOb + "]";
	}

	
	
		

}
