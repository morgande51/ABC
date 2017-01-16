package org.aamc.abc.menu;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bagel
 *
 */
@Entity
@Table(name="bagel")

public class Bagel extends AbstractFood implements Serializable {
	
	@Id
	private Long id;
	
	@Column(name="cheese", nullable=true)
	private boolean cheese;

	private static final long serialVersionUID = 6336459911011269504L;
}