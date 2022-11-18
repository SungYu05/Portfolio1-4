package site.metacoding.firstapp.domain;

import java.util.List;


public interface OrdersDao {
	public void insert(Orders orders);
	public void update(Orders orders);
	public List<Orders> findAll(Integer userId); // 주문 후 수량 // userId 받는 거로 변경
	public Orders findById(Integer orderId);
	public void deleteById(Integer orderId);
	
	// 추가
	public void orderUpdatebyProductQty(Orders orders);

}
