package org.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
// 자동 생성 어노테이션 - @Controller - 컨트롤러, @Service - 서비스, @Repository - 저장소(DAO), 
//                  @Component - 이외의 자동생성이 필요한 구성체, @RestController, @Advice - 예외처리 -> Servlet-context.xml에 선언(URL 관련)
//                  그 외 어노테이션 - root-context.xml에 선언 (URL 미관련)
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		System.out.println(formattedDate);
		logger.info(formattedDate);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
