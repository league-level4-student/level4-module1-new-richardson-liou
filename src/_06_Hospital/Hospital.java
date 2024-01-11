package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Patient> patients = new ArrayList<>();
	private ArrayList<Doctor> docs = new ArrayList<>();
	
	public void addDoctor(Doctor doc) {
		docs.add(doc);
		
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return docs;
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}


	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int pi = 0;
        for (Doctor doctor : docs) {
            while (pi < patients.size() && doctor.getPatients().size() < 3) {
                    try {
						doctor.assignPatient(patients.get(pi));
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    pi++;
               
            }
        }
	}
}
