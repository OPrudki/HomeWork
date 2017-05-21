public class Author {
    String mAuthorName;
    String mAuthorSurname;
    int mNumberPhone;
    String mMailAuthor;
    String mSityAuthor;
    int mBirthYear;
    boolean equalsAuthorName;

    Author (String authorName, String authorSurname, int numberPhone, String mailAuthor, String sityAuthor, int birthYear) {
        mAuthorName = authorName;
        mAuthorSurname = authorSurname;
        mNumberPhone = numberPhone;
        mMailAuthor = mailAuthor;
        mSityAuthor = sityAuthor;
        mBirthYear = birthYear;
    }

    Author (String authorName, String authorSurname, String sityAuthor, int birthYear) {
        mAuthorName = authorName;
        mAuthorSurname = authorSurname;
        mSityAuthor = sityAuthor;
        mBirthYear = birthYear;
    }

    public boolean equalsAuthors() {
        mAuthorName.equals(mAuthorSurname);
        return equalsAuthorName;
    }

    public String toStringAuthor() {
        return "Author " + mAuthorName + " " + mAuthorSurname + " live in " + mSityAuthor;
    }
}
