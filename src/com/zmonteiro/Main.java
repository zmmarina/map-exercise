package com.zmonteiro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Long> states = new LinkedHashMap(){{
            put("PE", 96_166_21L);
            put("AL", 3_351_543L);
            put("CE", 9_187_103L);
            put("RN", 3_534_265L);
        }};

        states.put("RN", 3_534_165L);
       if(states.containsKey("PB") == false){
           states.put("PB", 4_039_277L);
       }

        System.out.println("The population of PE is: " + states.get("PE"));
        System.out.println(states);

        Long smallestPopulation = Collections.min(states.values());
        Set<Map.Entry<String, Long>> entries = states.entrySet();
        String smallestState = " ";
        for(Map.Entry<String, Long> entry : entries){
            if(entry.getValue().equals(smallestPopulation)){
                smallestState = entry.getKey();
            }
        }
        System.out.println("The smallest state is: " + smallestState + " with population: " + smallestPopulation);

        Long biggestPopulation = Collections.max(states.values());
        Set<Map.Entry<String, Long>> entries1 = states.entrySet();
        String biggestState = " ";
        for(Map.Entry<String, Long> entry : entries1){
            if(entry.getValue().equals(biggestPopulation)){
                biggestState = entry.getKey();
            }
        }
        System.out.println("The biggest state is: " + biggestState + " with population: " + biggestPopulation);

        Iterator<Long> iterator = states.values().iterator();
        Long sum = 0L;
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println("The sum of all populations is: " + sum);

        System.out.println("The average population is: " + sum / states.size());

        Iterator<Long> iterator1 = states.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4_000_000){
                iterator1.remove();
            }
        }
        System.out.println(states);

        states.clear();
        System.out.println(states.isEmpty());

















    }
}
