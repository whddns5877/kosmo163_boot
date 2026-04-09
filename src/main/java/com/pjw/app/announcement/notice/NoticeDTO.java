package com.pjw.app.announcement.notice;

import java.time.LocalDateTime;

public class NoticeDTO {
	
	private Long announcementNum;
	private String announcementTitle;
	private String announcementWriter;
	private LocalDateTime announcementDate;
	private Long announcementHit;
	public Long getAnnouncementNum() {
		return announcementNum;
	}
	public void setAnnouncementNum(Long announcementNum) {
		this.announcementNum = announcementNum;
	}
	public String getAnnouncementTitle() {
		return announcementTitle;
	}
	public void setAnnouncementTitle(String announcementTitle) {
		this.announcementTitle = announcementTitle;
	}
	public String getAnnouncementWriter() {
		return announcementWriter;
	}
	public void setAnnouncementWriter(String announcementWriter) {
		this.announcementWriter = announcementWriter;
	}
	public LocalDateTime getAnnouncementDate() {
		return announcementDate;
	}
	public void setAnnouncementDate(LocalDateTime announcementDate) {
		this.announcementDate = announcementDate;
	}
	public Long getAnnouncementHit() {
		return announcementHit;
	}
	public void setAnnouncementHit(Long announcementHit) {
		this.announcementHit = announcementHit;
	}
}
