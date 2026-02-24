package org.anudip.dto;

import java.time.LocalDateTime;

public class AuthUserDTO {

	private Long id;
	private String loginId;
	private String password;

	private String role;
	private String status;
	private Integer failedAttempts = 0;
	private Boolean accountLocked = false;
	private Boolean isActive = true;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getFailedAttempts() {
		return failedAttempts;
	}
	public void setFailedAttempts(Integer failedAttempts) {
		this.failedAttempts = failedAttempts;
	}
	public Boolean getAccountLocked() {
		return accountLocked;
	}
	public void setAccountLocked(Boolean accountLocked) {
		this.accountLocked = accountLocked;
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
		return "AuthUserDTO [id=" + id + ", loginId=" + loginId + ", password=" + password + ", role=" + role
				+ ", status=" + status + ", failedAttempts=" + failedAttempts + ", accountLocked=" + accountLocked
				+ ", isActive=" + isActive + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
}
