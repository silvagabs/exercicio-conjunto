public class Linguagem implements Comparable<Linguagem>{
     
        private String nome;
        private String ide;
        private Integer ano;

        public Linguagem (String nome, String ide, Integer ano){
            this.nome= nome;
            this.ide= ide;
            this.ano= ano;
        }

        public String getNome() {
            return nome;
        }

        public String getIde() {
            return ide;
        }

        public Integer getAno() {
            return ano;
        }

        @Override
        public String toString() {
            return "Linguagem [nome=" + nome + ", ide=" + ide + ", ano=" + ano + "]";
        }

        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            // TODO Auto-generated method stub
            return super.hashCode();
        }

        @Override
        public int compareTo(Linguagem o) {
            // TODO Auto-generated method stub
            return 0;
        }

        

       

        
        

    }

