package org.simulator.audit.model;


public interface AuditService {

	public abstract OcppAudit audit(String deviceSerial, String request, String response);

	public abstract OcppAudit auditError(String deviceSerial, String request, Exception e);

}