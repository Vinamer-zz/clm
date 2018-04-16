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
@Table(name = "CUSTOMER")
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 7721114229985548039L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID", nullable = false, precision = 19)
	private Long customerId;
	
	@Basic
	@Column(name = "LOGIN_ID", nullable = false, length = 30)
	private String loginId;
	
	@Basic
	@Column(name = "LOGIN_PASSWORD", nullable = false, length = 30)
	private String loginPassword;
	
	@Basic
	@Column(name = "ENTITY_TYPE", nullable = false, length = 30)
	private String entityType;
	
	@Basic
	@Column(name = "CASE_PRIORITY", nullable = false, length = 30)
	private String casePriority;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BASIC_DETAILS_ID", referencedColumnName = "BASIC_DETAILS_ID", nullable = true)
	private BasicDetails basicDetails;

}
