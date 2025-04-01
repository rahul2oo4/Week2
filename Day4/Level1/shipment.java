
class Order {
	int orderId;
	String orderDate;

	Order(int orderId, String orderDate) {
    	this.orderId = orderId;
    	this.orderDate = orderDate;
	}

	String getOrderStatus() {
    	return "Order Placed";
	}

	void showDetails() {
    	System.out.println("Order ID: " + orderId);
    	System.out.println("Order Date: " + orderDate);
	}
}

class ShippedOrder extends Order {
	String trackingNumber;

	ShippedOrder(int orderId, String orderDate, String trackingNumber) {
    	super(orderId, orderDate);
    	this.trackingNumber = trackingNumber;
	}

	@Override
	String getOrderStatus() {
    	return "Order Shipped";
	}

	@Override
	void showDetails() {
    	super.showDetails();
    	System.out.println("Tracking No: " + trackingNumber);
	}
}

class DeliveredOrder extends ShippedOrder {
	String deliveryDate;

	DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
    	super(orderId, orderDate, trackingNumber);
    	this.deliveryDate = deliveryDate;
	}

	@Override
	String getOrderStatus() {
    	return "Order Delivered";
	}

	@Override
	void showDetails() {
    	super.showDetails();
    	System.out.println("Delivery Date: " + deliveryDate);
	}
}

public class shipment {
	public static void main(String[] args) {
    	Order o = new Order(101, "2025-04-11");
    	ShippedOrder so = new ShippedOrder(102, "2025-04-10", "TRK12345");
    	DeliveredOrder do1 = new DeliveredOrder(103, "2025-04-09", "TRK54321", "2025-04-11");

         	o.showDetails();
    	System.out.println("Status: " + o.getOrderStatus());
 
    	so.showDetails();
    	System.out.println("Status: " + so.getOrderStatus());

        	do1.showDetails();
    	System.out.println("Status: " + do1.getOrderStatus());
	}
}

