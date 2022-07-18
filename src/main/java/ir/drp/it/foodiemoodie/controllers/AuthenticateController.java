package ir.drp.it.foodiemoodie.controllers;

import ir.drp.it.foodiemoodie.entities.User;
import ir.drp.it.foodiemoodie.exceptions.BusinessException;
import ir.drp.it.foodiemoodie.models.AuthenticateModel;
import ir.drp.it.foodiemoodie.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/authenticate")
public class AuthenticateController {


    private UserRepository userRepository;

    public AuthenticateController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getToken(@RequestBody AuthenticateModel model) {

        User user = userRepository.findByUsername(model.getUsername());

        if (user == null)
            throw new BusinessException("کاربری با این مشخصات یافت نشد");

        user.checkPassword(model.getPassword());

        return "the_access_token";

    }


}
