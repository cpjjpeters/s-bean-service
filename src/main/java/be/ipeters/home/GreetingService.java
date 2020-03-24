package be.ipeters.home;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GreetingService {
//    private static final Logger logger = Logger.getLogger(GreetingService.class.getName());

    public GreetingService() {

    }

    public void greet() {

    	System.out.println("Gaurav Bytes welcomes you for your first tutorial on Spring!!!");
//        log.info("Gaurav Bytes welcomes you for your first tutorial on Spring!!!");

    }

}
