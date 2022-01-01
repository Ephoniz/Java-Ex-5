package com.modelsFC;

public class Main {
    public static void main(String[] args) {
        CandidatosList candidatos = new CandidatosList();

        Student student1 = new Student("Juan", "Malaga", "España", "23423490234", "email3@gmail.com", "Remoto", true, "url", "url2");
        Student student2 = new Student("Fran", "Malaga", "España", "23847829374", "email@gmail.com", "Remoto", true, "url", "url2");
        Student student3 = new Student("Antonio", "Lima", "Peru", "324234234", "peruano@gmail.com", "Remoto", false, "url", "url2");
        Student student4 = new Student("Ricardo", "Madrid", "España", "543453", "madrileño@gmail.com", "Presencial", false, "url", "url2");
        Student student5 = new Student("Marta", "Malaga", "España", "34534532", "valenciana@gmail.com", "Presencial", false, "url", "url2");
        Student student6 = new Student("Mbappé", "Lima", "Russia", "23847829374", "psg@gmail.com", "Remoto", true, "url", "url2");
        Student student7 = new Student("Manuel", "Saint Petersburg", "Russia", "23847829374", "russian@gmail.com", "Presencial", true, "url", "url2");

        candidatos.addCandidato(student1);
        candidatos.addCandidato(student2);
        candidatos.addCandidato(student3);
        candidatos.addCandidato(student4);
        candidatos.addCandidato(student5);
        candidatos.addCandidato(student6);
        candidatos.addCandidato(student7);

        candidatos.imprimeCiudadesTop();
        candidatos.imprimePaisesTop();

        System.out.println(candidatos.totalRemotos());
        System.out.println(candidatos.totalPosibilidadTraslado());
        System.out.println(candidatos.totalPresencialSinTraslado());

        System.out.println(candidatos.searchEmail("email@gmail.com").toString());
    }
}
