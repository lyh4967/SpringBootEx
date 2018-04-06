package org.hoon.persistence;

import java.util.Collection;
import java.util.List;

import org.hoon.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board,Long>{
		public List<Board> findBoardByTitle(String title);
		
		public Collection<Board> findByWriter(String writer);
		
		public Collection<Board> findByWriterContaining(String writer);
}
