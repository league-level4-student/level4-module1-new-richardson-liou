package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	private ArrayList<Patient> patients = new ArrayList<>();

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void assignPatient(Patient patient) throws DoctorFullException {
    	if (patients.size()<3) {
    		patients.add(patient);
    	}
    	
    	else {
    		throw new DoctorFullException("Doctor cannot have more than 3 patients.");
    	}
    }

    
    public abstract boolean makesHouseCalls();
    

	public abstract boolean performsSurgery();

	public abstract void doMedicine();
}
