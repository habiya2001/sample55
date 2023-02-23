//11. 작업.txt
package com.woori.study06;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.woori.study06.VO.ProductVO;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	/* 리턴타입이 void인 경우 */
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called............................");
	}

	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called............................");
	}

	/* 리턴타입이 String인 경우 */
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		logger.info("doC called............................");
		return "result";
	}

	/* 만들어진 결과 데이터를 뷰에 전달해야 할 경우 */
	@RequestMapping("doD")
	public String doD(Model model) {
		ProductVO product = new ProductVO("marshmello", 5000);
		logger.info("doD called............................");
		model.addAttribute(product);
		return "productDetail";

	}

	/* 리다이렉트를 해야하는 경우 */
	
	
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		logger.info("doE called............................");
		rttr.addFlashAttribute("msg", "This is the Messgae! with redirected");
		return "redirect:/doF";
	}

	@RequestMapping("doF")
	public void doF(String msg) {
		logger.info("doF called............................" + msg);
	}
}
