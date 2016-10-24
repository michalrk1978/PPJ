

package seria4zadania4;

import java.lang.Math;

public class Complex {

	private double re, im;
	private double r, fi;
	
	public Complex(double sRe, double sIm)
	{
		setReIm(sRe, sIm);
	}
	
	public Complex( Complex cp)
	{
		setReIm(cp.re, cp.im);
	}
	
	public double getRe()
	{
		return re;
	}
	
	public double getIm()
	{
		return im;
	}
	
	public double getFi() {
		return fi;
	}
	
	private void setRFi()
	{
		r = Math.hypot(re, im);
		
		fi = Math.atan2(im, re);
		

/*  jest inny sposób liczenia fi - przypuszczam, ¿e funkcja systemowa bêdzie siê lepiej numerycznie zachowywaæ.
 * 		double cosftoi;
		
		if(r != 0)
		{
			cosfi = re/r;
			
			if(im >= 0)
			{
				fi = Math.acos(cosfi);
			}
			else
			{
				fi = - Math.acos(cosfi);	
			}
		}
		else
		{
			fi = 0;
		}
		
	*/	
		
	}
	
	private void setReIm()
	{
		re = r * Math.cos(fi);
		im = r * Math.sin(fi);
	}

	public void setReIm(double sRe, double sIm)
	{
		re = sRe;
		im = sIm;
		setRFi();		
	}
	
	public void add(Complex cp)
	{
		re += cp.getRe();
		im += cp.getIm();
		setRFi();
	}
	
	public void sub(Complex cp)
	{
		re -= cp.getRe();
		im -= cp.getIm();
		setRFi();
	}
	
	public void mul(Complex cp)
	{
		fi += cp.fi;
		r *= cp.r;
		
		setReIm();
		
		
		if(fi <= - Math.PI || fi > Math.PI)
		{
			fi = Math.atan2(im, re);
			
/* jest inny sposób liczenia fi - przypuszczam, ¿e funkcja systemowa bêdzie siê lepiej numerycznie zachowywaæ.	
			double cosfi;
			
			if(r != 0)
			{
				cosfi = re/r;
				
				if(im >= 0)
				{
					fi = Math.acos(cosfi);
				}
				else
				{
					fi = - Math.acos(cosfi);	
				}
			}
			else
			{
				fi = 0;
			}
					*/
		}
		
	}
	
	public void div(Complex cp)
	{
		fi -= cp.fi;
		r /= cp.r;
		
		setReIm();
		
		if(fi <= - Math.PI || fi > Math.PI)
		{
			fi = Math.atan2(im, re);
			/* jest inny sposób liczenia fi - przypuszczam, ¿e funkcja systemowa bêdzie siê lepiej numerycznie zachowywaæ.
			/* double cosfi;
			
			if(r != 0)
			{
				cosfi = re/r;
				
				if(im >= 0)
				{
					fi = Math.acos(cosfi);
				}
				else
				{
					fi = - Math.acos(cosfi);	
				}
			}
			else
			{
				fi = 0;
			}
			*/
			
		}
	}
	
	@Override
	public boolean equals(Object o) 
	{
	    if (!(o instanceof Complex)) return false;
	    
	    Complex cp = (Complex) o;
	    
	    return re == cp.re && im == cp.im;
	  }

	@Override
	public String toString() 
	{
		return  String.format("%f+i*%f         %f*[cos(%f)+i*sin(%f)]", re, im, r, fi, fi);
	}
	
	public void show()
	{
		System.out.println(this);
	}
	
	
}
