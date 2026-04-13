package com.pjw.app.announcement.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pjw.app.announcement.page.Pager;

@Mapper
public interface NoticeMepper {

	

	public Long getCount()throws Exception;
	
	//list
	public List<NoticeDTO> list(Pager pager)throws Exception;
	
	//detail
	public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception;
	
	//create
	public int create(NoticeDTO noticeDTO)throws Exception;
	
	//update
	public int update(NoticeDTO noticeDTO)throws Exception;
	
	//delete
	public int delete(NoticeDTO noticeDTO)throws Exception;

}