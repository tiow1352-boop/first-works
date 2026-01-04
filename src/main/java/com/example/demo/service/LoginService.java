package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.repositry.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService {

	
	/**ユーザー情報テーブルDAO*/
	private final UserInfoRepository repository;
	
	
	/**
	 * ユーザー情報テーブル　主キー検索
	 * @param loginId
　	 * @return　検索結果
	 */
	public Optional<UserInfo> searchUserById(String loginId){
		return repository.findById(loginId);
	}
}
