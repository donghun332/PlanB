package spring.co.DAO;

import java.util.List;

import spring.co.VO.UserVO;

public interface UserDAO {

	public List<UserVO> usSeAl(); // 관리자 권한 회원 조회
	public UserVO usSeOn(UserVO userVO); // 개인 유저 검색
	public void usDeOn(UserVO userVO);
	public void usInOn(UserVO userVO);
	public void usUpOn(UserVO userVO);
}
