package EmergencyContact.conf.factory;

import EmergencyContact.domain.Medical;

/**
 * Created by graham on 2015/09/20.
 */
public class MedicalFactory {
    public static Medical createMedical(String bloodType, String allergies, String medicalAid, String medicalAidNumber){

        Medical medical = new Medical
                .Builder(bloodType)
                .allergies(allergies)
                .medicalAid(medicalAid)
                .medicalAidNumber(medicalAidNumber)
                .build();
        return medical;
    }
}
