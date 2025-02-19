public class App {
    // Variáveis globais (de instância e de classe)
    static int contador = 0; // Variável de classe (compartilhada entre todos os objetos)
    String mensagem = "Olá, mundo!"; // Variável de instância (pertence a cada objeto)

    public static void main(String[] args) {
        // 🔹 Tipos primitivos numéricos inteiros
        byte b = 127; // 8 bits
        short s = 32000; // 16 bits
        int i = 2147483647; // 32 bits
        long l = 9223372036854775807L; // 64 bits (precisa do "L" no final)

        // 🔹 Tipos primitivos numéricos de ponto flutuante
        float f = 3.14F; // 32 bits (precisa do "F" no final)
        double d = 3.141592653589793; // 64 bits

        // 🔹 Tipos primitivos booleano e caractere
        boolean ativo = true; // true ou false
        char letra = 'A'; // Um único caractere (16 bits Unicode)

        // 🔹 Tipo referência: String (texto)
        String nome = "João"; // Classe String para armazenar textos

        // 🔹 Array (tipo referência)
        int[] numeros = {1, 2, 3, 4, 5}; // Array de inteiros

        // Exibindo valores
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + ativo);
        System.out.println("Char: " + letra);
        System.out.println("String: " + nome);
        System.out.println("Array primeiro valor: " + numeros[0]);

        // 🔹 Conversão implícita (Widening - seguro)
        int num1 = 100;
        double num2 = num1; // int → double (automático)
        System.out.println("Conversão implícita (int → double): " + num2);

        // 🔹 Conversão explícita (Narrowing - pode perder precisão)
        double num3 = 9.7;
        int num4 = (int) num3; // double → int (perde a parte decimal)
        System.out.println("Conversão explícita (double → int): " + num4);

        // 🔹 Criando um objeto da própria classe App
        App obj = new App();
        System.out.println("Mensagem da variável de instância: " + obj.mensagem);

        // 🔹 Modificadores de acesso (exemplo)
        Pessoa pessoa = new Pessoa("Carlos", 30);
        System.out.println("Nome: " + pessoa.getNome()); // Método público acessa variável privada
    }
}

// 🔹 Classe com modificadores de acesso
class Pessoa {
    private String nome; // Variável privada (só pode ser acessada dentro da classe)
    protected int idade; // Protegida (acessível no mesmo pacote e subclasses)

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método público para acessar variável privada
    public String getNome() {
        return nome;
    }
}
