package spring.boot.swagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.swagger.models.CreateUserRequest;
import spring.boot.swagger.models.User;

import java.util.UUID;

@Tag(name = "User API", description = "This Controller Contains User Related API's")
@RestController
@RequestMapping("/users")
public class UserController {

    final String description = """
            <div>
            <p><b>Name:</b> The full name of the user, It is required field.</p>
            <p><b>Example:</b> John Doe</p>
            </div>
            """;

    @PostMapping
    @Operation(description = description,
            summary = "Create User",
            responses = {
                    @ApiResponse(responseCode = "200", description = "User Created SuccessFully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
                    @ApiResponse(responseCode = "400", description = "Invalid Input Payload", content = @Content(mediaType = "application/json"))
            }
    )
    public User createUser(@RequestBody CreateUserRequest createUserRequest) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName(createUserRequest.getName());
        user.setEmail(createUserRequest.getEmail());
        return user;
    }

}
