package base;

public class MyInteger {
	
	static int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven(){
		if (MyInteger.iValue % 2 == 1){ return false;}
		else {return true;}
	} 
	
	public boolean isOdd(){
		if (MyInteger.iValue % 2 == 0){ return false;}
		else {return true;}
	} 
	
	public boolean isPrime(){
		boolean answer = true;
		for (int i = 2; i < MyInteger.iValue; i++){
			if (MyInteger.iValue % i == 0){ answer = false; break;}
		}
		return answer;
	}
	
	static boolean isEven(int a){
		if (a % 2 == 1){ return false;}
		else {return true;}
	} 
	
	static boolean isOdd(int a){
		if (a % 2 == 0){ return false;}
		else {return true;}
	} 
	
	static boolean isPrime(int a){
		boolean answer = true;
		for (int i = 2; i < a; i++){
			if (a % i == 0){ answer = false; break;}
		}
		return answer;
	}
		
	static boolean isEven(MyInteger i){
		if (i.iValue % 2 == 1){ return false;}
		else {return true;}
	} 
	
	static boolean isOdd(MyInteger i){
		if (i.iValue % 2 == 0){ return false;}
		else {return true;}
	} 
	
	static boolean isPrime(MyInteger i){
		boolean answer = true;
		for (int a = 2; a < i.iValue; a++){
			if (i.iValue % a == 0){ answer = false; break;}
		}
		return answer;
	}
	
	public boolean equals(int i){
		if (MyInteger.iValue == i){ return true;}
		else{return false;}
	}
	
	public boolean equals(MyInteger i){
		if (MyInteger.iValue == i.iValue){ return true;}
		else{ return false;}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
