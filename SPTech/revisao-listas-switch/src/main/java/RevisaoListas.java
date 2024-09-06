import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {
    public static void main(String[] args) {
//        List<String> frutas = new ArrayList<>();
//        frutas.add("Laranja");
//        frutas.add("Goiaba");
//
//        System.out.println(frutas);

        List<String> frutasImutavel = List.of("Laranja", "Goiaba", "Limão");
//        System.out.println(frutasImutavel);
//        frutasImutavel.add("maça");
//        System.out.println(frutasImutavel);


//        List<String> frutasMutavel = new ArrayList<>(List.of("Laranja", "Goiaba", "Limão"));
//
//        frutasMutavel.add("maça");
//        System.out.println(frutasMutavel);
//
//        frutasMutavel.set(2, "uva");
//        System.out.println(frutasMutavel);
//
//        System.out.println(frutasMutavel.get(0));
//
//        frutasMutavel.remove(0);
//        System.out.println(frutasMutavel);
//
//        frutasMutavel.remove("Goiaba");
//        System.out.println(frutasMutavel);

        System.out.println("Interando Lista com for:");
        for (int i = 0; i < frutasImutavel.size(); i++){
            System.out.println(frutasImutavel.get(i));
        }

        System.out.println("\nInterando lista com for aprimorado:");
        for (String frutaDaVez : frutasImutavel) {
            System.out.println(frutaDaVez);
        }
    }
}
