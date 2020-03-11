package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whutab")
public class WhUserType {

	@Id
	@GeneratedValue
	@Column(name="usid")
	private Integer userId;
	@Column(name="ustype")
	private String userType;
	@Column(name="uscode")
	private String userCode;
	@Column(name="usfor")
	private String userFor;
	@Column(name="usemail")
	private String userEmail;
	@Column(name="uscontact")
	private String userContact;
	@Column(name="usidtype")
	private String userIdType;
	@Column(name="usifother")
	private String userIfOther;
	@Column(name="usidnumber")
	private String userIdNumber;
	public WhUserType() {
		super();
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserFor() {
		return userFor;
	}
	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}
	public String getUserIfOther() {
		return userIfOther;
	}
	public void setUserIfOther(String userIfOther) {
		this.userIfOther = userIfOther;
	}
	public String getUserIdNumber() {
		return userIdNumber;
	}
	public void setUserIdNumber(String userIdNumber) {
		this.userIdNumber = userIdNumber;
	}
	@Override
	public String toString() {
		return "WhUserType [userId=" + userId + ", userType=" + userType + ", userCode=" + userCode + ", userFor="
				+ userFor + ", userEmail=" + userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType
				+ ", userIfOther=" + userIfOther + ", userIdNumber=" + userIdNumber + "]";
	}
	
}