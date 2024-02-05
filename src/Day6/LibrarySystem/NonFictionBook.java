package Day6.LibrarySystem;

class NonFictionBook extends Book {
    private String topic;

    public NonFictionBook(String title, String author, String isbn, String topic) {
        super(title, author, isbn);
        this.topic = topic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Topic: " + topic);
    }
}
