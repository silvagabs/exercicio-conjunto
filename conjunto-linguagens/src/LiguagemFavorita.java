import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LiguagemFavorita {
    public static void main(String[] args)  {

        System.out.println("Ordem aleatória:\n");
      
        Set<Linguagem> linguagemFav=new HashSet<Linguagem>(){{

            add(new Linguagem("Java","VsCode",1995));
            add(new Linguagem("Python","IntelliJ", 1991));
            add(new Linguagem("C++","Eclipse", 1990));

        }};

        for (Linguagem linguagem:linguagemFav) System.out.println(linguagem.getNome()+"-"
                        + linguagem.getIde()+"-"+linguagem.getAno());


        System.out.println("\nOrdem inserção:\n");                

        Set<Linguagem> linguagemFav2=new LinkedHashSet<Linguagem>(){{

            add(new Linguagem("Java","VsCode",1995));
            add(new Linguagem("Python","IntelliJ", 1991));
            add(new Linguagem("C++","Eclipse", 1990));

        }};
        
        for (Linguagem linguagem:linguagemFav2) System.out.println(linguagem.getNome()+"-"
                        + linguagem.getIde()+"-"+linguagem.getAno());

        System.out.println("\nOrdem natural (nome):\n");
        
        Set<Linguagem> linguagemFav3=new TreeSet<Linguagem>(linguagemFav);

        for (Linguagem linguagem:linguagemFav3) System.out.println(linguagem.getNome()+"-"
                        + linguagem.getIde()+"-"+linguagem.getAno());
    }
}
