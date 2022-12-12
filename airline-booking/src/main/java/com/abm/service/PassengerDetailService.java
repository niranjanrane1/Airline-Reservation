package com.abm.service;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abm.entity.PassengerDetail;
import com.abm.repository.PassengerDetailRepository;

@Service
@Transactional
public class PassengerDetailService {
	
	@Autowired
	PassengerDetailRepository passRepo;
	public int addAllPassengers(PassengerDetail passengerDetail) {
		
		//PassengerDetail passengerDetail;
		//Generate PNR
		/*Set<Integer> pnrGenerated = new HashSet<>();
		Random	random = new Random();
		int pnr;
		do {
			pnr = random.nextInt();
		}while(pnrGenerated.contains(pnr));
		
		
		//Save Passenger Details
		for(PassengerDetail passenger : passengerDetailsList) {
			passengerDetail = passenger;
			passengerDetail.setPnr(pnr);
			passRepo.save(passengerDetail);
			
		}*/
		Random	random = new Random();
		int pnr =  random.nextInt();
		
		passengerDetail.setPnr(pnr);
		
		passRepo.save(passengerDetail);
		
		return pnr;
	}

}
