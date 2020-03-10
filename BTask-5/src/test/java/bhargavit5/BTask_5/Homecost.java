package bhargavit5.BTask_5;

import java.util.Scanner;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Homecost {
	private static final Logger logger=LogManager.getLogger(Homecost.class);
	public void homecost() {
		double areaOfHome;
		Scanner sc=new Scanner(System.in);
		logger.info("construction cost of house");

		logger.info("Enter area of house in fts:\n");
		areaOfHome=sc.nextDouble();
		
		logger.info("Select cost of stnd materials requeried for construction of house per sq ft:\n");
		logger.info("1:1200INR for stnd materials\n");
		logger.info("2:1400INR for above stnd materials\n");
		logger.info("3:1800INR for high stnd materials\n");
		logger.info("4:2500INR for high above stand materials and fully automated home\n");
		logger.warn("Select correct choice");
		
		int choice=sc.nextInt();
		if(choice>=1 && choice<5) {
			double[] home_Construction_cost= {
					areaOfHome*1200,
					areaOfHome*1500,
					areaOfHome*1800,
					areaOfHome*2500
					
			};
			
			logger.info("Home construction cost"+home_Construction_cost[choice-1]+"rupees");
			
		}
		else {
			 logger.error("Incorrect choice choosen");
		}

	}

}
