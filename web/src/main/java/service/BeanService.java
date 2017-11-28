package service;

import org.springframework.stereotype.Service;

@Service
public class BeanService implements IBeanService{

    public String get(){
        return "007";
    }

}
