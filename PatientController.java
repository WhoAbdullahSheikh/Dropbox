
import com.mycompany.mavenproject1.Patient;


/**
 * @author MacBookPro
 * @version 1.0
 * @created 22-Dec-2022 7:08:20 PM
 */
public class PatientController {

	public PatientRegister m_PatientRegister;

    public PatientController(PatientRegister m_PatientRegister) {
        this.m_PatientRegister = m_PatientRegister;
    }

	public PatientController(){

	}

	public void finalize() throws Throwable {

	}
	public boolean blockRatient(){
		return false;
	}

	/**
	 * 
	 * @param nPatient
	 */
	public boolean createPatientRecord(Patient nPatient){
		return false;
	}

	public boolean delPatient(){
		return false;
	}

	public boolean editPatient(){
		return false;
	}

	public Patient searchPatient(){
		return null;
	}
}//end PatientController