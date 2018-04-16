package clm.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "ADDRESS")
public class Address implements Serializable{

	private static final long serialVersionUID = 4629819418170124013L;

}
