package com.jubaka.sors.protocol.http;

import java.io.Serializable;

import org.jnetpcap.protocol.tcpip.Http.Response;

public class HTTPResponse extends HTTP implements Serializable {
	private String Accept_Ranges;

    private String Age;
    
    private String Allow; 
   
    private String Cache_Control; 
    
    private String Content_Disposition;
    
    private String Content_Encoding; 
    
    private String Content_Length; 
    
    private String Content_Location; 
    
    private String Content_MD5; 
    
    private String Content_Range; 
    
    private String Content_Type; 
    
    private String Expires; 
   
    private String RequestUrl;
    
    private String RequestVersion; 
    
    private String ResponseCode; 
    
    private String ResponseCodeMsg; 

    private String Server; 

    private String Set_Cookie; 

	public HTTPResponse() {
		
	}

	public String getAccept_Ranges() {
		return Accept_Ranges;
	}

	public void setAccept_Ranges(String accept_Ranges) {
		Accept_Ranges = accept_Ranges;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getAllow() {
		return Allow;
	}

	public void setAllow(String allow) {
		Allow = allow;
	}

	public String getCache_Control() {
		return Cache_Control;
	}

	public void setCache_Control(String cache_Control) {
		Cache_Control = cache_Control;
	}

	public String getContent_Disposition() {
		return Content_Disposition;
	}

	public void setContent_Disposition(String content_Disposition) {
		Content_Disposition = content_Disposition;
	}

	public String getContent_Encoding() {
		return Content_Encoding;
	}

	public void setContent_Encoding(String content_Encoding) {
		Content_Encoding = content_Encoding;
	}

	public String getContent_Length() {
		return Content_Length;
	}

	public void setContent_Length(String content_Length) {
		Content_Length = content_Length;
	}

	public String getContent_Location() {
		return Content_Location;
	}

	public void setContent_Location(String content_Location) {
		Content_Location = content_Location;
	}

	public String getContent_MD5() {
		return Content_MD5;
	}

	public void setContent_MD5(String content_MD5) {
		Content_MD5 = content_MD5;
	}

	public String getContent_Range() {
		return Content_Range;
	}

	public void setContent_Range(String content_Range) {
		Content_Range = content_Range;
	}

	public String getContent_Type() {
		return Content_Type;
	}

	public void setContent_Type(String content_Type) {
		Content_Type = content_Type;
	}

	public String getExpires() {
		return Expires;
	}

	public void setExpires(String expires) {
		Expires = expires;
	}

	public String getRequestUrl() {
		return RequestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		RequestUrl = requestUrl;
	}

	public String getRequestVersion() {
		return RequestVersion;
	}

	public void setRequestVersion(String requestVersion) {
		RequestVersion = requestVersion;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public String getResponseCodeMsg() {
		return ResponseCodeMsg;
	}

	public void setResponseCodeMsg(String responseCodeMsg) {
		ResponseCodeMsg = responseCodeMsg;
	}

	public String getServer() {
		return Server;
	}

	public void setServer(String server) {
		Server = server;
	}

	public String getSet_Cookie() {
		return Set_Cookie;
	}

	public void setSet_Cookie(String set_Cookie) {
		Set_Cookie = set_Cookie;
	}
	
}
