import java.util.Scanner;

class SalaryCalc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char workClass;
        int overtime;
        double basicSalary = 0, percentOvertime, overtimeComp, totalSalary;

        System.out.print("Masukkan golongan karyawan (A/B/C): ");
        workClass = scanner.next().charAt(0);
        System.out.print("Masukkan jumlah jam lembur: ");
        overtime = scanner.nextInt();

        if (workClass == 'A') {
            basicSalary = 5000000;
        } else if (workClass == 'B') {
            basicSalary = 6500000;
        } else if (workClass == 'C') {
            basicSalary = 9500000;
        } else {
            System.out.println("Golongan yang dimasukkan tidak valid.");
            return;
        }

        if (overtime == 1) {
            percentOvertime = 0.3;
        } else if (overtime == 2) {
            percentOvertime = 0.32;
        } else if (overtime == 3) {
            percentOvertime = 0.34;
        } else if (overtime == 4) {
            percentOvertime = 0.36;
        } else {
            percentOvertime = 0.38;
        }

        overtimeComp = percentOvertime * basicSalary * overtime;
        totalSalary = basicSalary + overtimeComp;

        System.out.println("Jumlah penghasilan: " + String.format("%.2f", totalSalary));

        scanner.close();
    }
}
