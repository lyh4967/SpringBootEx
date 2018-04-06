package org.hoon;

import java.util.Collection;

import org.hoon.domain.Board;
import org.hoon.persistence.BoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExApplicationTests {

	@Autowired
	private BoardRepository repo;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testInsert200() {
		for(int i=1;i<=200;i++) {
			Board board=new Board();
			board.setTitle("제목.."+i);
			board.setContent("내용..."+i+"채우기");
			board.setWriter("User0"+(i%10));
			repo.save(board);
		}
	}
	
	@Test
	public void testByTitle() {
		repo.findBoardByTitle("제목..177")
		.forEach(board->System.out.println(board));
	}
	
	@Test
	public void testByWriter() {
		Collection<Board> results=repo.findByWriter("user00");
		results.forEach(board->System.out.println(board));
	}
	
	@Test
	public void testByWriterContaining() {
		Collection<Board> results=repo.findByWriterContaining("05");
		results.forEach(board->System.out.println(board));
	}

}
