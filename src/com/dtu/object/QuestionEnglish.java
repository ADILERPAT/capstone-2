/**
 * 
 */
package com.dtu.object;

/**
 * @author dinh.vandinh
 *
 */

public class QuestionEnglish {
	private int id;
	private String result;
	private byte[] image;
	private int Isimage;
	
	public QuestionEnglish(){}
	
	public QuestionEnglish(int _id, String _result,int _Isimage)
	{
		this.id = _id;
		this.result = _result;
		this.Isimage = _Isimage;		
	}
	public int getId()
	{
		return this.id;
	}
	public void setId(int _id)
	{
		this.id = _id;
	}
	public String getResult()
	{
		return this.result;
	}
	public void setResult(String _result)
	{
		this.result = _result;		
	}
	public int getIsimage()
	{
		return this.Isimage;
	}
	public void setIsimage(int _isimage)
	{
		this.Isimage = _isimage;
	}
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] imageQuestion) {
		this.image = imageQuestion;
	}
}
