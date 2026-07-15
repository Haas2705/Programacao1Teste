public class MainE1 {
    public static void main(String[] args) {
        int contador = 0;
        String[] carros = {"Fusca", "Kombi", "Gol", "Ferrari"};

        for (String i : carros) {
            contador = ++contador;
            //System.out.println("Carro " + contador + ": " + i);
        }

        System.out.println(contador);
        
    }
}