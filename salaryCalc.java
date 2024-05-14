import java.util.Scanner;

class SalaryCalc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char workClass;
        int overtime;
        double basicSalary, percentOvertime, overtimeComp, totalSalary;

        System.out.print("Masukkan golongan karyawan (A/B/C): ");
        workClass = scanner.next().charAt(0);
        System.out.print("Masukkan jumlah jam lembur: ");
        overtime = scanner.nextInt();

        switch (workClass) {
            case 'A':
                basicSalary = 5000000;
                break;
            case 'B':
                basicSalary = 6500000;
                break;
            case 'C':
                basicSalary = 9500000;
                break;
            default:
                System.out.println("Golongan yang dimasukkan tidak valid.");
                return;
        }

        // Hitung persentase lembur
        switch (overtime) {
            case 1:
                percentOvertime = 0.3;
                break;
            case 2:
                percentOvertime = 0.32;
                break;
            case 3:
                percentOvertime = 0.34;
                break;
            case 4:
                percentOvertime = 0.36;
                break;
            default:
                percentOvertime = 0.38;
                break;
        }

        overtimeComp = percentOvertime * basicSalary * overtime;

        totalSalary = basicSalary + overtimeComp;

        System.out.println("Jumlah penghasilan: " + String.format("%.2f", totalSalary));

        scanner.close();
    }
}
