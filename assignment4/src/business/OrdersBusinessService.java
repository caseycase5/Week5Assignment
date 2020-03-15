package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {

	List<Order> orders = new ArrayList<Order>();
	
	@Override
	public void test() {
		System.out.println("Hello from the OrdersBusinessService");

	}
	
	public OrdersBusinessService() {
		orders.add(new Order("0001", "Product 1", (float)45.00, 2));
		orders.add(new Order("0002", "Product 2", (float)16.55, 5));
		orders.add(new Order("0003", "Product 3", (float)147.12, 1));
		orders.add(new Order("0004", "Product 4", (float)36.99, 6));
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		this.orders = orders;
		
	}

}
