// //TP1 NOMOR 1
// import java.util.Scanner;
// public class BilanganPrima  {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int countIntegers = 0;
//         int countDecimals = 0;

//         try {
//             int n = Integer.parseInt(scanner.nextLine());

//             for (int i = 0; i < n; i++) {
//                 String input = scanner.next();
//                 try {
//                     double number = Double.parseDouble(input);
//                     if (number % 1 == 0) {
//                         countIntegers++;
//                     } else {
//                         countDecimals++;
//                     }
//                 } catch (NumberFormatException ex) {
//                 }
//             }

//             System.out.println(countIntegers + " Bilangan Bulat");
//             System.out.println(countDecimals + " Bilangan Desimal");
//         } catch (NumberFormatException e) {
//             System.out.println("Input harus berupa angka.");
//         } finally {
//             scanner.close();
//         }
//     }
// }

// // // TP1 NOMOR 2
// import java.util.Scanner;

// public class BilanganPrima  {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Masukkan Judul Film:");
//         String input = scanner.nextLine();

//         String output = kapital(input);
//         System.out.println(output);

//         scanner.close();
//     }

//     public static String kapital(String input) {
//         String[] words = input.split(" ");

//         StringBuilder result = new StringBuilder();

//         // Loop melalui setiap kata
//         for (String word : words) {
//             if (!word.isEmpty()) {
//                 result.append(Character.toUpperCase(word.charAt(0)))
//                       .append(word.substring(1).toLowerCase());
//             }
//             result.append(" "); 
//         }

//         return result.toString().trim();
//     }
// }

// // TP1 NOMOR 3 

// import java.util.Scanner;

// public class BilanganPrima {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         String inputTgl=scanner.nextLine();
//         System.out.println(ubahTgl(in01putTgl));
//         scanner.close();
//     }

//     public static String ubahTgl(String inputTgl) {
//         String[] bagian=inputTgl.split("-");

//         int hari=Integer.parseInt(bagian[0]);
//         int tahun=Integer.parseInt(bagian[2]);

//         tahun+=2000;

//         String bulan = ubahBulan(bagian[1]);

//         return hari+" "+bulan+" "+tahun;
//     }

//     private static String ubahBulan(String nomorBulan) {
//         String[] bulanBulan = {
//             "Januari", "Februari", "Maret", "April", "Mei", "Juni",
//             "Juli", "Agustus", "September", "Oktober", "November", "Desember"
//         };

//         int indeksBulan = Integer.parseInt(nomorBulan) - 1; //kasih sesuai dengan indeks, bulan 1 itu indeks 0

//         return bulanBulan[indeksBulan];
//     }
// }

// TP 1 NOMOR 4
// import java.util.Scanner;

// public class BilanganPrima {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double radius = 0;

//         try {
//             System.out.print("Masukkan angka:");
//             radius = scanner.nextDouble();
//         } catch (Exception e) {
//             System.out.println("Masukan tidak valid. Pastikan Anda memasukkan angka.");
//             scanner.close(); 
//             return;
//         }

//         scanner.close(); 

//         double area = Math.PI * radius * radius;
//         System.out.printf("%.2f\n", area);
//     }
// }

// TP1 NOMOR 5
// import java.util.Scanner;

// public class BilanganPrima {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int x = input.nextInt();
//         int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
//         for (int i = 0; i < nums.length; i++){
//             for (int j = 0; j < nums[i].length; j++){
//                 if (nums[i][j] == x) {
//                     System.out.println("Found " + x + " at [" + i + "][" + j + ']');
//                     break;
//                 }
//             }
//         }
//         input.close();
//     }
// }

// import java.until.scanner;

// public class BilanganPrima {
//     public static void main {string []args} {
//         Scanner input = new Scanner(System.in);

//         try{
//             System.out.println("masukkan angka: ");

//         }
//     }