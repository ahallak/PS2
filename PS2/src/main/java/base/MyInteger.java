package base;
public class MyInteger {
	
	private int iValue = 10;
	int MyInteger = iValue;
	
	public int getValue(){
		return iValue;
	}
	
	public boolean isEven(){
		if (iValue % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isOdd(){
		if (iValue % 2 != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isPrime(){
		for (int x = 2; x < iValue; x = x + 1){
			if(iValue % x == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int iValue){
		if (iValue % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOdd(int iValue){
		if (iValue % 2 != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isPrime(int iValue){
		for (int x = 2; x < iValue; x = x + 1){
			if(iValue % x == 0){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int val){
		if(val == iValue){
			return true;
			}else{
				return false;
			}
		}
	/*
	public boolean equals(MyInteger){
		if(MyInteger == iValue){
			return true;
		}else{
			return false;
		}
	}
	*/
	
	/*
	public static boolean isEven(MyInteger){
		if (iValue % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger){
		if (iValue % 2 != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger){
		for (int x = 2; x < iValue; x = x + 1){
			if(iValue % x == 0){
				return false;
			}
		}
		return true;
	}
	*/

}