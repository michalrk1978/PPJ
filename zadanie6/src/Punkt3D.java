package zadanie6;
import java.lang.Math;
enum Ksztalt { KULA, SZESCIAN, CZWOROSCIAN };

public class Punkt3D {

	private double x = 0;
	private double y = 0;
	private double z = 0;
	private Kolor kolor = null;
	private int rozmiar = 0;
	Ksztalt ksztalt = null;

	 // obrot o kat (w radianach) wzgledem osi wyznaczonej przez zadany wektor
	public void obroc(double fi, double Ox, double Oy, double Oz)
	{
		double x2 = Ox * Ox;
		double y2 = Oy * Oy;
		double z2 = Oz * Oz;
		double dlugosc2 = x2 + y2 + z2;
		double dlugosc = Math.sqrt(dlugosc2);

		x = x * (x2 + (y2 + z2)* Math.cos(fi))/dlugosc2 +
		    y * (- Ox*Oy*(Math.cos(fi) - 1)/dlugosc2 - Oz*Math.sin(fi)/dlugosc) +
		    z * (Ox*Oz*(Math.cos(fi)- 1)/dlugosc2 + Oy*Math.sin(fi)/dlugosc);

		y = -x * ((y2 + z2)*(-Ox*Oy + Ox*Oy*Math.cos(fi) + Oz*dlugosc*Math.sin(fi)))/((y2 - z2)*dlugosc2) +
			y * ((x2*(y2 - z2)-z2*(y2 + z2))*Math.cos(fi) + Oy*(y2*Oy + Oy*z2 +2*Ox*Oz*dlugosc*Math.sin(fi)))/((y2-z2)*dlugosc2) +
			z * ((y2 + z2)*(-Oy*Oz + Oy*Oz*Math.cos(fi)- Ox*dlugosc*Math.sin(fi) ) )/((y2 - z2)*dlugosc2);

		z = x * ((y2 + z2)*(-Ox*Oz + Ox*Oz*Math.cos(fi) + Oy*dlugosc*Math.sin(fi) ) )/((z2 - y2)*dlugosc2) -
			y * ((y2 + z2)*(-Oy*Oz + Oy*Oz*Math.cos(fi) - Ox*dlugosc*Math.sin(fi) ) )/((y2 - z2)*dlugosc2) +
			z *	((x2*(y2 - z2) + y2*(y2 + z2))*Math.cos(fi) - Oz*(y2*Oz + z2*Oz + 2*Ox*Oy*dlugosc*Math.sin(fi) ))/((z2 - y2)*dlugosc2);
	}

	// przesuwa punkt o zadany wektor
	public void przesun(double Px, double Py, double Pz)
	{
		x += Px;
		y += Py;
		z += Pz;
	}



	/**
	 * Method wierzcholek3D
	 *
	 *
	 */

	public Punkt3D(Punkt3D p3D)
	{
		x = p3D.getX();
		y = p3D.getY();
		z = p3D.getZ();
		kolor = new Kolor(p3D.getKolor());
		ksztalt = p3D.getKsztalt();


	}

	public Punkt3D(double sX, double sY, double sZ, Kolor sKolor, int sRozmiar, Ksztalt sKsztalt)
	{
		x = sX;
		y = sY;
		z = sZ;
		kolor = sKolor;
		rozmiar = sRozmiar;
		ksztalt = sKsztalt;
	}

	public void setX(double sX)
	{
		x = sX;
	}

	public double getX()
	{
		return x;
	}

	public void setY(double sY)
	{
		y = sY;
	}

	public double getY()
	{
		return y;
	}

	public void setZ(double sZ)
	{
		z = sZ;
	}

	public double getZ()
	{
		return z;
	}

	public void setKolor(Kolor sKolor)
	{
		kolor = sKolor;
	}

	public Kolor getKolor()
	{
		return kolor;
	}

	public void setRozmiar(int sRozmiar)
	{
		rozmiar = sRozmiar;
	}

	public int getRozmiar()
	{
		return rozmiar;
	}

	public void setKsztalt(Ksztalt sKsztalt)
	{
		ksztalt = sKsztalt;
	}

	public Ksztalt getKsztalt()
	{
		return ksztalt;
	}

	public String toString()
	{
		String sf = String.format("\nx: %.5f \ny: %.5f \nz: %.5f", x, y, z);

		return sf +
			   "\nkolor: " + kolor.getR() + " " + kolor.getG() + " " + kolor.getB() +
			   "\nrozmiar: " + rozmiar +
			   "\nksztalt: " + ksztalt.toString();
	}


}
