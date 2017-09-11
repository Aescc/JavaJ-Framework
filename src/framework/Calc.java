package framework;

import java.lang.Math;

public class Calc
{
	public static float FindAngle( float x1,float y1,float x2,float y2 )
	{
		final float deltaX = x2 - x1;
		final float deltaY = y2 - y1;
		
		float theta = (float)( Math.atan2( deltaY,deltaX ) );
		
		return (float)( theta * ( 180 / Math.PI ) );
	}
	public static float FindDist( float x1,float y1,float x2,float y2 )
	{
		final float deltaX = x2 - x1;
		final float deltaY = y2 - y1;
		
		final float distance = (float)( Math.sqrt( ( deltaX * deltaX ) + ( deltaY * deltaY ) ) );
		
		return distance;
	}
	public static boolean HitTest( float x1,float y1,float w1,float h1,
		float x2,float y2,float w2,float h2 )
	{
		return( x1 < x2 + w2 && x1 + w1 > x2 &&
			y1 < y2 + h2 && y1 + h1 > y2);
	}
	public static int Random( int min,int max )
	{
		if( min > max )
		{
			final int temp = max;
			max = min;
			min = temp;
		}
		final int randNum = (int)( Math.floor( Math.random() * ( 1 + max - min ) ) + min );
		return randNum;
	}
}