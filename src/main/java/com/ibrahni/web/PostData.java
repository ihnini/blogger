package com.ibrahni.web;

public class PostData {
    private Long id;
    private String title;
    private String content;
    private Long writerId;

    public PostData(Long id, String title, String content, Long writerId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writerId = writerId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getWriterId() {
        return writerId;
    }
}
