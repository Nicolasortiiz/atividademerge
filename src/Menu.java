public class Menu {
    public void ImprimirUsuario(Usuario usuario){
        System.out.println("Nome:"+usuario.getNome());
        System.out.println("Email:"+usuario.getEmail());
        System.out.println("CPF:"+usuario.getCpf());
        System.out.println("Idade:"+usuario.getIdade());
    }
}
