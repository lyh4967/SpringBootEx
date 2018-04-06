package org.hoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hoon.domain.PDSBoard;
import org.hoon.domain.PDSFile;
import org.hoon.repository.PDSBoardRepository;
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
public class PDSBoardTest {

	@Autowired
	PDSBoardRepository repo;
	
	@Test
	public void test() {
		PDSBoard pds=new PDSBoard();
		pds.setPname("DOCUMENT 1-2");

		PDSFile file1=new PDSFile();
		file1.setPdsfile("file1.doc");
		
		PDSFile file2=new PDSFile();
		file2.setPdsfile("file2.doc");
		
		PDSFile file3=new PDSFile();
		file3.setPdsfile("file3.doc");
		List<PDSFile> list = new ArrayList<PDSFile>();
		list.add(file1);
		list.add(file2);
		list.add(file3);
		System.out.println(list.toString());
		pds.setFiles(list);
		log.info("try to save pds");
		
		repo.save(pds);
	}
	@Test
	public void testUpdateFile() {
		Optional<PDSBoard> result=repo.findById(5L);
		String newName="수정된2";
		result.ifPresent(pds->{
			log.info("데이터가 존재하므로update시도");
			PDSFile target=new PDSFile();
			target.setFno(13L);
			target.setPdsfile(newName);
			
			int idx=pds.getFiles().indexOf(target);
			if(idx>-1) {
				List<PDSFile> list=pds.getFiles();
				list.remove(idx);
				list.add(target);
				pds.setFiles(list);
			}
			repo.save(pds);
			
		});
	}

}
