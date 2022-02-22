public class Principal {
    public static void main(String[] args){
        Novo novo= new Novo();
        novo.setEndereco("Kajiro Tahira");
        novo.setPreco(200000);;
        novo.setAdicional(260000);

        Velho velho= new Velho();
        velho.setEndereco("Kajiro Tahira");
        velho.setPreco(180000);
        velho.setDesconto(172500);

        System.out.println("---------------------");
        System.out.println(" Imovel Novo ");
        System.out.println(novo.getEndereco());
        System.out.println(novo.getPreco());
        System.out.println(novo.valorFinal());
        System.out.println("---------------------");

        System.out.println("Imovel Velho ");
        System.out.println(velho.getEndereco());
        System.out.println(velho.getPreco());
        System.out.println(velho.valorDesconto());
        System.out.println("---------------------");
    }
    
}
