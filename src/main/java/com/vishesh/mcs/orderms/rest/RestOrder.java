package com.vishesh.mcs.orderms.rest;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.client.RestTemplate;

import com.vishesh.mcs.orderms.domain.Car;
import com.vishesh.mcs.orderms.domain.Customer;
import com.vishesh.mcs.orderms.domain.Order;

@Named
@Path("/")
public class RestOrder {
	private static int id = 501;
	@Inject
	private RestTemplate rt;

	@GET
	@Path("order")
	@Produces(MediaType.APPLICATION_JSON)
	public Order submitOrder(@QueryParam("CustID") int CustID, @QueryParam("CarID") int CarID,
			@QueryParam("price") int price) {
		Order order = new Order();
		// id in the query param belongs to id in the customer service/ Class
		Customer customer = rt.getForObject("http://localhost:9090/customer?id={id}", Customer.class, CustID);
		// id in the query param belongs to id in the customer service/ Class
		Car car = rt.getForObject("http://localhost:8080/car?id={id}", Car.class, CarID);
		order.setCustomer(customer);
		order.setCar(car);
		order.setPrice(price);
		order.setDateOrder(new Date());
		order.setId(id);
		id++;
		return order;
	}
}
