import java.util.Arrays;

public class ExemploAdicionarElementoArray {
    public static void main(String[] args) {
        // Array original
        int[] array = {1, 2, 3, 4, 5};
        
        // Valor a ser adicionado ao array
        int novoElemento = 6;
        
        // Criar um novo array com tamanho maior
        int[] novoArray = new int[array.length + 1];
        
        // Copiar os elementos do array original para o novo array
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }
        
        // Adicionar o novo elemento ao final do novo array
        novoArray[array.length] = novoElemento;
        
        // Atualizar a referência para o novo array
        array = novoArray;
        
        // Exibir o array atualizado
        System.out.println(Arrays.toString(array));
    }
}