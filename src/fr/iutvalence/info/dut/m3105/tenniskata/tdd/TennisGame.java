package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;

public class TennisGame
{
	private String score;
	
	
	public TennisGame()
	{	
		this.score = "Love-All";
	}

	public String getScore() 
	{
		return this.score;
	}
	
	public void serverScore()
	{
		this.score = "Fifteen-Love";
	}
}

