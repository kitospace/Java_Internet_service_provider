
public class planOne {
	
	private String PlanId;
	private String PlanInfo;
	private int NetworkData;
	private float bill_amt;
	
	
	public String getPlanId() {
		return PlanId;
	}
	public String getPlanInfo() {
		return PlanInfo;
	}
	public int getNetworkData() {
		return NetworkData;
	}
	public float getBill_amt() {
		return bill_amt;
	}
	
	
	public planOne(String PlanId, String PlanInfo, int NetworkData, float bill_amt) {
		this.PlanId = PlanId;
		this.PlanInfo = PlanInfo;
		this.NetworkData = NetworkData;
		this.bill_amt = bill_amt;
	}

}
