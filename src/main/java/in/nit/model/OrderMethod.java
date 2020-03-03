package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="omtab")
public class OrderMethod {
	@Id
	@GeneratedValue
	@Column(name="oid")
	private Integer omId;
	@Column(name="omode")
	private String omMode;
	@Column(name="ocode")
	private String omCode;
	@Column(name="omthod")
	private String omMethod;
	@Column(name="oaccept")
	private String omAccept;
	@Column(name="odesc")
	private String omDesc;
	public OrderMethod() {
		super();
	}
	public Integer getOmId() {
		return omId;
	}
	public void setOmId(Integer omId) {
		this.omId = omId;
	}
	public String getOmCode() {
		return omCode;
	}
	public void setOmCode(String omCode) {
		this.omCode = omCode;
	}
	
	public String getOmMethod() {
		return omMethod;
	}
	public void setOmMethod(String omMethod) {
		this.omMethod = omMethod;
	}
	public String getOmMode() {
		return omMode;
	}
	public void setOmMode(String omMode) {
		this.omMode = omMode;
	}
	public String getOmAccept() {
		return omAccept;
	}
	public void setOmAccept(String omAccept) {
		this.omAccept = omAccept;
	}
	public String getOmDesc() {
		return omDesc;
	}
	public void setOmDesc(String omDesc) {
		this.omDesc = omDesc;
	}
	@Override
	public String toString() {
		return "OrderMethod [omId=" + omId + ", omMode=" + omMode + ", omCode=" + omCode + ", omMethod=" + omMethod
				+ ", omAccept=" + omAccept + ", omDesc=" + omDesc + "]";
	}
	
	

}
