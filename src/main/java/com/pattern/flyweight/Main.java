package com.pattern.flyweight;

/**
 * @author krisjin
 * @date 2015年1月26日
 */
public class Main {
	public static void main(String[] args) {
		ReportManagerFactory rmf = new ReportManagerFactory();
		
		IReportManager rm = rmf.getEmployeeReportManager("A");
		
		System.out.println(rm.createReport());
	}
}
