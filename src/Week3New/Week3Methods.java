package Week3New;

public class Week3Methods { 
	
	int zero = 0;
	
	
	public static String helloWorld(String x, int y) {
		
		String result = "";
		for (int i = 0; i < y; i++) {
			
			result += x;
		}
		return result;
			
	}
	public static void main(String[] args) {
		
		double[] sum = new double[6]; 

		sum [0] = 12;
		sum [1] = 28;
		sum [2] = 34;
		sum [3] = 10;
		sum [4] = 42;
		sum [5] = 100;
		
		double[] sum1 = new double[6]; 

		sum1 [0] = 20;
		sum1 [1] = 7;
		sum1 [2] = 32;
		sum1 [3] = 10;
		sum1 [4] = 72;
		sum1 [5] = 100;
		
				
		String call = helloWorld("Hello", 2);
		System.out.println(call);
		
		String call1 = fullName("John", "Cena");
		System.out.println(call1);
		
		boolean call2 = sumOfAll(sum);
		System.out.println(call2);
		
		double call3 = avgArray(sum);
		System.out.println(call3);
		
		boolean call4 = superSum(sum, sum1);
		System.out.println(call4);
		
		boolean call5 = willBuyDrink(false, 10.6);
		System.out.println(call5);
		
		double call6 = plusOrX(sum, sum1);
		System.out.println(call6);
		
		
	}
	public static String fullName(String fn, String ln) {
		return (fn + ln);
		
	} 
	public static boolean sumOfAll(double[] sumTotals) {
		double sumZ = 0;
	for (double sumTotal : sumTotals) {
		sumZ += sumTotal;
		if(sumZ > 100)
		
		return true;
	
		
	}return false;
	
	}public static double avgArray(double[] avgS) {
		double sumX = 0;
		for (double avg : avgS) {
			sumX += avg; 
		
		}
		return (sumX/avgS.length);
	}
	public static boolean superSum(double[] gr8Sum, double []grerSum) {
		double sumY = 0;
		double sumW = 0;
		
		for(double gr8Su : gr8Sum) {
			sumY += gr8Su;
		}
		
		for(double grerSu : grerSum) {
			
			sumW += grerSu;
		}
		if ((sumY/gr8Sum.length) > (sumW/grerSum.length)) {
			return true;
		}
	
		
		return false;
	}
	public static boolean willBuyDrink(boolean isHot, double money) {
	if (isHot && (money > 10.5) ) {
	return true;
	}
	return false;
}
	public static double plusOrX(double[] bigSum, double[] lilSum) {
		double avgB =0;
		double avgL =0;
		for(double biSum : bigSum) {
			avgB += biSum;
		}
		for(double liSum : lilSum) {
			avgL += liSum;
		}
		if ((avgB/bigSum.length) > (avgL/lilSum.length)) {
			return ((avgB/bigSum.length) * (avgL/lilSum.length));
		}
		return ((avgB/bigSum.length) + (avgL/lilSum.length));
		}
	}

