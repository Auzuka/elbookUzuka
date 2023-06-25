package com.example.demo.Service.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Entity.UserList;

import lombok.Data;

@Data
public class CustomDetails implements UserDetails {
	
	private UserList userList;
	
	public CustomDetails(UserList userInfo) {
		this.userList = userInfo;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList(userList.getAuthority().toString());
	}
 
	@Override
	public String getPassword() {
		return userList.getPass();
	}
 
	@Override
	public String getUsername() {
		return userList.getUser_name();
	}
 
	@Override
	// アカウントが有効期限内であるか
	public boolean isAccountNonExpired() {
		return true;
	}
 
	@Override
	// アカウントがロックされていないか
	public boolean isAccountNonLocked() {
		return true;
	}
 
	@Override
	//	資格情報が有効期限内であるか
	public boolean isCredentialsNonExpired() {
		return true;
	}
 
	@Override
	// 有効なアカウントであるか
	public boolean isEnabled() {
		return true;
	}

}
