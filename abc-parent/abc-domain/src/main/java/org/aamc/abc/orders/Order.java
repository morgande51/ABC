package org.aamc.abc.orders;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import org.aamc.abc.members.Member;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity
@Table(name="order")

public class Order implements Serializable {

	@Id
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ordered_on", nullable=false)
	private Date orderedOn;
	
	@ManyToOne
	@JoinColumn(name="pickup_member_id", nullable=false)
	private Member pickedUpBy;
	
	@ManyToMany
	@JoinTable(
			name="order_items",
			joinColumns=@JoinColumn(name="order_id", nullable=false),
			inverseJoinColumns=@JoinColumn(name="member_order_id", nullable=false)
	)
	private Set<MemberOrder> memberOrders;
 
	private static final long serialVersionUID = 8803144495911036395L;
}