package ph.apper.activity;

import lombok.Data;

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
