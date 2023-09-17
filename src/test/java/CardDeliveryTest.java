import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest {
    @Test
    void shouldTest() {
        open("http://localhost:9999");
        SelenideElement form = $("[action]");
        form.$("[data-test-id=city] input").setValue("Москва");
        form.$("[data-test-id=date] input").setValue("21.09.2023");
        form.$("[data-test-id=name] input").setValue("Екатерина Е");
        form.$("[data-test-id=phone] input").setValue("+79110000000");
        form.$("[data-test-id=agreement]").click();
        form.$("[role]").click();
        form.$("[data-test-id=notification]");
    }
}

