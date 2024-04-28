package config;

public class BaseConfig {
    public static BaseConfig getInstance() {
        return new BaseConfig();
    }

    String browser = System.getenv("BROWSER");
    String env = System.getenv("ENV");
    String headless = System.getenv("HEADLESS");

    public String getBrowser() {
        return (browser != null) ? browser : "chrome";
    }

    public String getUrl() {
        env = (env != null) ? env : "prod";
        String url = null;
        switch (env) {
            case "test" -> url = "";
            case "prod" -> url = "https://www.hepsiburada.com/";
        }
        return url;
    }

    public Boolean getHeadless() {
        return (headless != null) ? Boolean.parseBoolean(headless) : false;
    }
}
