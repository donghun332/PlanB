package spring.co.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.co.VO.UserVO;

public class UserDAOImple implements UserDAO {

	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public List<UserVO> usSeAl() {
		return ss.selectList("usSeAl");
	}

	@Override
	public UserVO usSeOn(UserVO userVO) {
		return ss.selectOne("usSeOn", userVO);
	}

	@Override
	public void usDeOn(UserVO userVO) {
		ss.delete("usDeOn", userVO);
	}

	@Override
	public void usInOn(UserVO userVO) {
		ss.insert("usInOn", userVO);

	}

	@Override
	public void usUpOn(UserVO userVO) {
		ss.update("usUpOn", userVO);
	}

}
