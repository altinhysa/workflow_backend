package com.dashboard.app.auth;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotNull(message = "Can't be null")
    @NotBlank(message = "Can't be empty")
    private String firstName;
    @NotNull(message = "Can't be null")
    @NotBlank(message = "Can't be empty")
    private String lastName;
    @NotNull(message = "Can't be null")
    @NotBlank(message = "Can't be empty")
    private String email;
    @Size(min = 8,message = "must be 8 characters or longer")
    @NotBlank(message = "Can't be empty")
    private String password;


}
