package application;

import java.util.Date;

import entities.Order_00;
import entities.enums.OrderStatus_00;

public class Program_18 {

	public static void main(String[] args) {
		
		Order_00 order_00 = new Order_00(1080, new Date(), OrderStatus_00.PENDING_PAYMENT);
		
		System.out.println(order_00);
		
		OrderStatus_00 os1 = OrderStatus_00.DELIVERED;
		
		OrderStatus_00 os2 = OrderStatus_00.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
