import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Jwbn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tanggal (format: dd-MM-yy):");
        String input = scanner.nextLine();
        try {
            System.out.println(convertDate(input));
        } catch (Exception e) {
            System.out.println("Tanggal yang Anda masukkan tidak sesuai format. Silahkan coba lagi dengan format dd-MM-yy.");
        }
    }

    public static String convertDate(String input) throws ParseException {
        SimpleDateFormat formatInput = new SimpleDateFormat("dd-MM-yy");
        SimpleDateFormat formatOutput = new SimpleDateFormat("d MMMM yyyy");
        Date date = formatInput.parse(input);
        return formatOutput.format(date);
    }
}
