package spring.co.DAO;

import java.util.List;

import spring.co.VO.OrderdetailVO;

public interface OrderdetailDAO {

	public List<OrderdetailVO> odSetaAl(String tnum);
	// 테이블 별 주문내역 확인
	public OrderdetailVO odSenuOn(String onum);
	// 주문 번호로 주문 확인 
	
	public void odInOn(OrderdetailVO orderdetailVO); // 주문 등록
	public void odDeOn(OrderdetailVO orderdetailVO); // 주문 삭제
}
