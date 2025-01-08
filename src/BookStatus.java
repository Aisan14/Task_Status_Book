enum BookStatus {
    BORROWED("Взято в пользование"),
    AVAILABLE("Достуно"),
    OVERDUED("Задержан"),
    ARHIVED("В архиве");

    private final String description;

    BookStatus(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
