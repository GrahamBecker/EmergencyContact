package EmergencyContact.domain;

import javax.persistence.*;

/**
 * Created by graham on 2015/09/20.
 */
@Entity
public class NextOfKin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String relationship;
    private String contact;

    private NextOfKin(){

    }

    public NextOfKin(Builder builder){
        id=builder.id;
        firstName=builder.firstName;
        lastName=builder.lastName;
        relationship=builder.relationship;
        contact=builder.contact;
    }

    public Long getId() {return id;}
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
        private Long id;
        private String firstName;
        private String lastName;
        private String relationship;
        private String contact;

        public Builder (Long id){
            this.id=id;
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
