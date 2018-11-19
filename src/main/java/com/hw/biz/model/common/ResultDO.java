package com.hw.biz.model.common;

import java.io.Serializable;

public class ResultDO<T> implements Serializable {

	private static final long serialVersionUID = -4505817075784129836L;

	private T resultObject;

	private Boolean isSuccess;

	private String message;

	public T getResultObject() {
		return resultObject;
	}

	public void setResultObject(T resultObject) {
		this.resultObject = resultObject;
	}

	public Boolean getSuccess() {
		return isSuccess;
	}

	public void setSuccess(Boolean success) {
		isSuccess = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
