package org.hoon.persistence;

import org.hoon.domain.WebBoard;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface WebBoardRepository extends CrudRepository<WebBoard,Long>,QuerydslPredicateExecutor<WebBoard>{
	
}
