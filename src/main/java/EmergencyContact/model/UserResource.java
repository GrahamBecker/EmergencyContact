package EmergencyContact.model;

import EmergencyContact.domain.Medical;
import EmergencyContact.domain.NextOfKin;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by graham on 2015/09/21.
 */
public class UserResource extends ResourceSupport {

    private String id;
    private String name;

    private NextOfKin nok;

    private Medical medical;

    private UserResource(){

    }

    public NextOfKin getNok(){
        return nok;
    }

    public Medical getMedical(){
        return medical;
    }

    public UserResource(Builder builder){
        this.nok=builder.nok;
        this.medical=builder.medical;
        this.id=builder.id;
        this.name=builder.name;
    }
    public static class Builder{
        private String id;
        private String name;
        private NextOfKin nok;
        private Medical medical;

        public Builder(String name){
            this.name = name;
        }
        public Builder id(String value){
            this.id=value;
            return this;
        }

        public Builder nok(NextOfKin value){
            this.nok=value;
            return this;
        }

        public Builder medical(Medical value){
            this.medical=value;
            return this;
        }

        public Builder copy(UserResource value){
            this.id=value.id;
            this.name=value.name;
            this.medical=value.medical;
            this.nok=value.nok;
            return this;
        }

        public UserResource build(){
            return new UserResource(this);
        }
    }
}
