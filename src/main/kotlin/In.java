public interface In {
    public default String getValue(){
        return "In";
    }
}

interface Out {
    public default String getValue(){
        return "Out";
    }
}

class Computer implements In, Out{

    @Override
    public String getValue() {
        return In.super.getValue();
    }
}