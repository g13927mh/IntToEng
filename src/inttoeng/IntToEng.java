package inttoeng;

import java.util.Scanner;

public class IntToEng {

    // ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    public static String translateEng(int n) {
    	String s = "";
    	if(n==0) s = "zero";
    	if(n<0||n>10000) {
    		s="�͈͊O�ł�";
    		n=0;
    	}
    	String zeroToNine[]={"","one","two","three","four","five","six","seven","eight","nine"};
    	String tenToNineteen[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","seventeen","eighteen","nineteen"};
    	String tenToNinety[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	
        int minus = 0;
        while(n!=0){
        if(n>=1000&&n<10000){
        	s+= zeroToNine[n/1000]+" thousand";
        	minus = (n/10000)*10000;
        }
        if(n>=100&&n<1000){	
        	s+= zeroToNine[n/100]+" hundred";
        	minus=(n/100)*100;
        }
        if(n>=20&&n<100){
     		s+=tenToNinety[n/10];
     		 minus= (n/10)*10;
     	}
    	if(n>=10&&n<20){
    		 s+=tenToNineteen[n%10];
    		 minus= n;
    	 }
    	if(n>0&&n<10){
    		s+=zeroToNine[n];
    		minus= n;
    	}
    	n-=minus;
    	if(n!=0) s+=" ";
        }
        return s;
    }
   
    }

