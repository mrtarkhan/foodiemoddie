package ir.drp.it.foodiemoodie.controllers;


import ir.drp.it.foodiemoodie.entities.Workday;
import ir.drp.it.foodiemoodie.repositories.MonthRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/months")
public class MonthController {

    private MonthRepository monthRepository;

    public MonthController(MonthRepository monthRepository) {
        this.monthRepository = monthRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}/workdays")
    public List<Workday> get(@PathVariable int id) {
        return monthRepository.findByYearMonth(id)
                .getWorkdays()
                .stream().toList()
                ;
    }

}
