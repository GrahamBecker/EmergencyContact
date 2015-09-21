package EmergencyContact.domain;

import javax.persistence.Embeddable;

/**
 * Created by graham on 2015/09/20.
 */
@Embeddable
public class NextOfKin {
    private String firstName;
    private String lastName;
    private String relationship;
    private String contact;

    private NextOfKin(){

    }

    public NextOfKin(Builder builder){
        firstName=builder.firstName;
        lastName=builder.lastName;
        relationship=builder.relationship;
        contact=builder.contact;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getRelationship(){
        return relationship;
    }
    public String getContact(){
        return contact;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String relationship;
        private String contact;

        public Builder(String lastName){
            this.firstName=lastName;
        }
        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }
        public Builder relationship(String value){
            this.relationship=value;
            return this;
        }
        public Builder contact(String value){
            this.contact=value;
            return this;
        }
        public Builder copy(NextOfKin value){
            this.firstName=value.firstName;
            this.lastName=value.lastName;
            this.relationship=value.relationship;
            this.contact=value.contact;
            return this;
        }
        public NextOfKin build(){
            return new NextOfKin(this);
        }
    }
}
