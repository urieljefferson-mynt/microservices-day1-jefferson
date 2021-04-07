package ph.apper.account;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class Activity {
    private String action;
    private String identifier;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
