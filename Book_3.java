public class Book_3 {
        private String title;

        Book_3(String title) {
            this.title = title;
        }

        void displayBook() {
            System.out.println("Book: " + title);
        }
    }

    class Library {
        private Book_3[] books;

        Library(String[] bookTitles) {
            books = new Book_3[bookTitles.length];
            for (int i = 0; i < bookTitles.length; i++) {
                books[i] = new Book_3(bookTitles[i]);
            }
        }

        void showBooks() {
            for (Book_3 book : books) {
                book.displayBook();
            }
        }
    }

    class Member {
        String name;

        Member(String name) {
            this.name = name;
        }
    }

    class LibrarySystem {
        private Member member;

        LibrarySystem(Member member) {
            this.member = member;
        }

        void showMember() {
            System.out.println("Library Member: " + member.name);
        }
    }

    class Main4 {
        public static void main(String[] args) {
            String[] bookTitles = {"The Alchemist", "1984", "Java Programming"};
            Library library = new Library(bookTitles);
            System.out.println("Library Books:");
            library.showBooks();

            System.out.println();
            Member member = new Member("Alice");
            LibrarySystem system = new LibrarySystem(member);
            system.showMember();
        }

}
