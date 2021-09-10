package com.pattern.flyweight;

/**
 * @author krisjin
 * @date 2015年1月26日
 */
public class EmployeeReportManager implements IReportManager {

    protected String tenantId;

    public EmployeeReportManager(String tenantId) {
        this.tenantId = tenantId;
    }

    public String createReport() {
        return "this is a employee report";
    }

}
