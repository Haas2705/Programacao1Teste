import java.util.Arrays;

public class ExemploExcluirElementoArray {
    public static void main(String[] args) {
        // Array original
        int[] array = {1, 2, 3, 4, 5};
        
        // Índice do elemento a ser excluído
        int indiceExcluir = 2;
        
        // Criar um novo array com tamanho menor
        int[] novoArray = new int[array.length - 1];
        
        // Copiar os elementos anteriores ao elemento a ser excluído
        for (int i = 0; i < indiceExcluir; i++) {
            novoArray[i] = array[i];
        }
        
        // Copiar os elementos após o elemento a ser excluído
        for (int i = indiceExcluir + 1; i < array.length; i++) {
            novoArray[i - 1] = array[i];
        }
        
        // Atualizar a referência para o novo array
        array = novoArray;
        
        // Exibir o array atualizado
        System.out.println(Arrays.toString(array));
    }
}
