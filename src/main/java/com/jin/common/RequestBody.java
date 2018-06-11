package com.jin.common;

import java.io.Serializable;

/**
* <p>Description: 请求参数</p>
* @version 1.0 2018/6/11
* @author jin
*/
public class RequestBody<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1431240693287545582L;

	private T t;
	private String ip;
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "RequestBody [t=" + t + ", ip=" + ip + "]";
	}
	
}
