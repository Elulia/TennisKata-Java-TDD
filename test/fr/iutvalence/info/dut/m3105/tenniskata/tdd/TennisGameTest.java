package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void firstTestGetScore()
	{
		TennisGame tennisGame= new TennisGame();
		Assert.assertEquals(tennisGame.getScore(), "Love-All");
	}
	
	@Test
	public void secondTestGetScore()
	{
		TennisGame tennisGame= new TennisGame();
		tennisGame.serverScore();
		Assert.assertEquals(tennisGame.getScore(), "Fifteen-Love");

	}
	
	@Test
	public void thirdTestGetScore()
	{
		TennisGame tennisGame= new TennisGame();
		tennisGame.noneServerScore();
		Assert.assertEquals(tennisGame.getScore(), "Love-Fifteen");

	}
}
