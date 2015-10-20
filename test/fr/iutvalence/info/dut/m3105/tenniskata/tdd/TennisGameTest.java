package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void aSimpleBeginningTest()
	{
		Assert.assertEquals(TennisGame.getScore(0,0), "Love-All");
		


	}
}
