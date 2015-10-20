package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	
	
	
	@Test
	public void whenGameHasJustStartedThenScoreShouldBe_love_all()
	{
		TennisGame tennisGame = new TennisGame();
		Assert.assertEquals(tennisGame.getScore(), "Love-All");
	}
	
	@Test
	public void isServerHasScoredOnTimeAndReceiverHasNotScoredThenScoreShouldBe_Fifteen_Love()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScore();
		Assert.assertEquals(tennisGame.getScore(), "Fifteen-Love");
	}
}