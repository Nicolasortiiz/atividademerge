public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Usuario usuario1 = new Usuario("usuario1","teste@gmail.com","Teste123",20,99999999);
        Usuario usuario2 = new Usuario("usuario2","teste@outlook.com","Teste321",30,22299999);
        Usuario usuario3 = new Usuario("usuario3","teste@yahoo.com","Teste456",40,99111999);

        menu.ImprimirUsuario(usuario1);
        menu.ImprimirUsuario(usuario2);
        menu.ImprimirUsuario(usuario3);


    }
}