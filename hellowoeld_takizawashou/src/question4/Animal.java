package question4;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Animal {

		public static void main(String[] args) {

			Dog dog1 = new Dog(1);
			System.out.println("動物の名前: " + dog1.getName());

		
			Dog dog2 = new Dog(3);
			System.out.println("動物の数: " + dog2.getCount());
			
		
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
			String formattedDate = sdf.format(now);
		    
		    System.out.println("現在の日時: " + formattedDate);



		
		}
	}

