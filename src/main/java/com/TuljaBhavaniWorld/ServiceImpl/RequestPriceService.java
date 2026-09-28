package com.TuljaBhavaniWorld.ServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.TuljaBhavaniWorld.Dao.RequestPriceRepository;
import com.TuljaBhavaniWorld.Entity.RequestPrice;

@Service
public class RequestPriceService {

	@Autowired
	private RequestPriceRepository requestPriceRepository;

	public RequestPrice saveMessage(RequestPrice requestPrice) {

		requestPrice.setCreatedAt(LocalDateTime.now());

		return requestPriceRepository.save(requestPrice);

	}

	public List<RequestPrice> getListOfRequestPricePage() {

		return requestPriceRepository.findAll();
	}

	@Transactional
	public RequestPrice updateRequestPriceById(Long id) {

		return requestPriceRepository.findById(id).orElseThrow(() -> new RuntimeException("Request Price not found"));
	}

	// POST - update existing data
	@Transactional
	public RequestPrice updateRequestPriceById(Long id, RequestPrice requestPrice) {

		RequestPrice existingRequestPrice = requestPriceRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Request Price not found"));

		existingRequestPrice.setName(requestPrice.getName());
		existingRequestPrice.setProductName(requestPrice.getProductName());
		existingRequestPrice.setProductCategory(requestPrice.getProductCategory());
		existingRequestPrice.setQuantity(requestPrice.getQuantity());
		existingRequestPrice.setUnit(requestPrice.getUnit());
		existingRequestPrice.setEmail(requestPrice.getEmail());
		existingRequestPrice.setCompany(requestPrice.getCompany());
		existingRequestPrice.setLocation(requestPrice.getLocation());
		existingRequestPrice.setMobile(requestPrice.getMobile());
		existingRequestPrice.setMessage(requestPrice.getMessage());

		// createdAt is NOT changed

		return requestPriceRepository.save(existingRequestPrice);
	}

	public void deleteRequestPriceById(Long id) {

		requestPriceRepository.deleteById(id);

	}

}
