import java.util.*;

class Result {
    public static List<String> closestColor(List<String> pixels) {
        // Define the RGB values for the pure colors
        int[][] colors = {
                {0, 0, 0},       // Black
                {255, 255, 255}, // White
                {255, 0, 0},     // Red
                {0, 255, 0},     // Green
                {0, 0, 255}      // Blue
        };

        String[] colorNames = {"Black", "White", "Red", "Green", "Blue"};

        List<String> results = new ArrayList<>();

        for (String pixel : pixels) {
            // Convert the 24-bit binary string to RGB values
            int r = Integer.parseInt(pixel.substring(0, 8), 2);
            int g = Integer.parseInt(pixel.substring(8, 16), 2);
            int b = Integer.parseInt(pixel.substring(16, 24), 2);

            double minDistance = Double.MAX_VALUE;
            String closestColor = "";
            boolean ambiguous = false;

            for (int i = 0; i < colors.length; i++) {
                double distance = Math.sqrt(Math.pow(r - colors[i][0], 2) +
                        Math.pow(g - colors[i][1], 2) +
                        Math.pow(b - colors[i][2], 2));

                if (distance < minDistance) {
                    minDistance = distance;
                    closestColor = colorNames[i];
                    ambiguous = false;
                } else if (distance == minDistance) {
                    ambiguous = true;
                }
            }

            if (ambiguous) {
                results.add("Ambiguous");
            } else {
                results.add(closestColor);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        List<String> pixels = Arrays.asList(
                "101111010110011011100100",
                "110000001001010111111011",
                "100110101001011111010101",
                "010111101001001000000011",
                "000000001111111111111111"
        );

        List<String> result = Result.closestColor(pixels);
        for (String color : result) {
            System.out.println(color);
        }
    }
}
