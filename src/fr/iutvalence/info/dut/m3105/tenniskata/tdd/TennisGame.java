package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import java.lang.reflect.Array;

import org.junit.Assert;

public class TennisGame
{
	private int serverPoints;
	private int receiverPoints;
	
	private static final String[] SCORE = { "Love" , "Fifteen" , "Thirty" , "Forty" , "Game" };	
	
	public TennisGame()
	{	
		this.serverPoints = 0;
		this.receiverPoints = 0;
	}

	public String getScore() 
	{

		if (serverPoints != receiverPoints)
		{
			return SCORE[serverPoints]+"-"+SCORE[receiverPoints];

		}
		return SCORE[serverPoints]+"-All";
	}
	
	public void serverScore()
	{

		this.serverPoints++;
	}

	public void receiverScore() 
	{
		this.receiverPoints++;

	}
}

