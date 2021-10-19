package pl.dmcs.mkujawa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.dmcs.mkujawa.dao.AppUserRepository;
import pl.dmcs.mkujawa.domain.AppUser;

@Service
public class AppUserServiceImpl implements AppUserService {

    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserServiceImpl(AppUserRepository appUserRepository){
        this.appUserRepository = appUserRepository;
    }

    @Transactional
    public void addAppUser(AppUser appUser){
        appUserRepository.save(appUser);
    }

    @Transactional
    public void editAppUser(AppUser appUser){
        appUserRepository.save(appUser);
    }

    @Transactional
    public List<AppUser> listAppUser(){ return appUserRepository.findAll();}

    @Transactional
    public void removeAppUser (long id) {appUserRepository.delete(id);}

    @Transactional
    public AppUser getAppUser(long id) { return appUserRepository.findById(id);}

}
