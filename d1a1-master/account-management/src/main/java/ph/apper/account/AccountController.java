package ph.apper.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("account")
public class AccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    private final RestTemplate restTemplate;



    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public ResponseEntity create(
            @RequestBody ph.apper.account.AccountRequest request) {


        LOGGER.info("{}", request);


        Activity activity = new Activity();
        activity.setAction("Registration");
        activity.setIdentifier("email=" + request.getEmail());
        ResponseEntity<Object> response = restTemplate.postForEntity("http://localhost:8081/activity", activity, Object.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            System.out.println("Success");
        } else {
            System.out.println("Err: " + response.getStatusCode());
        }


        return ResponseEntity.ok().build();
    }
}