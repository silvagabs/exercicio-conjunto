
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
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

        System.out.println("\nOrdem por IDE:\n");                

        List<Linguagem> linguagemFav4= new ArrayList<Linguagem>(linguagemFav);
        
        Collections.sort(linguagemFav4, new Comparator<Linguagem>() {
            @Override
            public int compare(Linguagem l1, Linguagem l2) {
                return l1.getIde().compareTo(l2.getIde());
            }
        });

        for (Linguagem linguagem:linguagemFav4) System.out.println(linguagem.getNome()+"-"
                        + linguagem.getIde()+"-"+linguagem.getAno());

        System.out.println("\nOrdem por ano e nome:\n");                

                        Comparator<Linguagem> comparador = Comparator
                        .comparing(Linguagem::getAno)
                        .thenComparing(Linguagem::getNome);

        Set<Linguagem> linguagemFav5=new TreeSet<Linguagem>(comparador){{

            add(new Linguagem("Java","VsCode",1995));
            add(new Linguagem("Python","IntelliJ", 1991));
            add(new Linguagem("C++","Eclipse", 1990));

        }};         
        for (Linguagem linguagem:linguagemFav5) System.out.println(linguagem.getNome()+"-"
                        + linguagem.getIde()+"-"+linguagem.getAno());   
                        
        System.out.println("\nOrdem por nome, ano e ide:\n");

                        Comparator<Linguagem> comparador2 = Comparator
                        .comparing(Linguagem::getNome)
                        .thenComparing(Linguagem::getAno)
                        .thenComparing(Linguagem::getIde);

         Set<Linguagem> linguagemFav6=new TreeSet<Linguagem>(comparador2){{

            add(new Linguagem("Java","VsCode",1995));
            add(new Linguagem("Python","IntelliJ", 1991));
            add(new Linguagem("C++","Eclipse", 1990));
                
        }};         
        for (Linguagem linguagem:linguagemFav6) System.out.println(linguagem.getNome()+"-"
                        + linguagem.getIde()+"-"+linguagem.getAno()); 

    }
}
