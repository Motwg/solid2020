package pl.zzpj2020.solid.ocp.usa.solution;

public class USASpeedLimitFines {

	public double calculateSpeedLimitFine(IUSAState state, int speed) {
		return state.calculateFine(speed);
	}

}
