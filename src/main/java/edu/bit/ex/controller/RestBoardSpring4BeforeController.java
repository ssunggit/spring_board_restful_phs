package edu.bit.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.extern.log4j.Log4j;
// spring v4.0 이전버전 (@Controller+@ResponseBody)
@Log4j
@Controller
public class RestBoardSpring4BeforeController {
	
    @Autowired
    private BoardService boardService;
	
    @ResponseBody // 메서드의 리턴타입을 기존과 다르게 처리한다는 것을 명시
	@GetMapping("/rest/before")
	public List<BoardVO> restBefore(Model model) {
	    log.info("restBefore()..");
	   
	    List<BoardVO> list = boardService.getList();
	    
	    model.addAttribute("list",list);

	    return list; // 자바 객체를 리턴 -> 웹브라우저가 읽을 수 없음.
	                 // 자바객체를 JSON 으로 만들어주는 주체: (pom.xml)jackson
	}
    

	
}
