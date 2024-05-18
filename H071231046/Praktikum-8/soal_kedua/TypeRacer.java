
package soal_kedua;

import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<Typer>();
    private ArrayList<Result> raceStanding = new ArrayList<Result>();
    private boolean running = true;

    public String getWordsToType() {
        return wordsToType;
    }
    
    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    //Word by Yusuf Syam, Silahkan diubah jika dirasa kurang bijak
    private String[] wordsToTypeList = {"Menuju tak terbatas dan melampauinya",
                "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
                "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
                "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
                "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
                "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
                "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
                "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
                "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
                "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"};
    
    public void setNewWordsToType(){
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        this.wordsToType = wordsToTypeList[angkaRandom];
    }

    //JWBN TDO 4
    public void addResult(Typer typer) {
        Result result = new Result(typer.getBotName(), typer.getFinishTime());
        raceStanding.add(result);
    }

    //JWBN TDO 5
    private void printRaceStanding(){
        System.out.println("Selesai");
        System.out.println();
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        for (int i = 0; i < raceStanding.size(); i++) {
            System.out.printf("%d. %s = %.2fs\n", i+1, raceStanding.get(i).getName(), raceStanding.get(i).getFinishTime()/1000);
        }
    }

    //JWBN TDO 6
    public void startRace() {
        // Start the typing progress thread
        new Thread(() -> {
            while (running) {
                printTypingProgress();
    
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }).start();
    
        // Start the race threads
        for (Typer typer : raceContestant) {
            typer.start();
        }
    
        // Wait for the race threads to finish
        for (Typer typer : raceContestant) {
            try {
                typer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        running = false;
        printRaceStanding();
    }

    //JWBN TO DO 7
    public void printTypingProgress() {
        System.out.println("\nTyping...");
        System.out.println("---------");

        //JWBN TO DO 8
        for (Typer typer : raceContestant) {
            System.out.printf("- %s\n=>  %s\n\n", typer.getBotName(), typer.getWordsTyped());
        }
    }
    

}
