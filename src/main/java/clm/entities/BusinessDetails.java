package clm.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "BUSINESS_DETAILS")
public class BusinessDetails implements Serializable{

	private static final long serialVersionUID = -3352371496718483750L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BUSINESS_DETAILS_ID", nullable = false, precision = 19)
	private Long businessDetailsId;
	
	@Basic
	@Column(name = "CONSTITUTION", nullable = true, length = 40)
	private String constitution;
	
	@Basic
	@Column(name = "BUSINESS_NAME", nullable = true, length = 40)
	private String businessName;
	
	@Basic
	@Column(name = "INCORPORATED_ON", nullable = true, length = 40)
	private String incorporatedOn;
	
	@Basic
	@Column(name = "UNIQUE_IDENTIFICATION_NUMBER", nullable = true, length = 40)
	private String uid;
	
	@Basic
	@Column(name = "COUNTRY_OF_INCORPORATION", nullable = true, length = 40)
	private String countryOfIncorporation;
	
	@Basic
	@Column(name = "STATE_OF_INCORPORATION", nullable = true, length = 40)
	private String stateOfIncorporation;
	
	@Basic
	@Column(name = "BUSINESS_NUMBER", nullable = true, length = 40)
	private String businessNumber;
	
	@Basic
	@Column(name = "EMAIL_ADDRESS", nullable = true, length = 40)
	private String email;
	
	@Basic
	@Column(name = "SECTORAL_CLASSIFICATION", nullable = true, length = 40)
	private String sectoralClassification;
	
	@Basic
	@Column(name = "INDUSTRIAL_CLASSIFICATION", nullable = true, length = 40)
	private String industrialClassification;
	
	@Basic
	@Column(name = "BUSINESS_INFO", nullable = true, length = 40)
	private String businessInfo;
	
	@Basic
	@Column(name = "SITE_VISIT_DETAILS", nullable = true, length = 40)
	private String siteVisitDetails;
	
	@Basic
	@Column(name = "DIRECTOR_NAME", nullable = true, length = 40)
	private String directorName;
}
