package com.aguacate.send2cuba.restful.rest.frontend;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;
import com.aguacate.send2cuba.restful.dto.frontend.OfferDto;
import com.aguacate.send2cuba.restful.dto.frontend.PackageOfferSearchParametersDto;
import com.aguacate.send2cuba.restful.dto.frontend.TestPackageOfferSearchParametersDto;

@RestController
@RequestMapping(value = "/package")
public class PackageController {

	@RequestMapping(value = "/offers")
	@ResponseBody
	public List<OfferDto> getAll(@RequestParam(value = "zipCode", required = false) Integer zipCode,
			@RequestParam(value = "special", required = false) Boolean special,
			@RequestParam(value = "minimumPrice", required = false) BigDecimal minimumPrice,
			@RequestParam(value = "maximumPrice", required = false) BigDecimal maximumPrice,
			@RequestParam(value = "minimumWeight", required = false) BigDecimal minimumWeight,
			@RequestParam(value = "category", required = false) Integer category,
			@RequestParam(value = "delivery", required = false) Boolean delivery,
			@RequestParam(value = "provinces", required = false) int[] provinces,
			@RequestParam(value = "page", required = false) Integer page) {

		List<OfferDto> offers = new ArrayList<OfferDto>();

		offers.add(generateOffer("Agency Inc", "Miami Hialeah", BigDecimal.valueOf(7)));
		offers.add(generateOffer("Los Primos LLC", "Miami Gardens", BigDecimal.valueOf(7)));
		offers.add(generateOffer("Cubamax LLC", "Fort Lauderdale", BigDecimal.valueOf(8)));
		offers.add(generateOffer("Send Everything Inc", "Miami Beach", BigDecimal.valueOf(10)));
		offers.add(generateOffer("Package Sender", "North Miami", BigDecimal.valueOf(9)));
		offers.add(generateOffer("Office Services Cuba Inc.", "South Miami", BigDecimal.valueOf(6.5)));
		offers.add(generateOffer("Agency Inc", "Miami Hialeah", BigDecimal.valueOf(7)));
		offers.add(generateOffer("Los Primos LLC", "Miami Gardens", BigDecimal.valueOf(7)));
		offers.add(generateOffer("Cubamax LLC", "Fort Lauderdale", BigDecimal.valueOf(8)));
		offers.add(generateOffer("Send Everything Inc", "Miami Beach", BigDecimal.valueOf(10)));

		if (page != null && page == 3) {
			offers.clear();
			offers.add(generateOffer("Package Sender", "North Miami", BigDecimal.valueOf(9)));
			offers.add(generateOffer("Office Services Cuba Inc.", "South Miami", BigDecimal.valueOf(6.5)));
		}
		return offers;
	}

	private OfferDto generateOffer(String name, String location, BigDecimal price) {
		OfferDto offer = new OfferDto();
		offer.setOwnerLocation(location);
		offer.setOwnerName(name);
		offer.setPrice(price);
		return offer;
	}

	@RequestMapping(value = "/{id}")
	@ResponseBody
	public OfferDto getOffer(@PathVariable Integer id) {

		return getAll(null, null, null, null, null, null, null, null, null).get(id);
	}

}
