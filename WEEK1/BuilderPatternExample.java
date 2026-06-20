 class Computer{
    private String CPU;
    private int ram;
    private int Storage;
    private Computer(Builder builder){
        this.CPU=builder.CPU;
        this.ram=builder.ram;
        this.Storage=builder.Storage;
    }
    void getCPU(){
        System.out.println(CPU);
    }
    public static class Builder{
        private String CPU;
        private int ram;
        private int Storage;
        public Builder setCPU(String CPU){
            this.CPU=CPU;
            return this;
        } 
        public Builder setram(int ram){
            this.ram=ram;
            return this;
        } 
        public Builder setStorage(int storage){
            this.Storage=storage;
            return this;
        } 
        public Computer build(){
            return new Computer(this);
        }
    }
}
public class BuilderPatternExample{
    public static void main(String args[]){
        Computer c1=new Computer.Builder().setCPU("i7 14th").setram(16).setStorage(1).build();
       c1.getCPU();
    }
    
}