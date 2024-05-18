package soal_kedua;

public class Result {
    private String name;
    private double finishTime;

    public Result(String name, double finishTime){
        this.name = name;
        this.finishTime = finishTime;
    }

    //SETTER GETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}
