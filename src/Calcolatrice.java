public class Calcolatrice {

    //Metodo somma
    public int somma(int x, int y){
        return x + y;
    }

    //Metodo sottrazione
    public int sottrazione(int x, int y){
      return x - y;
    }

    ///Metodo moltiplicazione
    public int moltiplicazione(int x, int y){
        return x * y;
    }

    ///Metodo divisione
    public int divisione(int x, int y) throws Exception {
        if(y==0){
            throw new DivisionePerZero();
        }
        return x / y;
    }

}
