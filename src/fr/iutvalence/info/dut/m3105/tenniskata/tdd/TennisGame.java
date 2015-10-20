package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;

public class TennisGame
{
	private String score;
	
	
	TennisGame(){
		
		this.score = "0-0";
	}

	public String getScore() 
	{
		if (score == "15-0"){
			return "Fifteen-Love";
		}
		
		if (score == "0-15"){
			return "Love-Fifteen";
		}
		return "Love-All";
	}

	
	public void serverScore()
	{
		this.score = "15-0";
	}
	
	public void noneServerScore()
	{
		this.score = "0-15";
	}
}
