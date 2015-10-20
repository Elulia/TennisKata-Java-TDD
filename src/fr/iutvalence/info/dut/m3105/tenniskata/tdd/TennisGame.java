package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;

public class TennisGame
{
	
	

	public static String getScore(int score1, int score2) 
	{
		if (score1 == 0 && score2 == 0)
		{
			return "Love-All";
		}
		
		return null;
	}
	
}
