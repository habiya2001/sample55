package com.woori.study06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woori.study06.VO.ProductVO;

@Controller
public class JSONController {
	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO product = new ProductVO("marshmello", 5000);
		return product;
	}
}
