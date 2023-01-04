public class LabTestExample2 {
    
    private String author, title, ISBN;

    public LabTestExample2(String author, String title, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public static void checkISBN(LabTestExample2[] arr) {
        System.out.println("Checking ISBN:");
        for (LabTestExample2 elem: arr) {
            int sum = 0;
            for (int i = 0; i < elem.ISBN.length() - 1; i += 2) {
                int twoDigit = Integer.parseInt(elem.ISBN.substring(i, i + 2));
                sum += (twoDigit % 10) * 3;
                sum += twoDigit / 10;
            }
            System.out.printf("%s is %s\n", elem.ISBN, "valid", (sum % 10 == 0)? "valid" : "invalid");
        }
        System.out.println();
    }

    public static void sortArray(LabTestExample2[] arr, String by) {
        if (by.equalsIgnoreCase("author")) {
            for (int i = 0; i < arr.length - 1; i++) {
                boolean noSwap = true;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j].author.compareToIgnoreCase(arr[j + 1].author) > 0) {
                        LabTestExample2 temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        noSwap = false;
                    }
                }
                if (noSwap) { break; }
            }
        }
        else if (by.equalsIgnoreCase("title")) {
            for (int i = 0; i < arr.length - 1; i++) {
                boolean noSwap = true;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j].title.compareToIgnoreCase(arr[j + 1].title) > 0) {
                        LabTestExample2 temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        noSwap = false;
                    }
                }
                if (noSwap) { break; }
            }
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
        
        LabTestExample2 record1 = new LabTestExample2("Daniel Liang", "Introduction to Java Programming", "9780136520238");
        LabTestExample2 record2 = new LabTestExample2("Cay Horstmann", "Core Java: Fundamentals", "9780135166307");
        LabTestExample2 record3 = new LabTestExample2("Joshua Block", "Effective Java", "9780134685991");
        LabTestExample2 record4 = new LabTestExample2("Herbert Schildt", "Java: A Beginner's Guide", "9781260440218");
        LabTestExample2 record5 = new LabTestExample2("Kathy Sierra", "Java : Head First", "9780596009206");

        LabTestExample2[] arr = { record1, record2, record3, record4, record5 };

        checkISBN(arr);

        sortArray(arr, "author");
        displayTable(arr, "author");

        sortArray(arr, "title");
        displayTable(arr, "title");
    }
}
