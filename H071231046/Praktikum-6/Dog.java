public abstract class Dog {
    int position;
    int averageLength;
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    abstract public void move();
    abstract public void describe();

}

class Pitbull  extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("The pitbull new  position is " + this.position);
    }

    @Override
    public void describe() {
        System.out.println("Pitbull is a breed of dog that is strong and brave.");
    }

}

class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("The siberian husky new position is " + this.position);
    }

    @Override
    public void describe() {
        System.out.println("The Siberian Husky is a friendly breed of dog that loves to play.");
    }
}

class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 1;
        System.out.println("The bulldog moved one step forward. New Position: " + this.position);
    }

    @Override
    public void describe() {
        System.out.println("The Bulldog is a calm and loyal breed of dog.");
    }

}

class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("The German Shepherd can jump over obstacles! New Position: " + this.position);
    }

    @Override
    public void describe() {
        System.out.println("The German Shepherd is a smart and protective breed of dog.");
    }

}

