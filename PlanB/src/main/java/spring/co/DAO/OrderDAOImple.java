package spring.co.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.co.VO.OrderVO;

public class OrderDAOImple implements OrderDAO {

	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public List<OrderVO> orSeAl(String snum) {
		return ss.selectList("orSeAl", snum);
	}

	@Override
	public void orInOn(OrderVO orderVO) {
		ss.insert("orInOn", orderVO);
	}

	@Override
	public void orDeOn(OrderVO orderVO) {
		ss.delete("orDeOn", orderVO);
	}

}
