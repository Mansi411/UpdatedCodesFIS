package com.example.admin.service;

import java.util.List;

import com.example.admin.model.Admin;
import com.example.admin.model.UserModel;

public interface AdminService {

	public List<Admin> findallMovieData();
	public Admin addMovieData(Admin model);
	public String deleteMovieData(int movie_id);
	public List<UserModel> displayAllUser();
	public Admin updateMoviedata(Admin model);
}
