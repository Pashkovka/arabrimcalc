public enum Rimnum {
    I(1),II(2),III(3),IV(4),V(5),VI(6),VII(7),
    VIII(8),IX(9),X(10),XI(11);
    private int number;
    Rimnum (int number){
        this.number = number;
    };
    public int getNumber(){
        return number;
    }

}
