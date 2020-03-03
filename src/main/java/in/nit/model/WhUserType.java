package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whusertab")

public class WhUserType {
	@Id
    @GeneratedValue
    @Column(name="uid")
     private Integer userId;
	@Column(name="ucode") 
     private String userCode;
	@Column(name="ufor")
     private String userFor;
	@Column(name="uemail")
     private String userEmail;
	@Column(name="ucontact")
     private String userContact;
	@Column(name="uidtype")
     private String userIdType;
	@Column(name="uifother")
     private String userIfOther;
	@Column(name="uidnuber")
     private Integer userIdNumber;
	public WhUserType() {
		super();
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public Integer getUserIdNumber() {
		return userIdNumber;
	}
	public void setUserIdNumber(Integer userIdNumber) {
		this.userIdNumber = userIdNumber;
	}
	@Override
	public String toString() {
		return "WhUserType [userId=" + userId + ", userCode=" + userCode + ", userFor=" + userFor + ", userEmail="
				+ userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType + ", userIfOther="
				+ userIfOther + ", userIdNumber=" + userIdNumber + "]";
	}
	
}
