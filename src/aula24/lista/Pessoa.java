package aula24.lista;

import java.io.Serializable;

public class Pessoa {


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        private String nome;

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        private String sobrenome;
        @Override

        public String toString(){
            return "nome: "+nome+" "+sobrenome;
        }
    }

