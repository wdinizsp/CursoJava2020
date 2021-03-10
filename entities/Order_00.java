package entities;

import java.util.Date;

import entities.enums.OrderStatus_00;

public class Order_00 {
	
	private Integer id;
	private Date moment;
	private OrderStatus_00 status;
	
	public Order_00() {
		
	}

	public Order_00(Integer id, Date moment, OrderStatus_00 status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus_00 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus_00 status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order_00 [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	

}
