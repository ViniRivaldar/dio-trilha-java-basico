public class MinhaClasse{
    public static void main(String[] args){

        String primeironome = "Vinicius";
        String segundonome = "Rivaldar";

        String nomecompleto = nomeCompleto(primeironome, segundonome);
        System.out.print(nomecompleto);
    }
    public static String nomeCompleto (String primeironome, String segundonome){
        return "Resultado do metodo " + primeironome.concat(" ").concat(segundonome);
    }
}