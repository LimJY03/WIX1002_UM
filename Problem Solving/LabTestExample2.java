public class LabTestExample2 {
    
    private String author, title;
    private long ISBN;

    public LabTestExample2(String author, String title, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = Long.parseLong(ISBN);
    }

    public static void checkISBN(LabTestExample2[] arr) {
        System.out.println("Checking ISBN:");
        for (LabTestExample2 elem: arr) {
            int sum = 0;
            long isbn = elem.ISBN;
            while (isbn != 0) {
                sum += isbn % 10; isbn /= 10;
                sum += (isbn % 10) * 3; isbn /= 10;
            }
            System.out.printf("%s is %s\n", elem.ISBN, (sum % 10 == 0) ? "valid" : "invalid");
        }
        System.out.println();
    }

    private static boolean isGreater(LabTestExample2 elem1, LabTestExample2 elem2, String by) {
        if (by.equalsIgnoreCase("author")) { return elem1.author.compareToIgnoreCase(elem2.author) > 0; }
        else if (by.equalsIgnoreCase("title")) { return elem1.title.compareToIgnoreCase(elem2.title) > 0; }
        return false;
    }

    public static void sortArray(LabTestExample2[] arr, String by) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean noSwap = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (isGreater(arr[j], arr[j + 1], by)) {
                    LabTestExample2 temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp; 
                    noSwap = false;
                }
            }
            if (noSwap) { break; }
        }
    }

    public static void displayTable(LabTestExample2[] arr, String by) {
        
        System.out.printf("Data (sorted by %s)\n", by);
        System.out.println("+-----------------------------------------------------------------------------------------------------+");
        System.out.println("Author                        Title                                                       ISBN");
        System.out.println("+-----------------------------------------------------------------------------------------------------+");

        for (LabTestExample2 elem: arr) {
            System.out.printf("%-30s%-60s%13s\n", elem.author, elem.title, elem.ISBN);
        }

        System.out.println("+-----------------------------------------------------------------------------------------------------+\n");
    }

    public static void main(String[] args) {

        String author, title, ISBN;

        LabTestExample2[] data = { 
            new LabTestExample2(author="Daniel Liang", title="Introduction to Java Programming", ISBN="9780136520238"),
            new LabTestExample2(author="Cay Horstmann", title="Core Java: Fundamentals", ISBN="9780135166307"),
            new LabTestExample2(author="Joshua Block", title="Effective Java", ISBN="9780134685991"),
            new LabTestExample2(author="Herbert Schildt", title="Java: A Beginner's Guide", ISBN="9781260440218"),
            new LabTestExample2(author="Kathy Sierra", title="Java : Head First", ISBN="9780596009206")
        };

        checkISBN(data);

        sortArray(data, "author");
        displayTable(data, "author");

        sortArray(data, "title");
        displayTable(data, "title");
    }
}
