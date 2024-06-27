package Abstract;

public class LearnAbstract  {



}

class Car extends Vehicle{

    @Override
    void accelerate() {

    }

    @Override
    int breaks(int wheels) {
        return 0;
    }
}

abstract class Vehicle{
    abstract void accelerate();

    abstract int breaks(int wheels);
}
