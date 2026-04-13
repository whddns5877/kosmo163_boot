package com.pjw.app.announcement.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjw.app.announcement.page.Pager;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping
public class NoticeController {


	@Autowired
	private NoticeService noticeService;

    
	
	@GetMapping("list")
	public String list(Pager pager, Model model)throws Exception{
		List<NoticeDTO> ar = noticeService.list(pager);
		
		return "board/list";
	}

}