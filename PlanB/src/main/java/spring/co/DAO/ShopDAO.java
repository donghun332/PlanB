package spring.co.DAO;

import java.util.List;

import spring.co.VO.ShopVO;

public interface ShopDAO {

	public void shInOn(ShopVO shopVO); //가게 개시 등록
	public List<ShopVO> shSeAl(int unum); // 사장이 보유한 가게 조회
	
	
}
