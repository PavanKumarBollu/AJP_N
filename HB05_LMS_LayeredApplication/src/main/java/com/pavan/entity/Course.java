package com.pavan.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false)
	private String courseCode;

	@Column(unique = true, nullable = false)
	private String courseName;

	private String courseAlis;

	private String eligibility;

	private Integer minBatchSize = 10;

	private Integer maxBatchSize = 50;

	@Column(nullable = false)
	private Double courseFee;

	private Boolean placementSupport = false;
	private Boolean preScreeingReq = false;

	@Column(nullable = false)
	private Integer totalDurationHours;

	private Integer iltHours = 0;

	private Integer selfLearningHours = 0;

	private Integer iltProjectHours = 0;

	private Integer leraningProjectHours = 0;

	private Integer revisionHours = 0;

	private Integer totalCertifications = 0;

	@Column(nullable = false)
	private String createdby;

	@Column(nullable = false)
	private String status;

	private Boolean isActive = true;

	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseAlis() {
		return courseAlis;
	}

	public void setCourseAlis(String courseAlis) {
		this.courseAlis = courseAlis;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public Integer getMinBatchSize() {
		return minBatchSize;
	}

	public void setMinBatchSize(Integer minBatchSize) {
		this.minBatchSize = minBatchSize;
	}

	public Integer getMaxBatchSize() {
		return maxBatchSize;
	}

	public void setMaxBatchSize(Integer maxBatchSize) {
		this.maxBatchSize = maxBatchSize;
	}

	public Double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}

	public Boolean getPlacementSupport() {
		return placementSupport;
	}

	public void setPlacementSupport(Boolean placementSupport) {
		this.placementSupport = placementSupport;
	}

	public Boolean getPreScreeingReq() {
		return preScreeingReq;
	}

	public void setPreScreeingReq(Boolean preScreeingReq) {
		this.preScreeingReq = preScreeingReq;
	}

	public Integer getTotalDurationHours() {
		return totalDurationHours;
	}

	public void setTotalDurationHours(Integer totalDurationHours) {
		this.totalDurationHours = totalDurationHours;
	}

	public Integer getIltHours() {
		return iltHours;
	}

	public void setIltHours(Integer iltHours) {
		this.iltHours = iltHours;
	}

	public Integer getSelfLearningHours() {
		return selfLearningHours;
	}

	public void setSelfLearningHours(Integer selfLearningHours) {
		this.selfLearningHours = selfLearningHours;
	}

	public Integer getIltProjectHours() {
		return iltProjectHours;
	}

	public void setIltProjectHours(Integer iltProjectHours) {
		this.iltProjectHours = iltProjectHours;
	}

	public Integer getLeraningProjectHours() {
		return leraningProjectHours;
	}

	public void setLeraningProjectHours(Integer leraningProjectHours) {
		this.leraningProjectHours = leraningProjectHours;
	}

	public Integer getRevisionHours() {
		return revisionHours;
	}

	public void setRevisionHours(Integer revisionHours) {
		this.revisionHours = revisionHours;
	}

	public Integer getTotalCertifications() {
		return totalCertifications;
	}

	public void setTotalCertifications(Integer totalCertifications) {
		this.totalCertifications = totalCertifications;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseCode=" + courseCode + ", courseName=" + courseName + ", courseAlis="
				+ courseAlis + ", eligibility=" + eligibility + ", minBatchSize=" + minBatchSize + ", maxBatchSize="
				+ maxBatchSize + ", courseFee=" + courseFee + ", placementSupport=" + placementSupport
				+ ", preScreeingReq=" + preScreeingReq + ", totalDurationHours=" + totalDurationHours + ", iltHours="
				+ iltHours + ", selfLearningHours=" + selfLearningHours + ", iltProjectHours=" + iltProjectHours
				+ ", leraningProjectHours=" + leraningProjectHours + ", revisionHours=" + revisionHours
				+ ", totalCertifications=" + totalCertifications + ", createdby=" + createdby + ", status=" + status
				+ ", isActive=" + isActive + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
