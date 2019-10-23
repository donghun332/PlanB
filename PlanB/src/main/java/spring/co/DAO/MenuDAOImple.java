package spring.co.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.co.VO.MenuVO;

public class MenuDAOImple implements MenuDAO {

	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public List<MenuVO> meSeAl(String cord) {
		return ss.selectList("meSeAl", cord);
	}

	@Override
	public void meInOn(MenuVO menuVO) {
		ss.insert("meInOn", menuVO);
	}

	@Override
	public void meDeOn(MenuVO menuVO) {
		ss.delete("meDeOn", menuVO);
	}

	@Override
	public void meUpOn(MenuVO menuVO) {
		ss.update("meUpOn", menuVO);
	}

}
