package EmergencyContact.domain;

import javax.persistence.Embeddable;

/**
 * Created by graham on 2015/09/20.
 */
@Embeddable
public class NextOfKin {
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    private String relationship;
    private String contact;

    private NextOfKin(){

    }

    public NextOfKin(Builder builder){
        id=builder.id;
        userId=builder.userId;
        firstName=builder.firstName;
        lastName=builder.lastName;
        relationship=builder.relationship;
        contact=builder.contact;
    }

    public String getId() {return id;}
    public String getUserId() {return userId;}
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
        private String id;
        private String userId;
        private String firstName;
        private String lastName;
        private String relationship;
        private String contact;

        public Builder (String value){
            this.id=value;
        }
        public Builder userId(String value){
            this.userId=value;
            return this;
        }
        public Builder lastName(String value){
            this.lastName=value;
            return this;
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
            this.id=value.id;
            this.userId=value.userId;
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
