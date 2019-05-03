package getRequestTests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {
    @JsonProperty
    List<User> usersData;

    public Data() {
    }

    public Data(List<User> usersData) {
        this.usersData = usersData;
    }

    public List<User> getUsersData() {
        return usersData;
    }

    public void setUsersData(List<User> usersData) {
        this.usersData = usersData;
    }
}
