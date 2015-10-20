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
	public void whenGameHasJustStartedThenScoreShouldBe_love_all()
	{
		Assert.assertEquals(this.tennisGame.getScore(), "Love-All");
	}
	
	@Test
	public void isServerHasScoredOnTimeAndReceiverHasNotScoredThenScoreShouldBe_Fifteen_Love()
	{
		this.tennisGame.serverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Fifteen-Love");
	}
	
	@Test
	public void isReceiverHasScoredOnTimeAndServerHasNotScoredThenScoreShouldBe_Love_Fifteen()
	{
		this.tennisGame.receiverScore();
		Assert.assertEquals(this.tennisGame.getScore(), "Love-Fifteen");
	}
}