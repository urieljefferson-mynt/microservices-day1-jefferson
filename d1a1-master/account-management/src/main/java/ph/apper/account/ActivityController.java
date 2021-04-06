package ph.apper.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("activity")
public class ActivityController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ActivityController.class);

    @PostMapping
    public ResponseEntity create(
            @Valid @RequestBody Activity request){
        LOGGER.info("{}", request);

        return ResponseEntity.ok().build();
    }

}
