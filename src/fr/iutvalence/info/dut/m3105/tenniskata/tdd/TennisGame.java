package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;

public class TennisGame
{
	private int score1 =0;
	private int score2 =0;

	public String getScore() 
	{
		if (score1 == 15){
			return "Fifteen-Love";
		}
		return "Love-All";
	}

	
	public void serverScore()
	{
		this.score1 += 15;
	}
}
