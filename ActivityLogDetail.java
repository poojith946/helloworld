package com.exide.myconnect.ws.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "Activity_Log_Details")
public class ActivityLogDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Activity_Log_Details_Id")
	@JsonIgnore
	private Integer activityLogDetailsId;

	@Column(name = "Activity_Name")
	private String activityName;

	@Column(name = "Activity_Result")
	private String activityResult;

	@Column(name = "Activity_Time")
	private Date activityTime;

	@Column(name = "Comments")
	private String comments;

	@Column(name = "Created_Datetime")
	private Date createdDatetime;

	@Column(name = "Created_User")
	private String createdUser;

	@Column(name = "Modified_Datetime")
	private Date modifiedDatetime;

	@Column(name = "Modified_User")
	private String modifiedUser;

	@Column(name = "Transaction_Id")
	private String transactionId;

	@Column(name = "User_Name")
	private String userName;

	public Integer getActivityLogDetailsId() {
		return activityLogDetailsId;
	}

	public void setActivityLogDetailsId(Integer activityLogDetailsId) {
		this.activityLogDetailsId = activityLogDetailsId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityResult() {
		return activityResult;
	}

	public void setActivityResult(String activityResult) {
		this.activityResult = activityResult;
	}

	public Date getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public String getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}