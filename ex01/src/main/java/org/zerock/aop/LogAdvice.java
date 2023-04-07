package org.zerock.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect
@Log4j
@Component
public class LogAdvice {
	
	// 실행 전 후에 처리를 선언해서 동작 시키는 것을 의미 : @Around
	@Around("execution(* org.zerock.*.service.*ServiceImpl.*(..))")
	public Object logTime(ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		
		log.info("\n+=========================================================================================================+");
		
		// 실행하는 클래스
		log.info(" * 실행 객체 : " + pjp.getTarget());
		log.info(" * 실행 메서드 : " + pjp.getSignature());

		// 넘어가는 데이터
		log.info(" * 전달 데이터 : " + Arrays.toString(pjp.getArgs()));
		
		// 처리하는 내용
		// 처리 결과 저장 객체
		Object result = null;
		
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log.info(" * 처리 결과 데이터 : " + result);
		
		long end = System.currentTimeMillis();
		
		log.info("Time : " + (end - start));

		log.info("\n+=========================================================================================================+");
		
		return result;
	}
	
}
