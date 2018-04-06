package org.hoon.repository;

import org.hoon.domain.PDSBoard;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PDSBoardRepository extends CrudRepository<PDSBoard,Long> {
	@Modifying
	@Query("UPDATE FROM PDSFile f set f.pdsfile=?2 WHERE f.fno=?1")
	public int updatePDSFile(Long fno,String newFileName);
}
