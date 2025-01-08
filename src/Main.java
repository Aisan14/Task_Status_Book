//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1994" , BookStatus.AVAILABLE);
        Book book2 = new Book("Harry Pother", BookStatus.BORROWED);

        System.out.println(book1);
        System.out.println(book2);


        book1.setStatus(BookStatus.OVERDUED);
        System.out.println("Статус киниги изменен " + book1);
    }
}

