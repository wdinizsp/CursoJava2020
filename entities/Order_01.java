package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus_01;

public class Order_01 {
	
	private Date moment;
	private OrderStatus_01 status;
	
	private List<OrderItem> orders = new ArrayList<>();
	
	public Order_01(Date moment, OrderStatus_01 status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus_01 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus_01 status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		orders.add(item);
	}

	public void removeItem(OrderItem item) {
		orders.add(item);
	}
	
	public double total() {
		double sum = 0;
		
		for (OrderItem o : orders) {
			sum += o.subTotal();
			}
		return sum;
		}
		
	

	@Override
	public String toString() {
		return "Order_01 [moment=" + moment + ", status=" + status + "]";
	}

}
