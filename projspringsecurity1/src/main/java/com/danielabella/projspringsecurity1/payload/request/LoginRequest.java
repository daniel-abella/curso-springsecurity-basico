package com.danielabella.projspringsecurity1.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor @Data
public class LoginRequest {

	@NotBlank
	private String username;

	@NotBlank
	private String password;
}
