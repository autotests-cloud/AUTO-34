package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Github login test")
    void generatedTest() {
        step("Open 'https://github.com/login'", () -> {
            // todo
        });

        step("Set username 'Alex'", () -> {
            // todo
        });

        step("Set password '1adsdf'", () -> {
            // todo
        });

        step("Verify successful authorization as 'Alex'", () -> {
            // todo
        });
    }

    @Test
    @Description("Autogenerated, because your test steps contain text 'http...' and the page has &lt;title&gt;")
    @DisplayName("Page title test")
    void titleTest() {
        step("Open url 'https://github.com/login'", () ->
            open("https://github.com/login"));

        step("Checking that the page title has is 'Sign in to GitHub · GitHub'", () -> {
            String expectedTitle = "Sign in to GitHub · GitHub";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}