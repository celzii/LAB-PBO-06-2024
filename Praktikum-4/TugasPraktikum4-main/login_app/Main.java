package login_app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;


public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    static User user = new User(null, null, null, 0, null, null);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = 0; // Initialize selectMenu
        try {
            selectMenu = sc.nextInt();
            sc.nextLine(); 
        } catch (InputMismatchException e) {
            System.out.println(e + " Pilihan tidak valid!");
        }
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
                break;
            default:
                System.out.println("\nPilihan tidak valid!\nSilahkan pilih kembali.");
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.next();
        while (true) {
            // Cek apakah username sudah digunakan
            boolean isUsernameTaken = false;
            for (User user : listUser) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Username sudah digunakan, silakan masukkan username lain.");
                    isUsernameTaken = true;
                    runApp();
                }
            }
            if (!isUsernameTaken){
                break;
            }
        }
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;  // Inisialisasi userIndex dengan -1, yang berarti belum ditemukan
        for (int i = 0; i < listUser.size(); i++) {
            // Mengecek apakah user index ke i dari listUser memiliki username yang sama
            // dengan username yang diinput.
            if(listUser.get(i).getUsername().equals(username)) {
                // Jika sama, ganti userIndex dengan i dan hentikan perulangan
                userIndex = i;
                break;
            }
        }
    
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1 && userIndex < listUser.size() && userIndex < listUserProfile.size()) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();
    
            // Mengecek apakah password dari User yang login berdasarkan username
            // sama dengan password yang diinput sebelumnya, kemudian simpan
            // hasilnya di variabel isPasswordMatch
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
    
            // Jika password cocok maka tampilkan menu utama
            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                // panggil method showDetailUser dan kirimkan data Profile User yang login
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            } 
        } else {
            // userIndex tidak ditemukan, lakukan sesuatu yang lain
            // misalnya, memberi tahu pengguna bahwa username tidak ditemukan
            System.out.println("Username tidak ditemukan");
        }
    }
    

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        while (true) {
            // Cek apakah username sudah digunakan
            boolean isUsernameTaken = false;
            for (User user : listUser) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Username sudah digunakan, silakan masukkan username lain.");
                    isUsernameTaken = true;
                    runApp();
                }
            }
            if (!isUsernameTaken){
                break;
            }
        }
        if (username.isEmpty()) {
            System.out.println("Username field cannot be empty.");
            runApp();
        }
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        if (password.length() <  8) {
            System.out.println("Password harus lebih dari 8 karakter!");
            runApp();
        }
        //tambahan
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and password fields cannot be empty.");
            return;
        }
        /*
         * TODO
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User newUser = new User(username, password);
        listUser.add(newUser);

        // // // Menampilkan detail user yang sudah terdaftar

        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile();

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        /*
         * TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        /*
         * TODO
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        String  nickName = StringUtils.getNickName(profile.getFullName());
        profile.setNickName(nickName);

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        /*
         * TODO *
         * Tampilkan semua data profile user yang login
         */
        profile.showProfile();
    }

    public static String getNickName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            return "";
        }
        // Misalnya, nickname adalah kata pertama dalam nama lengkap
        return fullName.split(" ")[0];
    }
    
    //Metode setter dan getter
    public static ArrayList<User> getListUser() {
        return listUser;
    }

    public static void setListUser(ArrayList<User> listUser) {
        Main.listUser = listUser;
    }

    public static ArrayList<Profile> getListUserProfile() {
        return listUserProfile;
    }

    public static void setListUserProfile(ArrayList<Profile> listUserProfile) {
        Main.listUserProfile = listUserProfile;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        Main.user = user;
    }
}