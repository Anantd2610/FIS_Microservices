package com.fis.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.account.bean.Account;

@RestController
@RequestMapping("/accounts")
public class AccountCrontroller {
	@GetMapping("/{number}")
	public Account getAccount(@PathVariable long number)
	{
		return new Account(9879879734321l, "saving", 234343);
	}

}
