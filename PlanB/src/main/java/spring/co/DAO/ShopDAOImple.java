package spring.co.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.co.VO.ShopVO;

public class ShopDAOImple implements ShopDAO {

	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public void shInOn(ShopVO shopVO) {
		ss.insert("shInOn", shopVO);
	}

	@Override
	public List<ShopVO> shSeAl(int unum) {
		return ss.selectList("shSeAl", unum);
	}

}
