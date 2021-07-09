import java.util.Scanner;

public class Lec6 {

	public static void main(String args[]) {

	     Scanner sc=new Scanner(System.in);
	      
	     char ch='a';
	    
	    	
	      while(ch!='X' && ch!='x')
	      {     
	          ch = sc.next().charAt(0);
	    	  if((ch=='+')||(ch=='-')||(ch=='*')||(ch=='/')||(ch=='%'))
	    	  {   
	    		  int a=sc.nextInt();
	    		  int b=sc.nextInt();
	             
	    		  if(ch=='+')
	    			  System.out.println(a+b);
	    		  if(ch=='-')
	    			  System.out.println(a-b);
	    		  if(ch=='*')
	    			  System.out.println(a*b);
	    		  if(ch=='/')
	    			  System.out.println(a/b);
	    		  if(ch=='%')
	    			  System.out.println(a%b);
	    	  }
	    	  else if(ch != 'X' && ch != 'x')
	    		  System.out.println("Invalid operation. Try again.");
	      }
	      sc.close();
	}

}
