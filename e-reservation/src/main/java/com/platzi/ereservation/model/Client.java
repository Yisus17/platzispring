/**
 * 
 */
package com.platzi.ereservation.model;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author jaas1
 *
 */

@Data
@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idClient;
	
	
	private String name;
	private String lastName;
	private String identification;
	private String address;
	private String phone;
	private String email;
	
	@OneToMany(mappedBy = "client")
	private Set<Reservation> reservations;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
