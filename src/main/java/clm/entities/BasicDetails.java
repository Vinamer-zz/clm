package clm.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "BASIC_DETAILS")
public class BasicDetails implements Serializable{

	private static final long serialVersionUID = 6775491643277878748L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BASIC_DETAILS_ID", nullable = false, precision = 19)
	private Long basicDetailsId;
	
	@Basic
	@Column(name = "NAME", nullable = true, length = 100)
	private String name;
	
	@Basic
	@Column(name = "ZONAL_OFFICE", nullable = true, length = 100)
	private String zonalOffice;
	
	@Basic
	@Column(name = "RELATIONSHIP_MANAGER", nullable = true, length = 100)
	private String relationshipManager;
	
	@Basic
	@Column(name = "TEAM_LEADER", nullable = true, length = 100)
	private String teamLeader;
	
	@Basic
	@Column(name = "CASE_NUMBER", nullable = true, length = 100)
	private String caseNumber;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID", nullable = true)
	private Address address;


}
