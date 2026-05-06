//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
/*
    class AssignNo6_FileHandling {
    int id;
    String item;
    int qty;
    int price;

    // Constructor name fixed
    AssignNo6_FileHandling(int id, String item, int qty, int price) {
        this.id = id;
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    int total() {
        return qty * price;
    }
}

    public class AssignNo6_FileHand {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/CZ 3/OneDrive/Desktop/Java Programs By Anas/SalesEVESession.txt");

        Scanner sc = new Scanner(file);
        ArrayList<AssignNo6_FileHandling> list = new ArrayList<>();

        // Skip heading
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        // Read file
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] data = line.trim().split("\\s+");

            int id = list.size() + 1;
            String item = data[1] + " " + data[2];
            int price = Integer.parseInt(data[3]);
            int qty = Integer.parseInt(data[4]);

            list.add(new AssignNo6_FileHandling(id, item, qty, price));
        }

        sc.close();

        // Output
        System.out.println("ID   Item   Qty   Price   Total");

        int grandTotal = 0;

        for (AssignNo6_FileHandling s : list) {
            System.out.println(
                s.id + "   " + s.item + "   " + s.qty + "   " + s.price + "   " + s.total()
            );
            grandTotal += s.total();
        }

        System.out.println("----------------------------");
        System.out.println("Grand Total = " + grandTotal);
    }
}
    */

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.ArrayList;
    import java.util.Scanner;
    
    // Country class (Object)
    class Country {
        int id;
        String name;
        String capital;
        long population;
        double area;
    
        Country(int id, String name, String capital, long population, double area) {
            this.id = id;
            this.name = name;
            this.capital = capital;
            this.population = population;
            this.area = area;
        }
    
        // Operation: Population Density
        double density() {
            return (double) population / area;
        }
    
        // Print input data
        void displayInput() {
            System.out.println(id + " | " + name + " | " + capital + " | " + population + " | " + area);
        }
    
        // Print output result
        void displayOutput() {
            System.out.printf("%s Population Density: %.2f%n", name, density());
        }
    }
    
    public class AssignNo6_FileHand {
        public static void main(String[] args) {
    
            File file = new File("C:\\Users\\CZ 3\\OneDrive\\Desktop\\Java Programs By Anas\\countries.txt");
            ArrayList<Country> list = new ArrayList<>();
    
            try {
                Scanner sc = new Scanner(file);
    
                // Skip header line
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
    
                // Read file data
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] data = line.split(",");
    
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    String capital = data[2].trim();
                    long population = Long.parseLong(data[3].trim());
                    double area = Double.parseDouble(data[4].trim());
    
                    Country c = new Country(id, name, capital, population, area);
                    list.add(c);
                }
    
                sc.close();
    
                // INPUT DISPLAY
                System.out.println("=== INPUT DATA ===");
                for (Country c : list) {
                    c.displayInput();
                }
    
                // OUTPUT DISPLAY (Operation result)
                System.out.println("\n=== OUTPUT DATA ===");
                for (Country c : list) {
                    c.displayOutput();
                }
    
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        }
    }