package getRequestTests;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class User {
    @JsonProperty
    String last_name;
    @JsonProperty
    Integer id;
    @JsonProperty
    String avatar ;
    @JsonProperty
    String  first_name;
    public User(String last_name, Integer id, String avatar, String first_name) {
        this.last_name = last_name;
        this.id = id;
        this.avatar = avatar;
        this.first_name = first_name;
    }

    public User() {

    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Integer getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getFirst_name() {
        return first_name;
    }
}
