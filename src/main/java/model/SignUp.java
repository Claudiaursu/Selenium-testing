package model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

@Getter
@Setter
public class SignUp {

    public SignUp(){
        this.firstName = RandomStringUtils.randomAlphabetic(5);
        this.lastName = RandomStringUtils.randomAlphabetic(5);
        this.email = RandomStringUtils.random(5) + "@gmail.com";
        this.phone = RandomStringUtils.randomNumeric(10);
        this.password = RandomStringUtils.random(7);
        this.address = RandomStringUtils.random(8);
    }
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String address;

}
