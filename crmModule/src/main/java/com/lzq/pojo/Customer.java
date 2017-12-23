package com.lzq.pojo;

import java.util.Date;

/**
 * 核心模块： 客户资料
 */
public class Customer {

	private Long id;		// 编号
	private String name;	// 客户名称
	private boolean sex;	// 性别    true 男，  false 女
	private Date birth;   // 客户生日
	private String tel;		// 客户电话
	private String email;   // 客户邮箱
	private String address; // 客户地址
	private Integer status;		// 0,作废（放入资源池）; 1，正常
	private Integer tracecount; // 跟进次数

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTracecount() {
		return tracecount;
	}

	public void setTracecount(Integer tracecount) {
		this.tracecount = tracecount;
	}
}
