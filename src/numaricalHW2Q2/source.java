package numaricalHW2Q2;
import java.lang.Math;

public class source {
	public static void main(String[] args) {
		System.out.println("Hello");
		int n=6;
		double a0,a1,a,b,r,Sy_x,ST,SR;
		double Xold[]= {0,1,2,3,4,5};
		double Yold[]= {5.0,9.2,13.0,16.5,21.0,27.8};
		double sum_y,sum_x,sum_xy,sum_xx,xp,yp;
		sum_y=0.0;sum_x=0;sum_xy=0;sum_xx=0;ST=0;SR=0;
		// finding newy
		for(int i=0;i<n;i++) {
			double y=Yold[i]-Math.pow(Xold[i],2);
			Yold[i]=Math.log(y)-Xold[i];
		}
		//finfing new x
		for(int i=0;i<n;i++) {
			Xold[i]=Math.pow(Xold[i],1.5);
		}
		for(int i=0;i<n;i++) {
		sum_y+=Yold[i];
		sum_x+=Xold[i];
		sum_xy+=(Yold[i]*Xold[i]);
		sum_xx+=(Math.pow(Xold[i], 2));		
		}
		a1=((n*sum_xy)-(sum_y * sum_x))/((n*sum_xx)-(Math.pow(sum_x, 2)));
		yp=sum_y/n;
		xp=sum_x/n;
		a0=yp-(a1*xp);
		a=Math.pow(10.0, a0);
		b=1/a1;
		System.out.println("sum_y "+ sum_y);
		System.out.println("sum_x "+ sum_x);
		System.out.println("sum_xx "+ sum_xx);
		System.out.println("sum_xy "+ sum_xy);
		System.out.println("a1=1/b= "+ a1+" so b= "+b);
		System.out.println("a0= ln(a)= "+ a0+" so a= "+a);
		for(int i=0;i<n;i++) {
			double z=Yold[i]-yp;
			ST+=(Math.pow(z, 2));
			double zx=Yold[i]-a0-(a1*Xold[i]);
			SR+=(Math.pow(zx, 2));
		}
		r=((ST-SR)/ST);
		double t=SR/n-2;
		System.out.println(t);
	    Sy_x=Math.pow(t,0.5);
		System.out.println("r^2= "+r);
		System.out.println("Sy/x= "+ Sy_x);
		





	}

}
