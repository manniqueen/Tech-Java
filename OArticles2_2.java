import java.util.*;

public class OArticles2_2 {

    public static class Article {
        String title;
        String content;
        String author;

        String getTitle() {
            return title;
        }

        private String getContent() {
            return content;
        }

        private String getAuthor() {
            return author;
        }

        private Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", title, content, author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            articles.add(new Article(tokens[0], tokens[1], tokens[2]));
        }

        String command = scanner.nextLine();
        switch (command) {
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        for (Article article : articles) {
            System.out.println(article.toString());
        }

    }
}