/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
/*
 * Simple Document class 
 */
public class Document
{
	private String id;
	private String header;
	private String body;
	private String footer;
	
	public Document(String id)
	{
		this.id = id;
		this.footer = "";
		this.header = "";
		this.body = "";
	}
	
	public void print()
	{
		System.out.println(header + "\n\n" + body + "\n\n" + footer);
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getHeader()
	{
		return header;
	}

	public void setHeader(String header)
	{
		this.header = header;
	}

	public String getBody()
	{
		return body;
	}

	public void setBody(String body)
	{
		this.body = body;
	}

	public String getFooter()
	{
		return footer;
	}

	public void setFooter(String footer)
	{
		this.footer = footer;
	}
}
