package org.hoon;

import java.util.stream.IntStream;

import org.hoon.domain.WebBoard;
import org.hoon.persistence.WebBoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
@Commit
public class WebBoardRepositoryTest {

	
	@Autowired
	WebBoardRepository repo;
	
	@Test
	public void insertBoardDummies() {
		IntStream.range(0,300).forEach(i->{
			WebBoard board=new WebBoard();
			
			board.setTitle("Sample Board Title"+i);
			board.setContent("content Sample.."+i+"Of Board");
			board.setWriter("user0"+(i%10));
			
			repo.save(board);
		});
	}
}
