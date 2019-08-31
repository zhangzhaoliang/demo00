package com.example.demo.controller;

import lombok.Data;

@Data
public class PerformanceProfile {
	
	private int task_id;
	private int area_id;
	private String tm_tick;
	private int point_total;
	private int location_id;
	private int poinnt_succ;
	private int point_err;
	private int ts_total;
	private int point_base;
	private int point_trim;
	private int percent_succ;
	private int probe_ip;

}
