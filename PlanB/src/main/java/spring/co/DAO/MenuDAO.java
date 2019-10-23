package spring.co.DAO;

import java.util.List;

import spring.co.VO.MenuVO;

public interface MenuDAO {

	public List<MenuVO> meSeAl(String cord); // 코드별 메뉴 조회
	public void meInOn(MenuVO menuVO); // 메뉴 등록
	public void meDeOn(MenuVO menuVO); // 메뉴 삭제
	public void meUpOn(MenuVO menuVO); // 메뉴 수정
}
