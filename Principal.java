public class Principal {
  public static void main(String[] args) {
    Empregado empregado = new Empregado();
    empregado.setNome("Gaby");
    empregado.setEndereco("Pompeia");
    empregado.setTelefone("14981022185");
    empregado.setSalario(20000);
    System.out.println(empregado.getNome());
    System.out.println(empregado.getEndereco());
    System.out.println(empregado.getTelefone());
    System.out.println(empregado.getSalario());


    Empregado empregado2=new Empregado();
    //setar com os seus dados
   empregado2.setNome("Gaby");
   empregado2.setEndereco("Pompeia"); 
   empregado2.setEndereco("Rua da Pamonha");
   empregado2.setSalario(2000);
   System.out.println(empregado2.getNome());
  }  
}
