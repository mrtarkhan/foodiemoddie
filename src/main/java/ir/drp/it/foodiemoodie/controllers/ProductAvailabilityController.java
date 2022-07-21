package ir.drp.it.foodiemoodie.controllers;

import ir.drp.it.foodiemoodie.entities.ProductAvailability;
import ir.drp.it.foodiemoodie.repositories.ProductAvailabilityRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/ProductAvailabilities")
public class ProductAvailabilityController {


    private ProductAvailabilityRepository productAvailabilityRepository;

    public ProductAvailabilityController(ProductAvailabilityRepository productAvailabilityRepository) {
        this.productAvailabilityRepository = productAvailabilityRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody ProductAvailability item) {
        productAvailabilityRepository.save(item);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public void delete(@PathVariable Integer id) {
        productAvailabilityRepository.deleteById(id);
    }


}
