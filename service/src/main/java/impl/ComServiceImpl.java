package impl;

import client.ComService;
import org.springframework.stereotype.Service;

@Service
public class ComServiceImpl implements ComService {

    public String get(){
        return "ComServiceImpl008";
    }
}
