class ClassAdd {

		Integer km = 1;
		Integer ov = 1;
		Integer oc = 1;

	public static int evaluateGasConsumption(int ov, int km){
		int fuelFor100 = ov * 100 / km;
		return fuelFor100;
	}

	public static double evaluateGasCost(int ov, int km, int oc){
		double fuelCostFor1 = ((double)ov / km) * oc;
		return fuelCostFor1;
	}
}