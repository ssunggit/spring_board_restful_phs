package edu.bit.ex.service;


import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@Getter
@Setter
@NoArgsConstructor // 디폴트 생성자 만들기!
@AllArgsConstructor
@ToString
public class BoardServiceImpl implements BoardService{
    
    @Autowired
    private BoardMapper boardMapper;
    
    @Override
    public List<BoardVO> getList() {
       log.info("Service: getList()..");
       return boardMapper.getList();
    }
    
    @Override
    public BoardVO read(int bid) {
       return boardMapper.read(bid);
    }
   
	
}
