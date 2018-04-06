package org.hoon.repository;


import java.util.List;

import org.hoon.domain.FreeBoard;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FreeBoardRepository extends CrudRepository<FreeBoard,Long> {
	public List<FreeBoard> findByBnoGreaterThan(Long bno,Pageable page);
	
	@Query("SELECT b.bno, b.title, count(r) FROM FreeBoard b LEFT OUTER JOIN b.replies r "
			+ "WHERE b.bno>0 GROUP BY b")
	public List<Object[]> getPage(Pageable page);
	
	@Query("SELECT * FROM tbl_free_replies where board_bno=200 order by rno desc")
	public List<Object[]> test1(Pageable page);
}
