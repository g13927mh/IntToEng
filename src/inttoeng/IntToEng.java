package inttoeng;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	String s = "";
    	if(n==0) s = "zero";
    	if(n<0||n>100000) {
    		s="範囲外です";
    		n=0;
    	}
    	String zeroToNine[]={"","one","two","three","four","five","six","seven","eight","nine"};
    	String tenToNineteen[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","seventeen","eighteen","nineteen"};
    	String tenToNinety[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	int sub = 0;
        int minus = 0;
        while(n!=0){
        	minus=0;
        if(n>=1000&&n<1000000){
        	sub =n;
        	
        	//s+= zeroToNine[n/1000]+" thousand";
        	n = n/1000;
        	minus += (n/1000)*1000;
        }
        if(n>=100&&n<1000){	
        	s+= zeroToNine[n/100]+" hundred";
        	minus+=(n/100)*100;
        }
        if(n>=20&&n<100){
     		s+=tenToNinety[n/10];
     		 minus+= (n/10)*10;
     	}
    	if(n>=10&&n<20){
    		 s+=tenToNineteen[n%10];
    		 minus+= n;
    	 }
    	if(n>0&&n<10){
    		s+=zeroToNine[n];
    		minus+= n;
    	}
    
    	n-=minus;
    	n += sub;
    	if(n!=0) s+=" ";
        }
        return s;
    }
    public static String zeroTo999(int n,String[] zeroToNine,String[] tenToNineteen,String[] tenToNinety){
    	String s="";
    	  if(n>=100&&n<1000){	
          	s+= zeroToNine[n/100]+" hundred";
          	n-=(n/100)*100;
          }
          if(n>=20&&n<100){
       		s+=tenToNinety[n/10];
       		n-= (n/10)*10;
       	}
      	if(n>=10&&n<20){
      		 s+=tenToNineteen[n%10];
      		 n-= n;
      	 }
      	if(n>0&&n<10){
      		s+=zeroToNine[n];
      		n-= n;
      	}
      	if(n!=0) s+=" ";
          return s;
    }
}
