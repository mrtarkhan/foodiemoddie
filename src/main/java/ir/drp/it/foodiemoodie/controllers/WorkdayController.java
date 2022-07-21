package ir.drp.it.foodiemoodie.controllers;


import ir.drp.it.foodiemoodie.entities.Product;
import ir.drp.it.foodiemoodie.repositories.ProductAvailabilityRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "api/v1/workdays")
public class WorkdayController {


    private ProductAvailabilityRepository productAvailabilityRepository;

    public WorkdayController(ProductAvailabilityRepository productAvailabilityRepository) {
        this.productAvailabilityRepository = productAvailabilityRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}/products")
    public List<Product> get(@PathVariable int id) {
        return productAvailabilityRepository.findAllByWorkdayId(id)
                .stream().map(x -> x.getProduct())
                .collect(Collectors.toList())
                ;
    }


}
