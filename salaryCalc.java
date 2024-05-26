import java.util.Scanner;

class SalaryCalc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char workClass;
        int overtime;
        double basicSalary, percentOvertime, overtimeComp, totalSalary;

        double[] basicSalaryArray = {5000000, 6500000, 9500000};
        double[] percentOvertimeArray = {0.3,0.32,0.34,0.36,0.38};



        System.out.print("Masukkan golongan karyawan (A/B/C): ");
        workClass = scanner.next().charAt(0);
        System.out.print("Masukkan jumlah jam lembur: ");
        overtime = scanner.nextInt();

        if (workClass == 'A') {
            basicSalary = basicSalaryArray[0];
        } else if (workClass == 'B') {
            basicSalary = basicSalaryArray[1];
        } else if (workClass == 'C') {
            basicSalary = basicSalaryArray[2];
        } else {
            System.out.println("Golongan yang dimasukkan tidak valid.");
            return;
        }

        if (overtime == 1) {
            percentOvertime = percentOvertimeArray[0];
        } else if (overtime == 2) {
            percentOvertime = percentOvertimeArray[1];
        } else if (overtime == 3) {
            percentOvertime = percentOvertimeArray[2];
        } else if (overtime == 4) {
            percentOvertime = percentOvertimeArray[3];
        } else {
            percentOvertime = percentOvertimeArray[4];
        }

        overtimeComp = percentOvertime * basicSalary * overtime;
        totalSalary = basicSalary + overtimeComp;

        System.out.println("Jumlah penghasilan: " + String.format("%.2f", totalSalary));

        scanner.close();
    }
}
