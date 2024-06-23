package com.pace.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Event {
	@Id
	@Column
	private int customerid;
	@Column
	private String customername;
	@Column
	private String eventdate;
	@Column
	private String eventtime;
	@Column
	private String handledby;
	@Column
	private float totalamount;
	@Column
	private float advance;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	public String getEventtime() {
		return eventtime;
	}
	public void setEventtime(String eventtime) {
		this.eventtime = eventtime;
	}
	public String getHandledby() {
		return handledby;
	}
	public void setHandledby(String handledby) {
		this.handledby = handledby;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public float getAdvance() {
		return advance;
	}
	public void setAdvance(float advance) {
		this.advance = advance;
	}
	
	

}
