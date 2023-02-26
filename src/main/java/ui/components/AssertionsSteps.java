package ui.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.parse;
import static org.assertj.core.api.Assertions.assertThat;

public class AssertionsSteps extends ApplicationSteps {
    public AssertionsSteps(WebDriver driver) {
        super(driver);
    }

    public void checkCountCourse(List<WebElement> elements, int count) {
        assertThat(elements.size())
                .as("Количество элементов")
                .isEqualTo(count);
    }

    public void checkEqualsTitleElement(WebElement element, String expected) {
        assertThat(element.getText())
                .as("Текст Элемента")
                .isEqualToIgnoringCase(expected);
    }

    public void checkContainsTitleElement(WebElement element, String expected) {
        explicitWait(element);
        assertThat(element.getText())
                .as("Элемент содержит текст")
                .containsIgnoringCase(expected);
    }

    public void checkCountCardsOfCourseStartWishValue(List<WebElement> elements, String value, int count) {
        assertThat((elements))
                .extracting(WebElement::getText)
                .as("Список курсов-специализаций")
                .filteredOn(s -> s.contains(value))
                .as("Число курсов")
                .hasSize(count);

    }


//    public void checkCompareDateYarkoOffers(List<WebElement> elements) throws InterruptedException {
//
//        //Получаем текст из списка элементов
//        Thread.sleep(5000);
//        List<String> textOfElements = elements.stream().map(element -> element.getText()).collect(Collectors.toList());
//        //Приводим получившийся текст к нужному формату
//        List<String> results = textOfElements.stream().map(s -> s.replace("До ", " ")
//                .trim()).collect(Collectors.toList());
//        //переводим строки в даты
//        List<LocalDate> actualDates = results.stream().map(date -> parse(date, formats)).collect(Collectors.toList());
//        //сравниваем актуальную дату с текущей
////        Assertions.assertTrue(currentData.compareTo(String.valueOf(actualDates))<=0);
//////
//        assertThat(actualDates)
//                .allSatisfy(date -> assertThat(date)
//                        .as("Проверяем, что дата %s больше текущей даты ", date)
//                        .isBefore(LocalDate.now()));
////        assertThat(actualDates).allMatch(a -> a.isAfter(LocalDate.now()),"Проверяем, что дата элемента больше текущей даты ");


    public void checkCompareDateYarkoOffers(List<WebElement> elements) throws InterruptedException {
        Thread.sleep(5000);
        assertThat((elements)).extracting(element -> element.getText())
                .as("Приводим получившийся текст к нужному формату")
                .extracting(s -> s.replace("До ", " ").trim())
                .as("переводим строки в даты")
                .extracting(date -> parse(date, formats))
                .allSatisfy(date -> assertThat(date)
                        .as("Проверяем, что дата %s больше текущей даты ", date)
                        .isAfter(LocalDate.now()));
    }

    }




