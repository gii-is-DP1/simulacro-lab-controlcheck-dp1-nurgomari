package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductType extends BaseEntity{
	@Length(min = 3, max = 50)
	@Column(name = "name", unique = true)
	private String name;
}
