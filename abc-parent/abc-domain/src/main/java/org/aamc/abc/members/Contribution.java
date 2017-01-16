package org.aamc.abc.members;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contribution
 *
 */
@Entity
@Table(name="contribution")

public class Contribution implements Serializable {
	
	@Id
	private Long id;
	
	@Column(name="amount", nullable=false)
	private Float amount;
	
	@Temporal(TemporalType.DATE)
	@Column(name="donated_on", nullable=false)
	private Date donatedOn;
	
	@ManyToOne
	@JoinColumn(name="member_id", nullable=false)
	private Member member;
	
	private static final long serialVersionUID = -6717355426972219320L;
}