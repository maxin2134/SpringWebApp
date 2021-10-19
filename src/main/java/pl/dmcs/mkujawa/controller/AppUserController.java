package pl.dmcs.mkujawa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.*;
import pl.dmcs.mkujawa.domain.AppUser;
import pl.dmcs.mkujawa.service.AppUserService;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AppUserController {

    private AppUserService appUserService;

    @Autowired
    public AppUserController (AppUserService appUserService) { this.appUserService = appUserService; }

    @RequestMapping(value = "/appUsers")
    public String showAppUsers(Model model, HttpServletRequest request){
        int appUserId = ServletRequestUtils.getIntParameter(request, "appUserId", -1);

        if (appUserId > 0 )
            model.addAttribute("appUser", appUserService.getAppUser(appUserId));
        else
            model.addAttribute("appUser",new AppUser());

        model.addAttribute("appUserList",appUserService.listAppUser());

        return "appUser";
    }

    @RequestMapping(value = "/addAppUser",method = RequestMethod.POST)
    public String addAppUser (@ModelAttribute("appUser") AppUser appUser){
        System.out.println("First name: " + appUser.getFirstName() + " Last Name: " + appUser.getLastName()
        + " Email: " + appUser.getEmail() + " Telephone: " + appUser.getTelephone());

        if(appUser.getId()==0)
            appUserService.addAppUser(appUser);
        else
            appUserService.editAppUser(appUser);

        return "redirect:appUsers.html";
    }

    @RequestMapping("/delete/{appUserId}")
    public String deleteUser(@PathVariable("appUserId") Long appUserId){
        appUserService.removeAppUser(appUserId);
        return "redirect:/appUsers.html";
    }
}
