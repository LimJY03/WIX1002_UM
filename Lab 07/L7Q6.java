import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class L7Q6 {

    public static void main(String[] args) {

        String line = "";
        String[] lineContent = new String[3];

        try {

            BufferedReader productFile = new BufferedReader(new FileReader("./io_files/product.txt"));
            BufferedReader orderFile = new BufferedReader(new FileReader("./io_files/order.txt"));

            LinkedHashMap<String, String> dataName = new LinkedHashMap<>();
            LinkedHashMap<String, Integer> dataQuantity = new LinkedHashMap<>();
            LinkedHashMap<String, Double> dataUnitPrice = new LinkedHashMap<>();
            LinkedHashMap<String, String> orderProduct = new LinkedHashMap<>();

            line = productFile.readLine();

            while (line != null) {

                lineContent = line.split(",");

                dataName.put(lineContent[0], lineContent[1]);
                dataUnitPrice.put(lineContent[0], Double.parseDouble(lineContent[2]));

                line = productFile.readLine();
            }

            line = orderFile.readLine();

            while (line != null) {

                lineContent = line.split(",");

                orderProduct.put(lineContent[0], lineContent[1]);
                dataQuantity.put(lineContent[1], Integer.parseInt(lineContent[2]));

                line = orderFile.readLine();
            }

            System.out.println("ProductID        ProductName        Quantity        PricePerUnit        Total");

            for (String order: orderProduct.keySet()) {
                System.out.printf("%-10s%-28s%2d%22.2f%15.2f\n",
                        orderProduct.get(order),
                        dataName.get(orderProduct.get(order)),
                        dataQuantity.get(orderProduct.get(order)),
                        dataUnitPrice.get(orderProduct.get(order)),
                        dataQuantity.get(orderProduct.get(order)) * dataUnitPrice.get(orderProduct.get(order))
                );
            }

            productFile.close();
            orderFile.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found"); }
        catch (IOException e) { System.out.printf("IO Exception: %s", e); }
    }
}