package com.wellsfargo.batch7.group3.service;

import com.wellsfargo.batch7.group3.entities.ServiceProvider;
import com.wellsfargo.batch7.group3.exception.IBSException;

public interface IServiceProviderService {
	
	ServiceProvider checkpayments(ServiceProvider chkpymnt) throws IBSException;

}
