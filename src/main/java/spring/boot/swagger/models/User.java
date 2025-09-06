package spring.boot.swagger.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class User {

    @Schema(description = "User Id", example = "1")
    private String id;
    @Schema(description = "User Name", example = "John")
    private String name;
    @Schema(description = "USer Email", example = "john@gmail.com")
    private String email;

}
