package ir.drp.it.foodiemoodie.controllers;


import ir.drp.it.foodiemoodie.entities.User;
import ir.drp.it.foodiemoodie.exceptions.BusinessException;
import ir.drp.it.foodiemoodie.models.userModels.CreateUserModel;
import ir.drp.it.foodiemoodie.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {


    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody CreateUserModel model) {

        model.validate();

        if (userRepository.existsByUsername(model.getUsername()))
            throw new BusinessException("نام کاربری قبلا ثبت شده است");

        User user = new User(model.getUsername(), model.getPassword())
                .setName(model.getFirstName(), model.getLastName())
                .setRole(model.getRole())
                .setMobileNumber(model.getMobileNumber());

        userRepository.save(user);

    }

    @RequestMapping(path = "{id}", method = RequestMethod.PUT)
    public void edit(@PathVariable Long id, @RequestBody CreateUserModel model) {

        model.validate();

        if (!userRepository.existsById(id))
            throw new BusinessException("کاربری با این مشخصات یافت نشد");

        User user = userRepository.findById(id).get();

        user
                .setName(model.getFirstName(), model.getLastName())
                .setMobileNumber(model.getMobileNumber())
                .setRole(model.getRole())
                .setPassword(model.getPassword());

        userRepository.save(user);

    }



}
