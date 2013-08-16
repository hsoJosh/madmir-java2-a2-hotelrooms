import javax.swing.JOptionPane;


public class HotelBilling {
	
	final static float SALES_TAX = 0.13f;
		
		public static void main(String[] args) {
		
			double roomPrice = 97.00;
			int roomsBook = Integer.parseInt(JOptionPane.showInputDialog(null, "How many rooms did you want? "));
			double couponRate = 0.10;
		
			double totalBill = calculateBill(roomPrice, roomsBook, couponRate);

	
			JOptionPane.showMessageDialog(null, "Your total is $ " + totalBill);
	}

	
		public static double calculateBill(double price) {
			double finalRate = price * (1 + SALES_TAX); 
			finalRate = twoDecimalRounding(finalRate);
			return finalRate;				
	}
	
		public static double calculateBill(double price, double book){
			double finalRate = price * book;
			finalRate = finalRate * (1 + SALES_TAX);
			finalRate = twoDecimalRounding(finalRate);
			return finalRate;
	}
		
		public static double calculateBill(double price, double roomsBook, double couponRate) {
			double finalRate = roomsBook * price;
			finalRate = finalRate * (1 - couponRate);
			finalRate = finalRate * (1 + SALES_TAX);
			finalRate = twoDecimalRounding(finalRate);
			return finalRate;	
	}
	
		public static double twoDecimalRounding(double decimal){
			decimal = decimal *100;
			decimal = decimal + 0.5;
			decimal = (int) decimal;
			decimal = decimal / 100;
			return decimal;
	}
}
	

