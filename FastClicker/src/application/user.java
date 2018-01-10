package application;

public class User {

	
	
	private String user;
	private int score;
	
	
	public User(String user, int score)
	{
		super();
		this.user = user;
		this.score = score;
	}
	
	public String getUserName()
	{
		return user;
		
	}
	
	public void setUserName(String user)
	{
		this.user = user;
		
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	@Override
	public String toString()
	{
		return "User:" +user+ "Score:"+score;
	}
	
	
}
