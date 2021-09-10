package com.pattern.flyweight;

/**
 * @author krisjin
 * @date 2015年1月26日
 */
public class FinancialReportManager implements IReportManager {
    private String tenantId;

    public FinancialReportManager(String tenantId) {
        this.tenantId = tenantId;
    }

    public String createReport() {

        return "this is a finanical report";

    }

}
