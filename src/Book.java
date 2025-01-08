public class Book {
    private String title;
    private BookStatus status;

    public Book(String title, BookStatus status){
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "Кинга " + title +", Статаус "+status.getDescription();
    }
}
