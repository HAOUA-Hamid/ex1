package complexe;

import complexe.Complexe;

public class Complexe implements Comparable<Complexe> {
	
	private double img;
	private double reel;
	
	private static int compteur=0;
	public double getImg() {
		return img;
		
	}
	public double getReel() {
		return reel;
		
	}
	
	
	public Complexe() {
		this(0,0);
	}
	public  Complexe(double reel) {
		this(reel,0);
	}
	public Complexe(double reel,double img) {
		this.reel=reel;
		this.img=img;
		compteur++;
	}
	
	public Complexe multiply(double scalar) {
		return new Complexe(scalar*this.reel, scalar*this.img);
	}
	
	public Complexe add(Complexe c) {
		return new Complexe(this.reel+c.reel, img+c.img);
		
	}
	public Complexe add(double reel,double img) {
		return add(new Complexe(reel, img));
	}
	
	public Complexe sub(Complexe c) {
		return new Complexe(this.reel-c.reel, img-c.img);
	}
	public Complexe mul(Complexe c) {
		// this*c = 
		// REEL=this.reel*c.reel-this.img*c.img
		// IMG = this.reel*c.img+this.img*c*reel
		Complexe ret=new Complexe();
		ret.reel=this.reel*c.reel-this.img*c.img;
		ret.img=this.reel*c.img+this.img*c.reel;
		return ret;
	}
	
	public static Complexe add(Complexe c1,Complexe c2) {
		 return c1.add(c2);
	}
	
	public static int createdComplexe() {
		return compteur;
	}
	
	@Override
	public String toString() {
		return reel+" + "+img+"i";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Complexe) {
			Complexe a=(Complexe)obj ;
			return (this.reel==a.reel)&&(this.img==a.img) ;
			}
			return false ;

	}
	@Override
	public int compareTo(Complexe o) {
		if(this.reel==o.reel) {
			return 0;
		}
		else {
			if(this.reel>o.reel) {
				return 1;
			}
		}
		return -1;
	}

}
