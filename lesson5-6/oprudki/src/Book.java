public class Book {
    String mBookName;
    String mAuthorName1;
    String mAuthorSurname1;
    String mAuthorName2;
    String mAuthorSurname2;
    int mReleaseDate;
    int mQuantityPages;
    int mPrice;
    boolean equalsBookAut;

    Book (String bookName, String authorName1, String authorSurname1, String authorName2, String authorSurname2,
          int releaseDate, int quantityPages, int price) {
        mBookName = bookName;
        mAuthorName1 = authorName1;
        mAuthorSurname1 = authorSurname1;
        mAuthorName2 = authorName2;
        mAuthorSurname2 = authorSurname2;
        mReleaseDate = releaseDate;
        mQuantityPages = quantityPages;
        mPrice = price;
    }

    Book (String bookName, String authorName1, String authorSurname1, int releaseDate, int quantityPages, int price) {
        mBookName = bookName;
        mAuthorName1 = authorName1;
        mAuthorSurname1 = authorSurname1;
        mReleaseDate = releaseDate;
        mQuantityPages = quantityPages;
        mPrice = price;
    }

    public boolean equalsBookAuthors() {
        mAuthorSurname1.equals(mAuthorSurname2);
            return equalsBookAut;
        }

    public String toStringBook() {
        return mBookName + ": " + mAuthorName1 + " " + mAuthorSurname1 + ", " + mReleaseDate + " release date.";
    }


}
