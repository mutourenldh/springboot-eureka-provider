package com.haoge.eureka.provider.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
	
	public String getTicket() {
		System.out.println(8002);
		return "第一张电影票";
	}

}
