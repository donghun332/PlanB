package spring.co.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.co.VO.BillVO;

public class BillDAOImple implements BillDAO {

	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public List<BillVO> biSeAl(BillVO billVO) {
		// TODO Auto-generated method stub
		return ss.selectList("biSeAl", billVO);
	}

	@Override
	public void biInOn(BillVO billVO) {
		ss.insert("biInOn", billVO);
	}

}
