import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Class {
    public static void main(String[] args) {

        String text = "Она сказала: \"Привет!\", а он ответил: \"Как дела?\", потом: \"Отлично!\"";
        Pattern quotePattern = Pattern.compile("\"(.*?)\"");
        Matcher quoteMatcher = quotePattern.matcher(text);

        System.out.println("1. Цитаты:");
        while (quoteMatcher.find()) {
            System.out.println(quoteMatcher.group(1));
        }

        String logs = """
                [ERROR] 2024-01-15: Connection failed
                [INFO] 2024-01-15: User logged in
                [DEBUG] 2024-01-15: Processing request
                [ERROR] 2024-01-15: Database timeout
                """;
        Pattern errorPattern = Pattern.compile("\\[ERROR\\].*");
        Matcher errorMatcher = errorPattern.matcher(logs);

        System.out.println("\n2. Ошибки:");
        while (errorMatcher.find()) {
            System.out.println(errorMatcher.group());
        }

        String html = """
                <div class="product">
                    <h3>Телефон</h3>
                    <p>Цена: 20000 руб</p>
                </div>
                <div class="product">
                    <h3>Ноутбук</h3>
                    <p>Цена: 50000 руб</p>
                </div>
                """;
        Pattern h3Pattern = Pattern.compile("<h3>(.*?)</h3>");
        Matcher h3Matcher = h3Pattern.matcher(html);

        System.out.println("\n3. Названия товаров:");
        while (h3Matcher.find()) {
            System.out.println(h3Matcher.group(1));
        }

        String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
        Pattern csvPattern = Pattern.compile("(.*?);");
        Matcher csvMatcher = csvPattern.matcher(csv);

        System.out.println("\n4. Записи CSV:");
        while (csvMatcher.find()) {
            System.out.println(csvMatcher.group(1));
        }

        String post = "Сегодня был в #парке и #кино #отдых #выходные";
        post += " ";
        Pattern hashtagPattern = Pattern.compile("#(.*?)\s");
        Matcher hashtagMatcher = hashtagPattern.matcher(post);

        System.out.println("\n5. Хештеги:");
        while (hashtagMatcher.find()) {
            System.out.println(hashtagMatcher.group());
        }
    }
}