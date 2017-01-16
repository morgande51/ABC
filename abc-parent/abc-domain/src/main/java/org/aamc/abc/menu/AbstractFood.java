package org.aamc.abc.menu;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractFood implements Serializable {
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Lob
	@Basic(fetch=FetchType.LAZY)
	@Column(name="description", nullable=true)
	private String description;
	
	@Column(name="calories", nullable=false)
	private Integer calories;
	
	@Column(name="vegan", nullable=false)
	private boolean vegan;
	
	@Column(name="spicy", nullable=true)
	private boolean spicy;
	
	private static final long serialVersionUID = -1063462574185020681L;
}