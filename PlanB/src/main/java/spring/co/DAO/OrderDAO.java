package spring.co.DAO;

import java.util.List;

import spring.co.VO.OrderVO;

public interface OrderDAO {

	public List<OrderVO> orSeAl(String snum); // 가게별 주문 내역
	public void orInOn(OrderVO orderVO);// 가게 주문 등록
	public void orDeOn(OrderVO orderVO); // 가게 주문 취소
}
