package _06_Hospital;

import java.util.ArrayList;

class GeneralPractitioner extends Doctor {

	@Override
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doMedicine() {
		ArrayList<Patient> patients = getPatients();
		// TODO Auto-generated method stub
		for(Patient p : patients) {
			p.caredFor = true;
		}
	}
    


}
