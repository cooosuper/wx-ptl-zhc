package org.wxportal.dao.bean;

/**
 * 回复图片信息
 * @author HanWei
 *
 */
public class RespImageBean {
	
	private int id;//标示唯一主键
	
	private String reqKey;//请求的Key
	
	private String Content;//回复的内容
	
	private int wxAccountId;//此定义关联的微信号

	public RespImageBean(){}
	
	public RespImageBean(int id, String reqKey, String content,
			int wxAccountId) {
		super();
		this.id = id;
		this.reqKey = reqKey;
		Content = content;
		this.wxAccountId = wxAccountId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReqKey() {
		return reqKey;
	}

	public void setReqKey(String reqKey) {
		this.reqKey = reqKey;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public int getWxAccountId() {
		return wxAccountId;
	}

	public void setWxAccountId(int wxAccountId) {
		this.wxAccountId = wxAccountId;
	}

}
