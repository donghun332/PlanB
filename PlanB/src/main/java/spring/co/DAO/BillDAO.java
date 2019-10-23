package spring.co.DAO;

import java.util.List;

import spring.co.VO.BillVO;

public interface BillDAO {
	
	public List<BillVO> biSeAl(BillVO billVO); //개인 입출금내역
	public void biInOn(BillVO billVO); // 입출금 내용 변동시 업데이트
}
