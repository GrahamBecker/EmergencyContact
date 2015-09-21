package EmergencyContact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by graham on 2015/09/20.
 */
@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String contact;

    private User(){
    }

    public String getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDob(){
        return dob;
    }
    public String getAddress(){
        return address;
    }
    public String getContact(){
        return contact;
    }
    public User(Builder builder){
        id=builder.id;
        firstName=builder.firstName;
        lastName=builder.lastName;
        dob=builder.dob;
        address=builder.address;
        contact=builder.contact;
    }
    public static class Builder{
        private String id;
        private String firstName;
        private String lastName;
        private String dob;
        private String address;
        private String contact;

        public Builder(String lastName){
            this.lastName = lastName;
        }
        public Builder copy(User value){
            this.id=value.id;
            this.firstName=value.firstName;
            this.lastName=value.lastName;
            this.dob=value.dob;
            this.address=value.address;
            this.contact=value.contact;
            return this;
        }
        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }
        public Builder dob(String value){
            this.dob=value;
            return this;
        }
        public Builder address(String value){
            this.address=value;
            return this;
        }
        public Builder contact(String value){
            this.contact=value;
            return this;
        }
        public Builder id(String value){
            this.id=value;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);

    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

    @Override
    public String toString(){
        return "User{" +
                "Last Name = " + lastName + "," +
                "First Name = " + firstName + "," +
                "Date of Birth = " + dob + "," +
                "Address = " + address + "," +
                "Contact = " + contact + "," +
                "}";
    }

}
