package com.platzi.ereservation.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "reservation")
public class Reservation {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idReservation;
	private Date inDate;
	private Date outDate;
	private int numberClients;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
}
