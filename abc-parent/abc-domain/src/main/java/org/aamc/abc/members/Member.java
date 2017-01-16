package org.aamc.abc.members;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

import org.aamc.abc.orders.MemberOrder;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity
@Table(name="member")

public class Member implements Serializable {

	@Id
	private Long id;
	
	@Column(name="email", nullable=false, unique=true)
	private String email;
	
	@Column(name="pwd", nullable=false)
	private String password;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Column(name="admin", nullable=true)
	private Boolean admin;
	
	@ManyToOne
	@JoinColumn(name="default_order_id", nullable=true)
	private MemberOrder defaultOrder;
	
	@OneToMany(mappedBy="member")
	private Set<MemberOrder> orders;
	
	@OneToMany(mappedBy="member")
	private Set<Contribution> contributions;

	private static final long serialVersionUID = 6819958559846511029L;
}