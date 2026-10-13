public class TestaCB {
    public static void main(String[] args){
       ContaBancaria cb1 =
                new ContaBancaria("Ana Souza", "1001", 500.0);
        ContaBancaria cb2 =
                new ContaBancaria("Carlos Lima", "1002", 1000.0);
       ContaBancaria cb3 = new ContaBancaria();

       cb1.depositar(200);
       cb1.saque(150);
       cb1.mostra();
       cb2.depositar(50);
       cb2.mostra();
    }
}
