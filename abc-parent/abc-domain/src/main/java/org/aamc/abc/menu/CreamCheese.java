package org.aamc.abc.menu;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import org.aamc.abc.orders.MemberOrder;

/**
 * Entity implementation class for Entity: CreamCheese
 *
 */
@Entity
@Table(name="cream_cheese")

public class CreamCheese extends AbstractFood implements Serializable {
	
	@Id
	private Long id;
	
	@ManyToMany(mappedBy="creamCheeses")
	private Set<MemberOrder> memberOrders;
	
	private static final long serialVersionUID = 6336459911011269504L;
}