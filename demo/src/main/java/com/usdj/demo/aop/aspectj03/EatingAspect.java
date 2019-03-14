package com.usdj.demo.aop.aspectj03;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-14 18:59
 **/
@Aspect
@Component
public class EatingAspect {

	@DeclareParents(value = "com.usdj.demo.aop.aspectj03.EatingImpl", defaultImpl = DrinkingImpl.class)
	private Drinking drinking;
}
