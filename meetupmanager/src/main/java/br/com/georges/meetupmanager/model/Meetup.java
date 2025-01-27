package br.com.georges.meetupmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Meetup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String event;
	
	@JoinColumn(name = "id_registration")
	@ManyToOne
	private Registration registration;
	
	@Column
	private String meetupdate;
	
	@Column
	private Boolean registrated;

}
