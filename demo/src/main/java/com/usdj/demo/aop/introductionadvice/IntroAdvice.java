package com.usdj.demo.aop.introductionadvice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-13 22:40
 **/
@Component
public class IntroAdvice extends DelegatingIntroductionInterceptor implements Drinking{

	@Override
	public void drink(String liquid) {
		System.out.println("Drinking " + liquid);
	}

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		return super.invoke(mi);
	}
}
