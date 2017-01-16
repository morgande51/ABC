package org.aamc.abc.orders;

import java.io.Serializable;
import javax.persistence.*;

import org.aamc.abc.menu.Bagel;

/**
 * Entity implementation class for Entity: MemberOrderItem
 *
 */
@Entity
@Table(name="member_order_items")

public class MemberOrderItem implements Serializable {
	
	@Id
	private long id;
	
	@Column(name="count", nullable=false)
	private Integer ammount;
	
	@ManyToOne
	@JoinColumn(name="bagel_id", nullable=false)
	private Bagel bagel;
	
	@ManyToOne
	@JoinColumn(name="order_id", nullable=false)
	private MemberOrder order;
	
	private static final long serialVersionUID = -4181157722732257095L;
}