
public class TesteArrayReferencias {

  public static void main(String[] args) {

    // int[] idades = new int[5];
    Object[] referencias = new Object[5];

    ContaCorrente cc1 = new ContaCorrente(22, 11);
    referencias[0] = cc1;

    ContaPoupanca cp1 = new ContaPoupanca(22, 22);
    referencias[1] = cp1;

    Cliente cliente = new Cliente();
    referencias[2] = cliente;

    // Object referenciaGenerica = contas[1];
    //
    // System.out.println( referenciaGenerica.getNumero() );
    //
    ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast
    System.out.println(ref.getNumero());
    System.out.println(cp1.getNumero());

  }

}
