package com.huoxin4415.restfulsql.framework;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class EnableRestfulSQLCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 获取带有EnableRestfulSQL注解的类
		String[] beanNames = context.getBeanFactory().getBeanNamesForAnnotation(EnableRestfulSQL.class);
		return null != beanNames && beanNames.length > 0;
	}

}
