package com.jin.common.web;

import java.io.Serializable;
import java.util.Date;

/**
* <p>Description: 响应参数</p>
* @version 1.0 2018/6/11
* @author jin
*/
public class ResponseBody<T> implements Serializable {
	
	/** 
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 5834690634361876970L;
	int code = RESPONSE_CODE.OK.getCode();
	/**
	 * 提示给用户信息
	 */
	String message;
	/**
	 * 提示给开发的信息
	 */
	String errorMessage;

	Date startDate = new Date();

	Date endDate =null;

	long cost=0;

	long length=0;
	/**
	 * 
	 * @param code 返回状态码 1 成功 -1 失败
	 * @param message 返回的提示消息
	 * @param errorMessage 返回的excption 
	 */
	public ResponseBody(int code, String message, String errorMessage){
		this.code = code;
		this.message = message;
		this.errorMessage = errorMessage;
	}

	public ResponseBody(T t){
		setT(t);
	}

	public ResponseBody() {
	}


	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	public static enum RESPONSE_CODE{
		OK(1,"请求成功"),
		FAILURE(-1,"失败");
		private int code;
		private String cnCode;
		RESPONSE_CODE(int code,String cncode){
			this.code = code;
			this.cnCode = cncode;
		}
		
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}

		public String getCnCode() {
			return cnCode;
		}

		public void setCnCode(String cnCode) {
			this.cnCode = cnCode;
		}
	}
	/**
	 * 判断成功
	 * @return
	 */
	public boolean isSuccess(){
		return code== RESPONSE_CODE.OK.getCode();
	}
	
	/**
	 * 判断失败
	 * @return
	 */
	public boolean isFailure(){
		return code== RESPONSE_CODE.FAILURE.getCode();
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "ResponseBody [code=" + code + ", message=" + message
				+ ", errorMessage=" + errorMessage + "]";
	}

	public ResponseBody<T> setTFlowStyle(T t){
		this.t = t;
		return  this;
	}

	public void success(String msg){
		setCode(RESPONSE_CODE.OK.getCode());
		setMessage(msg);
	}
	
	public void error(String msg, String errorMessage){
		setCode(RESPONSE_CODE.FAILURE.getCode());
		setMessage(msg);
		setErrorMessage(errorMessage);
	}

	public void error(String msg){
		setCode(RESPONSE_CODE.FAILURE.getCode());
		setMessage(msg);
		setErrorMessage(msg);
	}

	public ResponseBody returnBody(){
		endDate=new Date();
		cost=endDate.getTime()-startDate.getTime();
		return this;
	}
}
