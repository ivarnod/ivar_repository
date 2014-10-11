package com.ivar.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="EMPLOYEE_ANNOTATED", uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})

public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, unique=true, length=11)
	private int id;
	 @Column(name="NAME", length=20, nullable=true)
	    private String name;
	     
	    @Column(name="ROLE", length=20, nullable=true)
	    private String role;
	     
	    @Column(name="insert_time", nullable=true)
	    private Date insertTime;

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the role
		 */
		public String getRole() {
			return role;
		}

		/**
		 * @param role the role to set
		 */
		public void setRole(String role) {
			this.role = role;
		}

		/**
		 * @return the insertTime
		 */
		public Date getInsertTime() {
			return insertTime;
		}

		/**
		 * @param insertTime the insertTime to set
		 */
		public void setInsertTime(Date insertTime) {
			this.insertTime = insertTime;
		}

}
