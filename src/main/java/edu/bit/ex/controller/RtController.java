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
import org.springframework.web.bind.annotation.RestController;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.extern.log4j.Log4j;
// spring v4.0 에서 부터
// @RestController 라는 어노테이션을 추가해서 해당
// Controller 의 모든 메서드의 리턴타입을 기존과 다르게 처리한다는 것을 명시
@RestController
@Log4j
public class RtController {
	
    @Autowired
    private BoardService boardService;
    private BoardVO boardVO;
	
    // 숙제
    @RequestMapping("/rest/{bid}")
    public BoardVO rest1(@PathVariable("bid") int bid){
       log.info("/rest/{bid}..");
       
       
       
       return boardService.read(bid);
       
    }
   
   
}
