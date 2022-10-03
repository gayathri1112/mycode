package Shopping;
import java.util.*;
public class Test {
  static int fb=100000;
  static int l=5,p=5,f=5,g=5,c=5,b1=5,b2=5,v1=5,v2=5,c1=5,c2=5,o1=5,o2=5;
  static  int totalbill=0;
    public  static void display()
    {
    	System.out.println("1.electronics 2.bath 3.kitchen 4.cloths 5.others");
    	Scanner sc=new Scanner(System.in);
    	int choice=sc.nextInt();
//    	int l=5,p=5,f=5,g=5,c=5;
    	
    if(choice==1)
    {
    
//    	int l=5,p=5,f=5,g=5,c=5;
    	int l1=25000,p1=10000,f1=5000,g1=20000,c1=20000,eleb=0;
    		System.out.println("the available products are>>1:laptop->25k"+(l)+"2:phone->10k"+p+"3:fan->5k"+f+"4:fridge->20k"+g+"5:cooler->20k"+c);
    		System.out.println("type the product name to purchase");
    		int req=sc.nextInt();
    		switch(req)
    		{
    		case 1:
    			System.out.println("there are"+l);
    			int q=sc.nextInt();
    			System.out.println("how many quantities u require"+q);
    			System.out.println("prize is"+q*l1);
    			
    			totalbill=totalbill+(q*l1);
    			int k=fb-totalbill;
//    			System.out.println(totalbill);
    			  int b=l-q;
    			  l=b;
    			System.out.println("available bal is"+k+"available quant is"+b);
    			if(k>0)
    				
    			    display();
    			else
    				break;
    			
    		case 2:
    			System.out.println("there are"+p);
    			int q1=sc.nextInt();
    			System.out.println("how many quantities u require"+q1);
    			System.out.println("prize is"+q1*p1);
    			
    			totalbill=totalbill+(q1*p1);
    			int k1=fb-totalbill;
//    			System.out.println(totalbill);
    			int b1=l-q1;
    			p=b1;
    			System.out.println("available bal is"+k1+"available quant is"+b1);
    			if(k1>=0)
    				display();
    			else
    				break;
    		case 3:
    			System.out.println("there are"+f);
    			int q2=sc.nextInt();
    			System.out.println("how many quantities u require"+q2);
    			System.out.println("prize is"+q2*f1);
    			
    			totalbill=totalbill+(q2*f1);
    			int k2=fb-totalbill;
//    			System.out.println(totalbill);
    			int b2=l-q2;
    			f=b2;
    			System.out.println("available bal is"+k2+"available quant is"+b2);
    			if(k2>=0)
    				display();
    			else
    				break;
    		case 4:
    			System.out.println("there are"+g);
    			int q3=sc.nextInt();
    			System.out.println("how many quantities u require"+q3);
    			System.out.println("prize is"+q3*g1);
    			
    			totalbill=totalbill+(q3*g1);
    			int k3=fb-totalbill;
//    			System.out.println(totalbill);
    			int b3=l-q3;
    			g=b3;
    			System.out.println("available bal is"+k3+"available quant is"+b3);
    			if(k3>=0)
    				display();
    			else
    				break;
    		case 5:
    			System.out.println("there are"+c);
    			int q4=sc.nextInt();
    			System.out.println("how many quantities u require"+q4);
    			System.out.println("prize is"+q4*c1);
    			
    			totalbill=totalbill+(q4*c1);
    			int k4=fb-totalbill;
//    			System.out.println(totalbill);
    			int b4=l-q4;
    			c=b4;
    			System.out.println("available bal is"+k4+"available quant is"+b4);
    			if(k4>0)
    				display();
    			else
    				break;
    		
    		
    		}
    }
    
    else if(choice==2)
    {
    	
    	
        int l1=250,p1=80,batheb=0;
    		System.out.println("the available products are>>1:shampoo->250"+(b1)+"2:soap->80"+(b2));
    		System.out.println("type the product no to purchase");
    		int req=sc.nextInt();
    		switch(req)
    		{
    		case 1:
    			System.out.println("there are"+b1);
    			int q=sc.nextInt();
    			System.out.println("how many quantities u require"+q);
    			System.out.println("prize is"+q*l1);
    			totalbill=totalbill+(q*l1);
    			int k4=fb-totalbill;
//    			System.out.println(totalbill);
    			int b=b1-q;
    			
    			b1=b;
    			System.out.println("available bal is"+k4+"available quant is"+b);
    			if(k4>0)
    				display();
    			else
                  break;
    		case 2:
    			System.out.println("there are"+b2);
    			int q1=sc.nextInt();
    			System.out.println("how many quantities u require"+q1);
    			System.out.println("prize is"+q1*p1);
    			int k1=fb-totalbill;
//    			System.out.println(totalbill);
    			int d=b1-q1;
    			
    			b2=d;
    			System.out.println("available bal is"+k1+"available quant is"+d);
    			if(k1>0)
    				display();
    			else
                  break;
	
}
}
    if(choice==3)
    {
    
    	
    	int l1=300,p1=1000,eleb=0;
    		System.out.println("the available products are>>1:pan->300"+(v1)+"2:dinnerset->1000"+v2);
    		System.out.println("type the product name to purchase");
    		int req=sc.nextInt();
    		switch(req)
    		{
    		case 1:
    			System.out.println("there are"+v1);
    			int q=sc.nextInt();
    			System.out.println("how many quantities u require"+q);
    			System.out.println("prize is"+q*l1);
    			int k1=fb-totalbill;
//    			System.out.println(totalbill);
    			int d=v1-q;
    			
    			v1=d;
    			System.out.println("available bal is"+k1+"available quant is"+d);
    			if(k1>0)
    				display();
    			else
                  break;
    		case 2:
    			System.out.println("there are"+v2);
    			int q1=sc.nextInt();
    			System.out.println("how many quantities u require"+q1);
    			System.out.println("prize is"+q1*p1);
    			int k2=fb-totalbill;
//    			System.out.println(totalbill);
    			int e=v2-q1;
    			
    			v2=e;
    			System.out.println("available bal is"+k2+"available quant is"+e);
    			if(k2>0)
    				display();
    			else
                  break;
    }
}
    if(choice==4)
    {
    
    	
    	int l1=2000,p1=5000;
    		System.out.println("the available products are>>1:kids->2k"+(c1)+"2:girl->5k"+(c2));
    		System.out.println("type the product name to purchase");
    		int req=sc.nextInt();
    		switch(req)
    		{
    		case 1:
    			System.out.println("there are"+c1);
    			int q=sc.nextInt();
    			System.out.println("how many quantities u require"+q);
    			System.out.println("prize is"+q*l1);
    			int k1=fb-totalbill;
//    			System.out.println(totalbill);
    			int d=c1-q;
    			
    			c1=d;
    			System.out.println("available bal is"+k1+"available quant is"+d);
    			if(k1>0)
    				display();
    			else
                  break;
    		case 2:
    			System.out.println("there are"+c2);
    			int q1=sc.nextInt();
    			System.out.println("how many quantities u require"+q1);
    			System.out.println("prize is"+q1*p1);
    			int k2=fb-totalbill;
//    			System.out.println(totalbill);
    			int e=c2-q1;
    			
    			c2=e;
    			System.out.println("available bal is"+k2+"available quant is"+e);
    			if(k2>0)
    				display();
    			else
                  break;
    		
    		
    		
    		}
    }
    
    else if(choice==5)
    {
    
    	
    	int l1=10000,p1=5000,eleb=0;
    		System.out.println("additional products are>>1:bed->10000"+(o1)+"2:sofa->5000"+o2);
    		System.out.println("type the product name to purchase");
    		int req=sc.nextInt();
    		switch(req)
    		{
    		case 1:
    			System.out.println("there are"+o1);
    			int q=sc.nextInt();
    			System.out.println("how many quantities u require"+q);
    			System.out.println("prize is"+q*l1);
    			int k1=fb-totalbill;
//    			System.out.println(totalbill);
    			int d=o1-q;
    			
    			o1=d;
    			System.out.println("available bal is"+k1+"available quant is"+d);
    			if(k1>0)
    				display();
    			else
                  break;
    		case 2:
    			System.out.println("there are"+o2);
    			int q1=sc.nextInt();
    			System.out.println("how many quantities u require"+q1);
    			System.out.println("prize is"+q1*p1);
    			int k2=fb-totalbill;
//    			System.out.println(totalbill);
    			int e=o2-q1;
    			
    			o2=e;
    			System.out.println("available bal is"+k2+"available quant is"+e);
    			if(k2>0)
    				display();
    			else
                  break;
    		
    }
}
    else
    {
    	System.out.println("enter valid number");
    }
   
    }
    public static void main(String args[])
    {
    	display();
    }
}
