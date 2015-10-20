package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame tennisGame; 
	
	@Before
	public void newTennisGame()
	{
		this.tennisGame= new TennisGame();
	}
	
	@Test
	public void testDeLenferSuperLongQuiCouvrePresqueTousLesCas()
	{
		Assert.assertEquals(this.tennisGame.getScore(), "Love-All");
		this.tennisGame.serverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Fifteen-Love");
		this.tennisGame.receiverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Fifteen-All");
		this.tennisGame.receiverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Fifteen-Thirty");
		this.tennisGame.receiverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Fifteen-Forty");
		this.tennisGame.receiverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Fifteen-Game");
		this.tennisGame = new TennisGame();
		this.tennisGame.receiverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Love-Fifteen");
		this.tennisGame.serverScore();
		this.tennisGame.serverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Thirty-Fifteen");
		this.tennisGame.serverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Forty-Fifteen");
		this.tennisGame.serverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Game-Fifteen");
		
	}
}