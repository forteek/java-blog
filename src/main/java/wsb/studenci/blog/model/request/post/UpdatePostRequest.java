package wsb.studenci.blog.model.request.post;

public class UpdatePostRequest {
    private String title;
    private String content;

    public UpdatePostRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
