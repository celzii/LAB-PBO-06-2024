package login_app.utils;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] words = fullName.split(" ");
        if (words.length > 1) {
            return words[1]; // Return the second word if fullName has more than one word
        } else {
            return words[0]; // Return the fullName itself if it's only one word
        }
    }

    /*TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
}
