package _06_Hospital;

public class Patient {
	public boolean caredFor;

    public void checkPulse() {
        caredFor = true;
    }

    public boolean feelsCaredFor() {
        return caredFor;
    }
}
