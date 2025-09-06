package spring.boot.swagger.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreateUserRequest {

    @Schema(description = "The full name of the user, Only letters and space are allowed.",
    example = "John Doe", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(description = "The email address of the user. Must be a valid email format",
            example = "john@gmail.com")
    private String email;

}
