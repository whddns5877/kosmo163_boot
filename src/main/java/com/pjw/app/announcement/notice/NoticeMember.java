package com.pjw.app.announcement.notice;

import java.util.List;

public interface NoticeMember {

	
	//list
	public  List<NoticeDTO> list()throws Exception;
	
	//detail
	public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception;
	//create
	public int create(NoticeDTO noticeDTO)throws Exception;
	//update
	public int update(NoticeDTO noticeDTO)throws Exception;
	//delete
	public int delete(NoticeDTO noticeDTO)throws Exception;
}
