import java.util.Scanner;


public class projectOneTwo {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		planOne PlanA = new planOne("P10", "10 mbps", 6000, 4500);
		planOne PlanB = new planOne("P20", "20 mbps", 5000, 7500);
		planOne PlanC = new planOne("P30", "30 mbps", 4000, 1200);
		System.out.println("Enter Data Used(in MB) : ");
		int data = sc.nextInt();
		System.out.println("Enter the Plan\n1. Plan-A\n2. Plan-B\n3. Plan-C");
		int plan = sc.nextInt();
		
		if(plan==1){
			System.out.println("Plan Code : " + PlanA.getPlanId()+" Mbps");
			System.out.println("Internet Speed : "+PlanA.getPlanInfo());
			System.out.println("Data Consumption Limit : "+PlanA.getNetworkData()+"MB");
			System.out.println("Data Used : "+data+" MB");
			if(data>=100&&data<500){
				float bill = (float)(4500.0-199.9);
				System.out.println("Bill : "+bill);
			}else if(data<100 || data>8000){
				System.out.println("This internet service is not Available for such data amount");
			}
			else if(data>6000 && data<8000){
				float bill=(float)(4500+50.9);
				System.out.println("Bill : "+bill);
			}else if(data<=6000){
				System.out.println("Bill : "+PlanA.getBill_amt());
			}else{
				System.out.println("Bill : Wrong Information given by user");
			}
			
		}
		
		else if(plan==2){
			System.out.println("Plan Code : " + PlanB.getPlanId()+" Mbps");
			System.out.println("Internet Speed : "+PlanB.getPlanInfo());
			System.out.println("Data Consumption Limit : "+PlanB.getNetworkData()+"MB");
			System.out.println("Data Used : "+data+" MB");
			if(data>=50&&data<100){
				float bill = (float)(7500.0-399.9);
				System.out.println("Bill : "+bill);
			}else if(data<50 || data>7000){
				System.out.println("This internet service is not Available for such data amount");
			}
			else if(data>5000 && data<7000){
				float bill=(float)(7500+299.9);
				System.out.println("Bill : "+bill);
			}else if(data<=5000){
				System.out.println("Bill : "+PlanB.getBill_amt());
			}else{
				System.out.println("Bill : Wrong Information Given by user");
			}
			
		}
		
		else if(plan==3){
			System.out.println("Plan Code : " + PlanC.getPlanId()+" Mbps");
			System.out.println("Internet Speed : "+PlanC.getPlanInfo());
			System.out.println("Data Consumption Limit : "+PlanC.getNetworkData()+"MB");
			System.out.println("Data Used : "+data+" MB");
			if(data>=50&&data<100){
				float bill = (float)(1200.0-555.5);
				System.out.println("Bill : "+bill);
			}else if(data<50 || data>6000){
				System.out.println("This internet service is not Available for such data amount");
			}
			else if(data>4000 && data<6000){
				float bill=(float)(1200+399.9);
				System.out.println("Bill : "+bill);
			}else if(data<=6000){
				System.out.println("Bill : "+PlanC.getBill_amt());
			}else{
				System.out.println("Bill : Wrong Information Given by user");
			}
			
		}
		else{
			System.out.println("Enter Correct Plan!");
		}
		
}
		catch(Exception e){
			System.out.println("Wrong Input");
		}}}
