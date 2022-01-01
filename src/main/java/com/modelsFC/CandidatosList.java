package com.modelsFC;

import java.util.*;
import java.util.stream.Collectors;

public class CandidatosList {
    List<Student> candidatos = new ArrayList<Student>();

    public void addCandidato(Student newStudent){
        candidatos.add(newStudent);
    }

    public void deleteCandidato(Student currentStudent){
        candidatos.remove(currentStudent);
    }

    public List<Student> getCandidatos() {
        return candidatos;
    }

    public List<Student> filter(String ciudad){
        return candidatos.stream().filter(p -> Objects.equals(p.city, ciudad)).toList();
    }

    public List<Student> filterPresence(String presence){
        return candidatos.stream().filter(p -> Objects.equals(p.presence, presence)).toList();
    }

    public List<Student> filter(boolean transfer){
        return candidatos.stream().filter(p -> Objects.equals(p.transfer, transfer)).toList();
    }

    public List<Student> filter(String ciudad, String presence, boolean transfer){
        return candidatos.stream().filter(p -> (Objects.equals(p.city, ciudad) && Objects.equals(p.presence, presence) && p.transfer == transfer)).toList();
    }

    public Student searchEmail(String email){
        for (Student candidato : candidatos) {
            if (candidato.email.equals(email)){
                return candidato;
            }
        }
        return null;
    }

    public Student searchPhoneNumber(String phone_number){
        for (Student candidato : candidatos) {
            if (candidato.phone_number.equals(phone_number)){
                return candidato;
            }
        }
        return null;
    }

    public void imprimeCiudadesTop(){
        HashMap<String, Integer> map = new HashMap<>();
        for (Student candidato : candidatos) {

            if (map.containsKey(candidato.city)) {
                int c = map.get(candidato.city);
                map.replace(candidato.city, c + 1);
            } else
                map.put(candidato.city, 1);
        }

        Object[] a = map.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });

        for (Object e : a) {
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
                    + ((Map.Entry<String, Integer>) e).getValue());
        }

    }

    public void imprimePaisesTop(){
        HashMap<String, Integer> map = new HashMap<>();
        for (Student candidato : candidatos) {

            if (map.containsKey(candidato.country)) {
                int c = map.get(candidato.country);
                map.replace(candidato.country, c + 1);
            } else
                map.put(candidato.country, 1);
        }

        Object[] a = map.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });

        for (Object e : a) {
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
                    + ((Map.Entry<String, Integer>) e).getValue());
        }

    }

    public int totalRemotos(){
        return candidatos.stream().filter(candidato -> Objects.equals(candidato.presence, "Remoto")).map(e -> 1).reduce(0, Integer::sum);
    }

    public int totalPosibilidadTraslado(){
        return candidatos.stream().filter(candidato -> candidato.transfer).map(e -> 1).reduce(0, Integer::sum);
    }

    public int totalPresencialSinTraslado(){
        return candidatos.stream().filter(candidato -> (!candidato.transfer && candidato.presence == "Presencial")).map(e -> 1).reduce(0, Integer::sum);
    }
}
