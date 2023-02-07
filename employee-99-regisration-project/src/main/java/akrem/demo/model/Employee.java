package akrem.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.regex.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
//    @NotNull    // except null, anything can be accepted
//    @NotBlank   // except null and empty string, anything can be accepted
//    @NotEmpty   // except null, empty string and space anything can be accepted
    @NotBlank(message = "Your first name is required")
    @Size(max = 12,min = 2)
    private String firstName;

    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;


}
