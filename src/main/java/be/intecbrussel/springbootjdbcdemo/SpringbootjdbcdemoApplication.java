package be.intecbrussel.springbootjdbcdemo;

import be.intecbrussel.springbootjdbcdemo.data.BeerDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootjdbcdemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext
        = SpringApplication.run(SpringbootjdbcdemoApplication.class, args);
        BeerDao beerDao
                = applicationContext.getBean("beerDao",BeerDao.class);
        System.out.println(beerDao.getBeerById(1));
    }

}
