package service;

import entity.Device;
import entity.Refinery;

public class CO2CaculatingSerivce {

	/**
	 * The total co2 account of the emission.
	 * **/
	public static double getTotalResult(Refinery factory) {
		

		return caculateLeakCO2(factory)+caculateProcessCO2(factory)+caculateElectricityCO2(factory)+caculateQuantityOfHeatCO2(factory);

	}

	public static double caculateLeakCO2(Refinery factory) {
    
		return caculateCH4Leak(factory)+caculateCarbonLeak(factory);
	}
	
	public static double caculateCH4Leak(Refinery factory){
		
		return 1.0;
	}
	
	public static double caculateCarbonLeak(Refinery factory){
		return 1.0;
		
	}

	public static double caculateProcessCO2(Refinery factory) {
		
		return 1.0;
	}
	public static double caculateElectricityCO2(Refinery factory) {

		return 1.0;
	}
	
	public static double caculateQuantityOfHeatCO2(Refinery factory) {

		return 1.0;
	}

}
