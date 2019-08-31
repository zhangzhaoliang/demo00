package com.example.demo.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/test")
	public List<User> test() {
		List<User> list = userService.queryUserList();
		return list;
	}
	
	
	@RequestMapping("/save")
	public String  save() {
		User user = new User();
		user.setName("zzl");
		user.setPwd(123456);
		userService.save(user);
		return "1";
	}
	
	@RequestMapping("/str")
	public Stream<User> str() {
		Stream<User> list = userService.stlist();
		list.close();
		
		
		
		StringBuilder str = new StringBuilder();
		str.append("Select ");
		str.append("task_id,area_id,tm_tick,point_total,location_id,point_succ,( point_total-point_succ ) AS point_err, ");
		str.append("( CASE WHEN point_succ = 0 THEN 0 ELSE ROUND(ts_total/point_succ,0) END) AS ts_total, ");
		str.append("point_succ as point_base,point_trim,( CASE WHEN point_total=0 THEN 0 ELSE point_succ/point_total END) AS percent_succ,probe_ip ");
		str.append(" FROM (SELECT tm_base,task_id,area_id,ts_total,city_id as location_id,ts_total as manually_trim,");
		str.append(" point_total,error_code,probe_ip FROM NB_TRAN WHERE task_id in (2)");
		str.append(" AND tm_base >=?");
		str.append(" AND tm_base <=?");
		str.append(" and is_noise = 0");
		str.append(" AND error_code not in ( 612282,612283,612284,612285,612289)");
		str.append(" ) t1 GROUP BY task_id ,location_id )  t2 where point_total >  0 ORDER BY task_id ,ts_total");
		
		
		
		
		
		
		
		
		
		
		
		 
		/*
		 * FROM ( SELECT task_id, area_id,
		 * FROM_UNIXTIME(1565338260+floor((UNIX_TIMESTAMP(tm_base)-1565338260)/60/60)*60
		 * *60) As tm_tick, location_id, SUM(point_total) AS point_total, SUM(CASE WHEN
		 * error_code >600000 THEN 0 ELSE point_total END) AS point_succ, SUM(CASE WHEN
		 * 1<0 OR error_code >600000 THEN 0 ELSE point_total END) AS point_base,
		 * SUM(CASE WHEN 1<0 OR error_code >600000 THEN 0 ELSE ts_total * point_total
		 * END) AS ts_total, SUM(CASE WHEN 1<0 THEN point_total ELSE 0 END) AS
		 * point_trim, probe_ip as probe_ip FROM ( SELECT tm_base, task_id, area_id,
		 * ts_total, city_id as location_id, ts_total as manually_trim, point_total,
		 * error_code, probe_ip FROM NB_TRAN WHERE task_id in ( 2) AND tm_base >=
		 * '2019-08-09 16:11:00' AND tm_base <= '2019-08-10 16:11:00' and is_noise = 0
		 * AND error_code not in ( 612282,612283,612284,612285,612289) ) t1 GROUP BY
		 * task_id ,location_id ) t2 where point_total > 0 ORDER BY task_id ,ts_total
		 * 
		 */
		
		
		
		return list;
	}

}
