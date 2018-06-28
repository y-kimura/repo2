package SendMail;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class AppProperties {
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private String test = ""; // ← "app.timezone"の設定値がインジェクションされる

}
