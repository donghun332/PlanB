package spring.co.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.co.VO.BankVO;

public class BankDAOImple implements BankDAO {

	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<BankVO> baSeAl() {
		return ss.selectList("baSeAl");
	}

	@Override
	public BankVO baSeOn(BankVO bankVO) {
		return ss.selectOne("baSeOn", bankVO);
	}

	@Override
	public void baInOn(BankVO bankVO) {
		ss.insert("baInOn", bankVO);
	}

	@Override
	public void baDeOn(BankVO bankVO) {
		ss.delete("baDeOn", bankVO);
	}

	@Override
	public void baUpOn(BankVO bankVO) {
		ss.update("baUpOn", bankVO);
	}

}
