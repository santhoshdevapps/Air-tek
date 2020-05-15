package utils;

import java.util.Comparator;

import base.OrderDetail;

public class OrderComparator implements Comparator<OrderDetail> {

	@Override
	public int compare(OrderDetail o1, OrderDetail o2) {
		return (o1.getPriority()).compareTo(o2.getPriority());
	}

}
