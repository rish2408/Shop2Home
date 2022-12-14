package com.shop2home.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Admin {

	@Id
	@Min(value = 1, message = "Admin Id must be always greater than 0  !!")
	@NotNull
	private Integer adminId;

	@NotEmpty(message = "password must not Empty or null!!")
	@Size(min = 3, max = 15, message = "admin passsword should contain min 3 and max 15 chars!!")
	private String adminPass;

}
