package spring.co.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.co.VO.OrderdetailVO;

public class OrderdetailDAOImple implements OrderdetailDAO {

	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public List<OrderdetailVO> odSetaAl(String tnum) {
		return ss.selectList("odSetaAl", tnum);
	}

	@Override
	public OrderdetailVO odSenuOn(String onum) {
		return ss.selectOne("odSenuOn", onum);
	}

	@Override
	public void odInOn(OrderdetailVO orderdetailVO) {
		ss.insert("odInOn", orderdetailVO);
	}

	@Override
	public void odDeOn(OrderdetailVO orderdetailVO) {
		ss.delete("odDeOn", orderdetailVO);
	}

}
