package com.shop2home.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;

	@NotNull
	private LocalDateTime dateAndTime;

	@NotNull(message = "quantity is mandatory")
	@Min(value = 1, message = "Minimum quantity of Product must be greater than 0")
	private Integer quantity;

	private Double totalCost;

	private String productName;

	@NotNull
	private Integer productId;

	private String sessionId;

}
