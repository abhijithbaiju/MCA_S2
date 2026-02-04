import java.util.Scanner;

public class Cpu {
    double price;

    public Cpu(double price) {
        this.price = price;
    }

    class Processor {
        int cores;
        String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Cores : " + cores);
            System.out.println("Processor Manufacturer : " + manufacturer);
        }
    }

    static class Ram {
        int memory;
        String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Size : " + memory + " GB");
            System.out.println("RAM Manufacturer : " + manufacturer);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CPU price: ");
        double price = sc.nextDouble();
        Cpu cpu = new Cpu(price);

        System.out.print("Enter number of processor cores: ");
        int cores = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter processor manufacturer: ");
        String procManufacturer = sc.nextLine();

        Cpu.Processor p = cpu.new Processor(cores, procManufacturer);

        System.out.print("Enter RAM size (GB): ");
        int memory = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = sc.nextLine();

        Cpu.Ram r = new Cpu.Ram(memory, ramManufacturer);

        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("CPU Price: " + cpu.price);
        p.display();
        r.display();

        sc.close();
    }
}
