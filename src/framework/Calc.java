package framework;

import java.lang.Math;

public class Calc
{
	public static int FindAngle( int x1,int y1,int x2,int y2 )
	{
		final int deltaX = x2 - x1;
		final int deltaY = y2 - y1;
		int theta = (int)Math.atan2( deltaY,deltaX );
		theta *= ( 180 / Math.PI );
		return theta;
	}
	public static int FindDist( int x1,int y1,int x2,int y2 )
	{
		final int deltaX = x2 - x1;
		final int deltaY = y2 - y1;
		final int distance = (int)Math.sqrt( ( deltaX * deltaX ) + ( deltaY * deltaY ) );
		return distance;
	}
	public static boolean HitTest( int x1,int y1,int w1,int h1,
		int x2,int y2,int w2,int h2 )
	{
		if( x1 < x2 + w2 && x1 + w1 > x2 &&
			y1 < y2 + h2 && y1 + h1 > y2)
			return true;
		else
			return false;
	}
	public static int Random( int min,int max )
	{
		if( min > max )
		{
			final int temp = max;
			max = min;
			min = temp;
		}
		final int randNum = (int)Math.floor( Math.random() * ( 1 + max - min ) ) + min;
		return randNum;
	}
}