public class Menu {

    public void ImprimirUsuario(Usuario usuario) {
        System.out.println("Nome:" + usuario.getNome());
        System.out.println("Email:" + usuario.getEmail());
        System.out.println("CPF:" + usuario.getCpf());
        System.out.println("Idade:" + usuario.getIdade());
    }

    public void MenuCadastro(){
        System.out.println("Nome: ");
        System.out.println("Email: ");
        System.out.println("Senha: ");
        System.out.println("Idade: ");
        System.out.println("CPF: ");

    }
}
