public class LabAssessment {

    // Object variables
    private String author, title;
    private long ISBN;
    private boolean isValid;

    // Class-based variables
    static int authorMaxLength = 0, titleMaxLength = 0, ISBNMaxLength = 13;

    // Constructor
    public LabAssessment(String author, String title, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = Long.parseLong(ISBN);
        this.isValid = true;
    }

    // Static methods
    public static void setMaxLength(LabAssessment[] arr) {
        for (LabAssessment elem: arr) {
            authorMaxLength = Math.max(authorMaxLength, elem.author.length());
            titleMaxLength = Math.max(titleMaxLength, elem.title.length());
        }
    }

    private static boolean isGreater(LabAssessment elem1, LabAssessment elem2, String by) {
        if (by.equalsIgnoreCase("author")) { return elem1.author.compareToIgnoreCase(elem2.author) > 0; }
        else if (by.equalsIgnoreCase("title")) { return elem1.title.compareToIgnoreCase(elem2.title) > 0; }
        else if (by.equalsIgnoreCase("ISBN")) { return elem1.ISBN > elem2.ISBN; }
        return false;
    }

    public static void sortArray(LabAssessment[] arr, String by) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean noSwap = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (isGreater(arr[j], arr[j + 1], by)) {
                    LabAssessment temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp; 
                    noSwap = false;
                }
            }
            if (noSwap) { break; }
        }
    }

    public static void displayTable(LabAssessment[] arr, String by) {
        
        System.out.printf("Data (sorted by %s):\n", by);
        System.out.printf("┌%s┬%s┬%s┐\n", "─".repeat(authorMaxLength), "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength));
        System.out.printf("│Author%s│Title%s│ISBN%s│\n", " ".repeat(authorMaxLength - 6), " ".repeat(titleMaxLength - 5), " ".repeat(ISBNMaxLength - 4));
        System.out.printf("├%s┼%s┼%s┤\n", "─".repeat(authorMaxLength), "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength));

        for (LabAssessment elem: arr) {
            System.out.printf(
                "│%s%s│%s%s│%s│\n", 
                elem.author, " ".repeat(authorMaxLength - elem.author.length()), 
                elem.title, " ".repeat(titleMaxLength - elem.title.length()), 
                elem.ISBN
            );
        }
        System.out.printf("└%s┴%s┴%s┘\n\n", "─".repeat(authorMaxLength), "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength));
    }

    // ISBN validation
    private static void checkISBN(LabAssessment[] arr) {
        for (LabAssessment elem: arr) {
            int sum = 0;
            long isbn = elem.ISBN;
            while (isbn != 0) {
                sum += isbn % 10; isbn /= 10;
                sum += (isbn % 10) * 3; isbn /= 10;
            }
            elem.isValid = (sum % 10 == 0) ? true : false;
        }
    }

    public static void displayISBN(LabAssessment[] arr) {

        checkISBN(arr);

        System.out.println("Data (sorted by ISBN with validation):");
        System.out.printf("┌%s┬%s┬%s┐\n", "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength), "─".repeat(8));
        System.out.printf("│Title%s│ISBN%s│Validity│\n", " ".repeat(titleMaxLength - 5), " ".repeat(ISBNMaxLength - 4));
        System.out.printf("├%s┼%s┼%s┤\n", "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength), "─".repeat(8));

        for (LabAssessment elem: arr) {
            System.out.printf(
                "│%s%s│%s│%s%s│\n", 
                elem.title, " ".repeat(titleMaxLength - elem.title.length()), 
                elem.ISBN,
                elem.isValid, " ".repeat(8 - String.valueOf(elem.isValid).length())
            );
        }
        System.out.printf("└%s┴%s┴%s┘\n\n", "─".repeat(titleMaxLength), "─".repeat(ISBNMaxLength), "─".repeat(8));
    }


    public static void main(String[] args) {
        
        // Argument labels
        String author, title, ISBN, by;

        // Initialize data entries
        LabAssessment[] data = {
            new LabAssessment(author="Daniel Liang", title="Introduction to Java Programming", ISBN="9780136520238"),
            new LabAssessment(author="Cay Horstmann", title="Core Java: Fundamentals", ISBN="9780135166307"),
            new LabAssessment(author="Joshua Block", title="Effective Java", ISBN="9780134685991"),
            new LabAssessment(author="Herbert Schildt", title="Java: A Beginner's Guide", ISBN="9781260440218"),
            new LabAssessment(author="Kathy Sierra", title="Java : Head First", ISBN="9780596009206")
        };

        setMaxLength(data);

        // Sort by author
        sortArray(data, by="author");
        displayTable(data, by="author");

        // Sort by title
        sortArray(data, by="title");
        displayTable(data, by="title");

        // Sort by ISBN
        sortArray(data, by="ISBN");
        displayISBN(data);
    }
}