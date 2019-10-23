package spring.co.DAO;

import java.util.List;

import spring.co.VO.BankVO;

public interface BankDAO {

	public List<BankVO> baSeAl(); // 관리자 권한으로 가입된 전체 계좌 조회
	public BankVO baSeOn(BankVO bankVO); //개인 계좌 조회
	public void baInOn(BankVO bankVO); // 개인 계좌 생성
	public void baDeOn(BankVO bankVO); // 개인 계좌 삭제
	public void baUpOn(BankVO bankVO); // 개인 계좌 입금 출금
}
