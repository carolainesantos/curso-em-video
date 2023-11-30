import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idiomaPadrao = Locale.getDefault();
        
        // Obtém o idioma e o país do sistema
        String idioma = idiomaPadrao.getLanguage();
        String pais = idiomaPadrao.getCountry();
        
        System.out.println("O idioma do sistema é: " + idioma);
        System.out.println("O país do sistema é: " + pais);
    }
}
