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
    	if(n<0||n>100) return "範囲外です";
    	String zeroToNine[]={"","one","two","three","four","five","six","seven","eight","nine"};
    	String tenToNineteen[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","seventeen","eighteen","nineteen"};
    	String tenToNinety[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	if(n>=0&&n<10){
    		if(n==0) return "zero";
    		return zeroToNine[n];
    	}
    	else if(n>=10&&n<20){
    		if(n==10) return "ten";
    		if(n==11) return "eleven";
    		if(n==12) return "twelve";
    		return zeroToNine[n%10]+"teen";
    	}
    	else if(n>=20&&n<100){
    		if(n%10==0) return tenToNinety[n/10];
    		return tenToNinety[n/10]+" "+zeroToNine[n%10];
    	}
    	else if(n>=100&&n<1000){
    		if(n%100==0) return zeroToNine[n/100]+"hundred";
    		return zeroToNine[n/100]+"hundred"+zeroToNinetynine(n%100);
    		
    		
    	}
    	
        return "";
    }
    public static String zeroToNinetynine(int n){
    	String zeroToNine[]={"","one","two","three","four","five","six","seven","eight","nine"};
    	String tenToNinety[]={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	if(n>=0&&n<10){
    		if(n==0) return "zero";
    		return zeroToNine[n];
    	}
    	else if(n>=10&&n<20){
    		if(n==10) return "ten";
    		if(n==11) return "eleven";
    		if(n==12) return "twelve";
    		return zeroToNine[n%10]+"teen";
    	}
    	else if(n>=20&&n<100){
    		if(n%10==0) return tenToNinety[n/10-1];
    		return tenToNinety[n/10-1]+" "+zeroToNine[n%10];
    	}
    	return "";
    }
}

