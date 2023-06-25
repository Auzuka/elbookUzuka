package com.example.demo.Service.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserList;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
	
	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserList userInfo = userRepository.findByUsername(username);
		if(userInfo == null) {
			throw new UsernameNotFoundException(username + " is not found");
		}
		return new CustomDetails(userInfo);
		
//		 userRepository.findByUsername(username)
//				.map(
//						user -> new CustomUserDetails(
//								user.getUser_name(),
//								user.getPass(),
////								Collections.emptyList()
//								toGrantedAuthorityList(user.getAuthority())
//						)
//				)
//				.orElseThrow(
//						() ->new UsernameNotFoundException(
//								"Given user_name is not found. (username = '" + username + "')"
//						)
//				);
	}
		
//		private List<GrantedAuthority>toGrantedAuthorityList(UserList.Authority authority){
//			return Collections.singletonList(new SimpleGrantedAuthority(authority.name()));		
//	}

}
