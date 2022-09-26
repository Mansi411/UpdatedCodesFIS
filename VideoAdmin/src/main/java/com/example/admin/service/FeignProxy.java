package com.example.admin.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.admin.model.UserModel;

@FeignClient(name="videocustomer")
public interface FeignProxy {

	@GetMapping("/customer/display")
	public List<UserModel> displayAllUser();
}
