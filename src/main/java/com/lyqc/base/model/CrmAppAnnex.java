package com.lyqc.base.model;


import com.lyqc.base.entity.BaseEntity;

/**
 * @description: 申请单附件实体类
 * @Date : 2018/1/3 下午8:48
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public class CrmAppAnnex extends BaseEntity {
	private static final long serialVersionUID = -7423745352958435959L;
	private String appCode;
	private String annexName;
	private String annexAddress;
	private Long userId;
	private String userName;
	private Integer status;
	private String remarks;
	private Integer annexType;
	private String fileCode;

	public CrmAppAnnex() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * APP_CODE String(30) NOTNULL //
	 */
	public String getAppCode() {
		return appCode;
	}

	/**
	 * APP_CODE String(30) NOTNULL //
	 */
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	/**
	 * ANNEX_NAME String(30) NOTNULL //
	 */
	public String getAnnexName() {
		return annexName;
	}

	/**
	 * ANNEX_NAME String(30) NOTNULL //
	 */
	public void setAnnexName(String annexName) {
		this.annexName = annexName;
	}

	/**
	 * ANNEX_ADDRESS String(200) NOTNULL //
	 */
	public String getAnnexAddress() {
		return annexAddress;
	}

	/**
	 * ANNEX_ADDRESS String(200) NOTNULL //
	 */
	public void setAnnexAddress(String annexAddress) {
		this.annexAddress = annexAddress;
	}

	/**
	 * USER_ID Long(10) NOTNULL //
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * USER_ID Long(10) NOTNULL //
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * USER_NAME String(20) //
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * USER_NAME String(20) //
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * STATUS Integer(3) //1 有效 0 无效 默认1
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * STATUS Integer(3) //1 有效 0 无效 默认1
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * REMARKS String(1000) //
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * REMARKS String(1000) //
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * ANNEX_TYPE Integer(3) //
	 */
	public Integer getAnnexType() {
		return annexType;
	}

	/**
	 * ANNEX_TYPE Integer(3) //
	 */
	public void setAnnexType(Integer annexType) {
		this.annexType = annexType;
	}

	public String getFileCode() {
		return fileCode;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}
	
}