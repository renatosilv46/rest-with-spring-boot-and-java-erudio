package br.com.renato;

public class Greeting {

	//Attributes
	private final long id;
	private final String content;
	
	//Constructor
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	//Getters and Setters
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
