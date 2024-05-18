package soal_kedua;

class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;
    private int finishTime = 0;

    //CONSTRUCTOR
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wordsTyped = "";
        this.wpm = wpm;
        this.typeRacer = typeRacer;
    }

    public void addWordToTyped(String newWordsTyped){
        this.wordsTyped += newWordsTyped + " ";
    }
    
    //SETTER GETTER
    public String getWordsTyped() {
        return wordsTyped;
    }

    public void setWordsTyped(String wordsTyped) {
        this.wordsTyped = wordsTyped;
    }
    
    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public int getFinishTime() {
        return finishTime;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        int timePerWord = (int) (60000/ wpm); 
        for (String word : wordsToType) {
            addWordToTyped(word);
            try { 
                // Sleep for the desired time per word
                Thread.sleep(timePerWord);
                finishTime += timePerWord;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // this.addWordToTyped("selesai");
        typeRacer.addResult(this);
    }
}
