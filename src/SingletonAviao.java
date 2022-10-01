public class SingletonAviao {

    private static Aviao aviao = null;

    private SingletonAviao(){

    }

    public static synchronized Aviao getInstance(){
        if(aviao == null){
            return new Aviao();
        }
        return aviao;
    }

}
