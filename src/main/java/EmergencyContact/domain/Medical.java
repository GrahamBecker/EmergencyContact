package EmergencyContact.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by graham on 2015/09/20.
 */
@Entity
public class Medical implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bloodType;
    private String allergies;
    private String medicalAid;
    private String medicalAidNumber;


    private Medical(){

    }
    public Medical(Builder builder){
        id=builder.id;
        bloodType=builder.bloodType;
        allergies=builder.allergies;
        medicalAid=builder.medicalAid;
        medicalAidNumber=builder.medicalAidNumber;
    }
    public Long getId() {return id;}
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
        private Long id;
        private String bloodType;
        private String allergies;
        private String medicalAid;
        private String medicalAidNumber;

        public Builder(Long id){
            this.id = id;
        }

        public Builder bloodType(String bloodType){
            this.bloodType = bloodType;
            return this;
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
            this.id=value.id;
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
