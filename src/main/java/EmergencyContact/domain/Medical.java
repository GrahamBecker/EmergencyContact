package EmergencyContact.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/09/20.
 */
@Embeddable
public class Medical implements Serializable{
    private String bloodType;
    private String allergies;
    private String medicalAid;
    private String medicalAidNumber;

    private Medical(){

    }
    public Medical(Builder builder){
        bloodType=builder.bloodType;
        allergies=builder.allergies;
        medicalAid=builder.medicalAid;
        medicalAidNumber=builder.medicalAidNumber;
    }
    public String getBloodType(){
        return bloodType;
    }
    public String getAllergies(){
        return allergies;
    }
    public String getMedicalAid(){
        return medicalAid;
    }
    public String getMedicalAidNumber(){
        return medicalAidNumber;
    }

    public static class Builder{
        private String bloodType;
        private String allergies;
        private String medicalAid;
        private String medicalAidNumber;

        public Builder(String bloodType){
            this.bloodType = bloodType;
        }

        public Builder allergies(String value){
            this.allergies=value;
            return this;
        }
        public Builder medicalAid(String value){
            this.medicalAid=value;
            return this;
        }
        public Builder medicalAidNumber(String value){
            this.medicalAidNumber=value;
            return this;
        }

        public Builder copy(Medical value){
            this.bloodType=value.bloodType;
            this.allergies=value.allergies;
            this.medicalAid=value.medicalAid;
            this.medicalAidNumber=value.medicalAidNumber;
            return this;
        }

        public Medical build(){
            return new Medical(this);
        }
    }

}
