package zadanie6;
class Kolor {

	private short R;
	private short G;
	private short B;

	private float C;
	private float M;
	private float Y;
	private float K;

	public Kolor(short sR, short sG, short sB)
	{
		R = sR;
		G = sG;
		B = sB;
		RGBtoCMYK();
	}

	Kolor(float sC, float sM, float sY, float sK)
	{
		C = sC;
		M = sM;
		Y = sY;
		K = sK;
		CMYKtoRGB();
	}

	Kolor(Kolor k)
	{
		R = k.R;
		G = k.G;
		B = k.B;

		C = k.C;
		M = k.M;
		Y = k.Y;
		K = k.K;
	}

	/*Procedure RGBToCMY(const R, G, B: Byte; var C, M, Y: Byte);
begin
  C:=255-R;
  M:=255-G;
  Y:=255-B;
end;
*/
	private void RGBtoCMY()
	{
		C = (float)(100*(255 - (short)R)/255.0);
		M = (float)(100*(255 - (short)G)/255.0);
		Y = (float)(100*(255 - (short)B)/255.0);

	}

	public float minCMY()
	{
		float min;

		min = C;

		if(M < min)
		{
			min = M;
		}
		if(Y < min )
		{
			min = Y;
		}
		return min;
	}

	private void RGBtoCMYK() // zamiana formatu kolorow RGB na CMYK
	{
		RGBtoCMY();
		K = minCMY();
		C = (C - K);
		M = (M - K);
		Y = (Y - K);
	}

	private void CMYKtoRGB() // zamiana formatu kolorow CMYK na RGB
	{
		R = (short)(255 - (C + K)*255/100.0);
		G = (short)(255 - (M + K)*255/100.0);
		B = (short)(255 - (Y + K)*255/100.0);
	}


	public void setR(short sR)
	{
		R = sR;
		RGBtoCMYK();
	}

	public void setG(short sG)
	{
		G = sG;
		RGBtoCMYK();
	}

	public void setB(short sB)
	{
		B = sB;
		RGBtoCMYK();
	}

	public short getR()
	{
		return R;
	}

    public short getG()
	{
		return G;
	}

	public short getB()
	{
		return B;
	}

	public void setC(float sC)
	{
		C = sC;
		CMYKtoRGB();
	}

	public void setM(float sM)
	{
		M = sM;
		CMYKtoRGB();
	}

	public void setY(float sY)
	{
		Y = sY;
		CMYKtoRGB();
	}

	public void setK(float sK)
	{
		K = sK;
		CMYKtoRGB();
	}

	public float getC()
	{
		return C;
	}

	public float getM()
	{
		return M;
	}

	public float getY()
	{
		return Y;
	}

	public float getK()
	{
		return K;
	}




}
