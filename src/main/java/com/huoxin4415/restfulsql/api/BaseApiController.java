package com.huoxin4415.restfulsql.api;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huoxin4415.restfulsql.framework.EnableRestfulSQLCondition;

@Conditional(EnableRestfulSQLCondition.class)
@Controller
public class BaseApiController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
}
