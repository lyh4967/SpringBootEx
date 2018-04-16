package org.hoon;

import static org.junit.Assert.fail;

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

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Autowired
	WebBoardRepository repo;
}
