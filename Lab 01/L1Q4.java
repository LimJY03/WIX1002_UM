import java.util.LinkedHashMap;
import java.lang.Math;

public class L1Q4 {

    public static void main(String[] args) {
        
        // Create Data
        LinkedHashMap<String, Integer> data = new LinkedHashMap<String, Integer>();

        data.put("Jan", 2500);
        data.put("Feb", 1600);
        data.put("Mar", 2000);
        data.put("Apr", 2700);
        data.put("May", 3200);
        data.put("Jun", 800);

        // Get Maximum Value and Average Value for Scaling
        int maxValue = 0, sum = 0;

        for (int value: data.values()) {
            maxValue = value > maxValue ? value : maxValue;
            sum += value;
        }

        // Determine Scale Based On Mean
        // double mean = (sum + 0.0) / data.size();
        double globalScale = Math.pow(10, (int) Math.log10((sum + 0.0) / data.size()));
        int scaleBaseMax = (int) (Math.ceil(maxValue / globalScale) * globalScale);

        // Generate Bar Chart
        System.out.println("       Month\n         │");

        for (String month: data.keySet()) {

            // Determine Bar Length
            int len = data.get(month) * 20 / scaleBaseMax;

            // Display Bar
            System.out.printf("%s 2016 │ %s %s\n", month, ("=").repeat(len), data.get(month));
        }

        System.out.println("         └────────────────────────> Amount");
    }
}