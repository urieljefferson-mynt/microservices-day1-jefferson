package ph.apper.account;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class Activity {
    private String action;
    private String identifier;
}
