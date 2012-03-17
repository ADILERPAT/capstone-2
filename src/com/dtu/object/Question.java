/**
 * 
 */
package com.dtu.object;

/**
 * @author dinh.vandinh
 *
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class Question implements Serializable{
	
	private int id;
	private String content;
	private int result;
	
	public Question(){}
	public Question(int _ID,String _content,int _result)
	{
		this.content=_content;
		this.result=_result;
		this.id=_ID;
	}
	
	public int getID() {
		return id;
	}
	public void setID(int _ID) {
		this.id = _ID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String _content) {
		this.content = _content;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int _result) {
		this.result = _result;
	}

}
