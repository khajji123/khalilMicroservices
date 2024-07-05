package com.khalil.siteservice.client;

import java.util.List;

import com.khalil.siteservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserClient {
	
	@GetMapping("/site/{siteId}")
	List<User> findBySiteId(@PathVariable("siteId") Long siteId);
	
}
