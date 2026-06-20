interface Playable{
    public void play();
}
class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Guitar Playing");
    }
}
class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("piano Playing");
    }
}
class inter1{
    public static void main(String args[]){
        Playable g=new Guitar();
        Playable p=new Piano();
        g.play();
        p.play();
    }
}