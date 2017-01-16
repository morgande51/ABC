package org.aamc.abc.orders;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import org.aamc.abc.members.Member;
import org.aamc.abc.menu.CreamCheese;

/**
 * Entity implementation class for Entity: MemberOrder
 *
 */
@Entity
@Table(name="member_order")

public class MemberOrder implements Serializable {
	
	@Id
	private Long id;
	
	@Column(name="name", nullable=true)
	private String name;
	
	@ManyToOne
	@JoinColumn(name="member_id", nullable=false)
	private Member member;
	
	@OneToMany(mappedBy="order")
	private Set<MemberOrderItem> items;
	
	@ManyToMany
	@JoinTable(
			name="member_order_cream_cheese",
			joinColumns=@JoinColumn(name="member_order_id", nullable=false),
			inverseJoinColumns=@JoinColumn(name="cream_cheese_id", nullable=false)
	)
	private Set<CreamCheese> creamCheeses;
	
	@ManyToMany(mappedBy="memberOrders")
	private Set<Order> orders;
	
	private static final long serialVersionUID = 5186368229200211976L;
}