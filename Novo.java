public class Novo extends Imovel{
   double adicional;

public double getAdicional() {
    return adicional;
}

public void setAdicional(double adicional) {
    this.adicional = adicional;
}

   public double valorFinal(){
    double total = getPreco()+getAdicional();
    return total;
   }
   
}
