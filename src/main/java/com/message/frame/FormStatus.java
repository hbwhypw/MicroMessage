package com.message.frame;

public class FormStatus {
	
	/*==================================审批状态==================================*/
	
	/**
	 * 通用审批状态
	 * @author Administrator
	 *
	 */
	public enum GeneralApproveStatus {
		DEFAULT(0), NOT_APP(1), APP(2);

		private final int value;

		public int getValue() { return value; }

		GeneralApproveStatus(int value) { this.value = value; }
	}
	
	/*==================================单据状态==================================*/
	/**
	 * 送检状态
	 * @author Administrator
	 *
	 */
	public enum ChecksStatus {
		DEFAULT(0), APP(1), ING(2), NOT_APP(3);

		private final int value;

		public int getValue() { return value; }

		ChecksStatus(int value) { this.value = value; }
	}
	/**
	 * 通用单据状态
	 * @author Administrator
	 *
	 */
	public enum GeneralStatus{
		DEFAULT(0), NOT_APP(1), APP(2);
		
		private final int value;

		public int getValue() { return value; }

		GeneralStatus(int value) { this.value = value; }
	}
	
	/**
	 * 订货单状态
	 * @author Administrator
	 *
	 */
	public enum OrderStatus{
		DEFAULT(0), COMPANY_APP(1), ORG_APP(2), NOT_APP(-1), ORDER_OVER(3);
		
		private final int value;
		
		public int getValue() { return value; }

		OrderStatus(int value) { this.value = value; }
	}
	
	/**
	 * 发货单状态
	 * @author Administrator
	 *
	 */
	public enum ConsignmentStatus{
		DEFAULT(0), ACCEPTANCING(1), ACCEPTANCED(2), PAY_MENT(3), NOT_APP(-1);
		
		private final int value;
		
		public int getValue() { return value; }

		ConsignmentStatus(int value) { this.value = value; }
	}
	
	/**
	 * 启用，禁用状态
	 * @author Administrator
	 *
	 */
	public enum UseableStatus{
		USEABLE(1), UNUSEABLE(-1);
		
		private final int value;
		
		public int getValue() { return value; }

		UseableStatus(int value) { this.value = value; }
	}
}
