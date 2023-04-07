package org.zerock.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//테스트 프로그램을 지정
@RunWith(SpringJUnit4ClassRunner.class)
//설정 파일을 불러와서 적용시킨다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {

	// @Inject - java DI, @Autowired - Spring, @Setter - lombok : Spring Autowired을 사용한다.
	@Setter(onMethod_ = {@Autowired})
	private BoardServiceImpl service;
	
	@Test
	public void testExist() {
		log.info("\n 서비스 테스트-------------------------------------");
		log.info(service);
//		log.info(service.getDao());
	}
	
}
