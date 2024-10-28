import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kbd = new Scanner(System.in);

	     int len = kbd.nextInt();
	     int kim = kbd.nextInt();
	     int im = kbd.nextInt();
	     boolean printed = false;
	    
	     for(int i=0; i<(len+1)/2; i++) {
	    	 if(kim%2 == 1) {
	    		 if(kim == im-1) {
	    			 System.out.println(i+1);
	    			 printed = true;
	    			 break;
	    		 }
	    		 else {
	    			 kim = (kim+1)/2;
	    			 if(im%2 == 1) {
	    				 im = (im+1)/2;
	    			 }
	    			 else {
	    				 im /= 2;
	    			 }
	    		 }
	    	 }
	    	 else {
	    		 if(kim == im+1) {
	    			 System.out.println(i+1);
	    			 printed = true;
	    			 break;
	    		 }
	    		 else {
	    			 kim /= 2;
	    			 if(im%2 == 1) {
	    				 im = (im+1)/2;
	    			 }
	    			 else {
	    				 im /= 2;
	    			 }
	    		 }
	    	 }
	     }
	     if(printed == false) System.out.println(-1);
	}
}
