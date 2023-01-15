package com.soft6creators.futurespace.app.withdrawal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithdrawalController {
	@Autowired
	private WithdrawalService withdrawalService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/withdrawal")
	public Withdrawal addWithdrawal(@RequestBody Withdrawal withdrawal) {
		return withdrawalService.addWithdrawal(withdrawal);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/withdrawal")
	public Withdrawal updateWithdrawal(@RequestBody Withdrawal withdrawal) {
		return withdrawalService.addWithdrawal(withdrawal);
	}
	
	@RequestMapping("/withdrawal/{withdrawalId}")
	public Optional<Withdrawal> getWithdrawal(@PathVariable int withdrawalId) {
		return withdrawalService.getWithdrawal(withdrawalId);
	}
	
	@RequestMapping("/user/{userEmail}/withdrawal")
	public Optional<Withdrawal> getWithdrawalByUser(@PathVariable String userEmail) {
		return withdrawalService.getWithdrawalByUser(userEmail);
	}
	
	@RequestMapping("/withdrawals/{withdrawalStatus}")
	public List<Withdrawal> getWithdrawalsByWithdrawalStatus(@PathVariable String withdrawalStatus) {
		return withdrawalService.getWithdrawalsByWithdrawalStatus(withdrawalStatus);
	}
}
