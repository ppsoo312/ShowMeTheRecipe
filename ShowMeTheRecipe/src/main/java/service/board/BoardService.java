package service.board;

import java.util.List;

import common.Paging;
import dao.board.BoardDAO;
import dao.member.MemberDAO;
import vo.board.BoardVO;

public class BoardService {

	public MemberDAO memberDao;
	
	public void setBoardDao(BoardDAO boardDao) {
		this.boardDao = boardDao;
	}
	public void setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public List<BoardVO> selectList(Paging paging){
		List<BoardVO> list = boardDao.selectList(paging);
		
		if(list.isEmpty()) {
			System.out.println(list);
			list = null;
		}
		
		return list;
	}
	
	public BoardVO selectOne(int seq) {
		return boardDao.selectOne(seq);
	}
	
	public int getTotal() {
		return boardDao.getTotal();
	}
	
	
	public int insert(BoardVO vo) {
		return boardDao.insert(vo);
	}
	
	public BoardVO selectSeq(int seq) {
		
		return boardDao.selectSeq(seq);
		
	}
	
	
	
}
